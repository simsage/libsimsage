#
# A simple example, signing in, and returning a list of sources, print their names and start/stop times
#
# - you must have an administrator or manager role associated with your account for this to work
# - your session is refreshed automatically with each call until it expires (1 hour default / configurable on the platform)
#

import requests
from datetime import datetime

# the SimSage system to talk to
api_base = "https://test.simsage.ai/api"

# default organisation and knowledgebase id
organisation_id = "c276f883-e0c8-43ae-9119-df8b7df9c574"
kb_id = "46ff0c75-7938-492c-ab50-442496f5de51"

# your API credentials, as set up in your admin UX
email = "rock@simsage.co.uk"
pwd = ""


# sign-into SimSage and return a session
def sign_in(username, password):
    data = {"email": username, "password": password}
    url = api_base + "/auth/sign-in"
    header = {"API-Version": "1", "Content-Type": "application/json"}
    x = requests.post(url, json=data, headers=header)
    json_result = x.json()
    if "error" in json_result:
        raise ValueError("sign-in:" + json_result["error"])
    if x.status_code not in range(200, 299):
        raise ValueError("sign-in: bad http status code " + str(x.status_code))
    return json_result["session"]["id"]


# get a list of sources from SimSage
def get_source_list(session_id):
    url = api_base + "/crawler/crawlers/" + organisation_id + "/" + kb_id
    header = {"API-Version": "1", "Content-Type": "application/json", "session-id": session_id}
    x = requests.get(url, headers=header)
    if x.status_code not in range(200, 299):
        raise ValueError("search: bad http status code " + str(x.status_code))
    return x.json()


# sign-in
session_id = sign_in(email, pwd)

# get the list of sources for this org/kb
source_list = get_source_list(session_id)
for source in source_list:
    source_id = source["sourceId"]
    name = source["name"]
    # divide by 1000 to take out the milliseconds
    start_time = int(source["startTime"] / 1000)
    end_time = int(source["endTime"] / 1000)
    start_time_str = datetime.utcfromtimestamp(start_time).strftime('%Y-%m-%d %H:%M:%S')
    end_time_str = datetime.utcfromtimestamp(end_time).strftime('%Y-%m-%d %H:%M:%S')
    if start_time > end_time:
        print("source \"{}\" (id {}) started {}, hasn't finished yet".format(name, str(source_id), start_time_str))
    else:
        print("source \"{}\" (id {}) started {}, finished {}".format(name, str(source_id), start_time_str, end_time_str))
