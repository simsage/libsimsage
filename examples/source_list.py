#
# Example: viewing a list of sources, with details
#
# - you must have an administrator or manager role associated with your account for this to work
#
# - your session is refreshed automatically with each call until it expires
#   (1 hour default / configurable on the platform)
#

import requests
from datetime import datetime
from common import api_base, organisation_id, kb_id
from common import pad_string, sign_in, check_ssl_certificate


# get a list of sources from SimSage
def get_source_list(session_id):
    url = api_base + "/crawler/crawlers/" + organisation_id + "/" + kb_id
    header = {"API-Version": "1", "Content-Type": "application/json", "session-id": session_id}
    x = requests.get(url, headers=header, verify=check_ssl_certificate)
    if x.status_code not in range(200, 299):
        raise ValueError("search: bad http status code " + str(x.status_code))
    return x.json()


# sign-in
session_id = sign_in()

# get the list of sources for this org/kb
source_list = get_source_list(session_id)

# pretty print
column_width = 8
header = [pad_string("id", 5),
          pad_string("name", 30),
          pad_string("crawled", column_width),
          pad_string(str("convert"), column_width),
          pad_string("parsed", column_width),
          pad_string("index", column_width),
          pad_string("finish", column_width),
          pad_string("error", column_width),
          pad_string("error", column_width),
          pad_string("total", column_width),
          "status"]

print(''.join(header))

# pretty print some of the source details
for source in source_list:
    source_id = source["sourceId"]
    name = source["name"]

    num_crawled = source["numCrawledDocuments"]
    num_converted = source["numConvertedDocuments"]
    num_parsed = source["numParsedDocuments"]
    num_indexed = source["numIndexedDocuments"]
    # version 7.15 + only, foreign language translation
    # num_translated = source["numTranslatedDocuments"]
    num_finished = source["numFinishedDocuments"]
    num_error = source["numErroredDocuments"]
    num_total_docs = source["numTotalDocuments"]
    num_total_error = source["numTotalErroredDocuments"]

    # divide by 1000 to take out the milliseconds
    start_time = int(source["startTime"] / 1000)
    end_time = int(source["endTime"] / 1000)
    start_time_str = datetime.utcfromtimestamp(start_time).strftime('%Y-%m-%d %H:%M:%S')
    end_time_str = datetime.utcfromtimestamp(end_time).strftime('%Y-%m-%d %H:%M:%S')

    if start_time > end_time:
        status = "started {}, hasn't finished yet".format(start_time_str)
    else:
        status = "started {}, finished {}".format(start_time_str, end_time_str)

    out_list = [pad_string(str(source_id), 5),
                pad_string(str(name), 30),
                pad_string(str(num_crawled), column_width),
                pad_string(str(num_converted), column_width),
                pad_string(str(num_parsed), column_width),
                pad_string(str(num_indexed), column_width),
                pad_string(str(num_finished), column_width),
                pad_string(str(num_error), column_width),
                pad_string(str(num_total_error), column_width),
                pad_string(str(num_total_docs), column_width),
                status]
    print(''.join(out_list))

