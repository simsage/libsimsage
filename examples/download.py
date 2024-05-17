#
# Example: download a document from SimSage by url
#
# - you must have an administrator or manager role associated with your account for this to work
# - your session is refreshed automatically with each call until it expires
#   (1 hour default / configurable on the platform)
#

import requests
import base64
from common import api_base, organisation_id, kb_id
from common import sign_in


def download(session_id, doc_url, output_file):
    string_bytes = doc_url.encode('utf-8')
    base64_bytes = base64.b64encode(string_bytes)
    base64_string = base64_bytes.decode('utf-8')
    url = api_base + "/dms/binary/latest/{}/{}/{}".format(organisation_id, kb_id, base64_string)
    header = {"API-Version": "1", "Content-Type": "application/json", "session-id": session_id}
    x = requests.get(url, headers=header)
    if x.status_code not in range(200, 299):
        raise ValueError("download: bad http status code " + str(x.status_code))
    with open(output_file, 'wb') as writer:
        writer.write(x.content)


# sign-in
session_id = sign_in()
# and download the file specified by document_url into output_file
document_url = '/Demo Data/Demo-Data-Inside-Sunday/Demo Data/SamplePPTFile_500kb.ppt'
output_file = 'SamplePPTFile_500kb.ppt'

download(session_id, document_url, output_file)
