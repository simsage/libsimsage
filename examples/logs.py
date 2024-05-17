#
# Example: view SimSage logs for a given SimSage service
#
# - you must have an administrator or manager role associated with your account for this to work
# - your session is refreshed automatically with each call until it expires
#   (1 hour default / configurable on the platform)
#

import requests
from datetime import datetime
from common import api_base, organisation_id
from common import sign_in, pad_string


def get_logs(session_id, simsage_service, number_of_lines):
    url = api_base + "/stats/system-logs/{}/{}/{}".format(organisation_id, simsage_service, number_of_lines)
    header = {"API-Version": "1", "Content-Type": "application/json", "session-id": session_id}
    x = requests.get(url, headers=header)
    if x.status_code not in range(200, 299):
        raise ValueError("download: bad http status code " + str(x.status_code))
    return x.json()


# sign-in
session_id = sign_in()
# get log entries for the specified service
# service is one of {web, conversion, crawler, data, discover, document, index, kb, lang, preview,
#                    search, stats, stt}
result = get_logs(session_id, simsage_service='index', number_of_lines=10)

if "logList" in result:
    # pretty print
    header = [
        pad_string("type", 10),
        pad_string("service", 10),
        pad_string("time", 25),
        "message"
    ]
    print(''.join(header))

    log_list = result["logList"]
    for log in log_list:
        # type, created, message, service, stackTrace
        log_type = log["type"]
        message = log["message"]
        service = log["service"]
        created = log["created"] / 1000
        log_time_str = datetime.utcfromtimestamp(created).strftime('%Y-%m-%d %H:%M:%S')
        out_list = [
            pad_string(log_type, 10),
            pad_string(service, 10),
            pad_string(log_time_str, 25),
            message
        ]
        print(''.join(out_list))
