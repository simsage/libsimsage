#
# Example: adding a user if he/she doesn't yet exist
#
# - you must have an administrator or manager role associated with your account for this to work
#
# - your session is refreshed automatically with each call until it expires
#   (1 hour default / configurable on the platform)
#

import requests
from common import api_base, organisation_id
from common import sign_in, check_ssl_certificate


# helper: convert a list of strings in role_list to a list of SimSage role objects
def create_roles(role_list):
    simsage_role_list = []
    for role in role_list:
        simsage_role_list.append({"organisationId": organisation_id, "role": role})
    return simsage_role_list


# helper: convert a list of strings in role_list to a list of SimSage role objects
def create_groups(group_list):
    simsage_group_list = []
    for group in group_list:
        simsage_group_list.append({"organisationId": organisation_id, "name": group, "userIdList": []})
    return simsage_group_list


#
# get an existing user by email address - use the paginate users call with the email address as filter
#
# @param session_id a valid session GUID string
# @param email a valid email address for this user (must be unique for this user's account)
# @return a user object or None if we can't find this user
def get_user(session_id, email):
    url = api_base + "/auth/users-paginated/{}/0/10/{}".format(organisation_id, email)
    header = {"API-Version": "1", "Content-Type": "application/json", "session-id": session_id}
    x = requests.get(url, headers=header, verify=check_ssl_certificate)
    json_result = x.json()
    if "error" in json_result:
        raise ValueError("get_user:" + json_result["error"])
    if x.status_code not in range(200, 299):
        raise ValueError("get_user: bad http status code " + str(x.status_code))
    if "userList" in json_result:
        user_list = json_result["userList"]
        if len(user_list) > 0:
            return user_list[0]
    return None


#
# to update an existing user, set the user_id to the guid string of the existing user
#
# @param session_id a valid session GUID string
# @param user_id to create a new user, leave user_id as an empty string
# @param email a valid email address for this user (must be unique for this user's account)
# @param password must be at least 8 characters long
# @param first_name the user's first-name
# @param surname the user's surname / family name
# @param role_list is a list of strings, where each string must be one of: {admin, manager, search, discover}
# @param group_list is a list of strings with the names of existing groups
# @return nothing
def create_or_update_user(session_id, user_id, email, password, first_name, surname, role_list, group_list):
    if len(password.strip()) < 8:
        raise ValueError("password too short")
    user_data = {
      "id": user_id, "email": email, "password": password, "firstName": first_name,
      "surname": surname, "roles": create_roles(role_list), 
      "groupList": create_groups(group_list), "operatorKBList": [], "jwtMatchNAmeValueCSV": ""
    }
    url = api_base + "/auth/user/{}".format(organisation_id)
    header = {"API-Version": "1", "Content-Type": "application/json", "session-id": session_id}
    x = requests.put(url, json=user_data, headers=header, verify=check_ssl_certificate)
    json_result = x.json()
    if "error" in json_result:
        raise ValueError("create/update user:" + json_result["error"])
    if x.status_code not in range(200, 299):
        raise ValueError("create/update user: bad http status code " + str(x.status_code))


# sign-in
session_id = sign_in()

# first let's see if that user already exists
user = get_user(session_id, "billy@simsage.ai")
if user is None:
    # create a new user (user_id is empty string, so SimSage will create a new user, however,
    # the email address must be unique! / not exist yet)
    user_id = ""
    create_or_update_user(session_id, user_id, "billy@simsage.ai", "Password12345", "Billy", "Bob",
                          ["admin", "search"],
                          ["Users", "Administrators"])
else:
    print("user exists: {}".format(str(user)))
