import base64

import requests
import time
import hashlib

#
# set these variables as you need to
#
api_base = "https://test.simsage.ai/api"

# your SimSage organisation and knowledgebase id
# careful - this could be different - these are the defaults
organisation_id = "c276f883-e0c8-43ae-9119-df8b7df9c574"
kb_id = "46ff0c75-7938-492c-ab50-442496f5de51"
# the security id of the knowledge base - view your knowledge-base in the admin UX
# this is like the password for an external crawler
sid = "1282271b-6ffe-4435-a496-52d822442fb2"
source_id = 1

# a unique id grouping files together for an upload batch
run_id = int(time.time() * 1000)


#
# upload a document to a SimSage external source
#
# url: the url / unique identifier of this item / document / record
# mime_type: the mime-type of this item (e.g. "text/html")
# metadata_map: extra metadata items in a map (e.g. {"name1": "value1", "name2": "value2"}
# binary_data: the binary data to be uploaded, default maximum allowed is 50MB
# created: a unix long (with milliseconds) representing the created date-time of this item
# last_modified: a unix long (with milliseconds) representing the created date-time of this item
def upload_document_to_external_source(url, mime_type, metadata_map, binary_data, created, last_modified):
    base64_data = base64.b64encode(binary_data).decode("utf-8")
    data = {
        'organisationId': organisation_id,
        'kbId': kb_id,
        'sid': sid,
        'sourceId': source_id,
        'url': url,
        'mimeType': mime_type,
        'puid': '',
        'acls': [],  # left blank here, which means 'no security' (apart from what the source already defines)
        'title': '',  # most binaries can get this information out of the document itself
        'author': '',
        'contentHash': hashlib.md5(binary_data).hexdigest(),
        'changeHash': hashlib.md5(binary_data).hexdigest(),
        'binarySize': len(binary_data),
        'categories': [],
        'data': ';base64,' + base64_data,
        'created': created,
        'lastModified': last_modified,
        'metadata': metadata_map,
        'runId': run_id,
    }
    url = api_base + "/crawler/external/document/upload"
    header = {"API-Version": "1", "Content-Type": "application/json"}
    x = requests.post(url, json=data, headers=header)
    # check the response
    if x.status_code not in range(200, 299):
        raise ValueError("upload_external_document: bad http status code " + str(x.status_code) +
                         "," + x.content.decode('utf-8'))
    return x.json()


# upload the README.md of this repository as an example
with open('README.md', 'rb') as reader:
    data = reader.read()

# get a timestamp for created and last_modified
now = int(time.time() * 1000)

# upload
result = upload_document_to_external_source(url='/some/unique/id',
                                            mime_type='text/plain',
                                            metadata_map={},
                                            binary_data=data,
                                            created=now,
                                            last_modified=now
                                            )

# check the result
if "error" in result and result["error"] != "":
    print("error uploading document: {}".format(result["error"]))
elif "information" in result:
    print("upload complete")
