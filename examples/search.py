#
# Example: search SimSage
#
# - you must have a search role and appropriate ACLs to view documents / results
#     without the role you won't be able to search
#     without the right ACLs you won't see a result
#
# - your session is refreshed automatically with each call until it expires
#   (1 hour default / configurable on the platform)
#

import requests
from common import api_base, organisation_id, kb_id
from common import sign_in


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
session_id = sign_in()

# then do a search for "test"
results = do_search(session_id, "test")
if "resultList" in results:
    result_list = results["resultList"]
    print("got {} results".format(str(len(result_list))))
    for result in result_list:
        print([result["url"], result["textList"]])
else:
    print("return result not understood")
    print(results)

