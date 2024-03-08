import requests

#
# set these variables as you need to
#
api_base = "https://test.simsage.ai/api"

# your SimSage organisation and knowledgebase id
# careful - this could be different - these are the defaults
organisation_id = "c276f883-e0c8-43ae-9119-df8b7df9c574"
kb_id = "46ff0c75-7938-492c-ab50-442496f5de51"

# your API credentials, as set up in your admin UX
email = "info@simsage.nz"
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


# search SimSage using a session_id, and text to search for
def do_search(session_id, text):
    data = {
        'organisationId': organisation_id,
        'kbList': [kb_id],
        'clientId': session_id,
        'semanticSearch': True,
        'query': text,
        'page': 0,
        'pageSize': 10,
        'shardSizeList': [],
        'fragmentCount': 3,
        'maxWordDistance': 40,
        'spellingSuggest': False,
    }
    url = api_base + "/semantic/query"
    header = {"API-Version": "1", "Content-Type": "application/json"}
    x = requests.post(url, json=data, headers=header)
    if x.status_code not in range(200, 299):
        raise ValueError("search: bad http status code " + str(x.status_code))
    return x.json()


# sign in first, and get a session_id
session_id = sign_in(email, pwd)

# then do a search for "test"
results = do_search(session_id, "test")
if "resultList" in results:
    result_list = results["resultList"]
    print("got {} results".format(str(len(result_list))))
    for result in result_list:
        print(result["textList"])
else:
    print("return result not understood")
    print(results)

