#
# Common settings and utilities
#

import requests

# the SimSage system to talk to
api_base = "https://test.simsage.ai/api"

# trust self-signed certificates?
# set this value to True if you want the SSL certificate to be checked for strict validity
check_ssl_certificate = False

# default organisation and knowledgebase id
organisation_id = "c276f883-e0c8-43ae-9119-df8b7df9c574"
kb_id = "46ff0c75-7938-492c-ab50-442496f5de51"

# your API credentials, as set up in your admin UX
email = "info@simsage.co.uk"
password = ""

# the security id of the knowledge base - view your knowledge-base in the admin UX
# this is like the password for an external crawler
# !! this sid and source_id value are only used by upload_document.py !!
sid = "1282271b-6ffe-4435-a496-52d822442fb2"
source_id = 1


# sign-into SimSage and return a session
def sign_in():
    data = {"email": email, "password": password}
    url = api_base + "/auth/sign-in"
    header = {"API-Version": "1", "Content-Type": "application/json"}
    x = requests.post(url, json=data, headers=header, verify=check_ssl_certificate)
    json_result = x.json()
    if "error" in json_result:
        raise ValueError("sign-in:" + json_result["error"])
    if x.status_code not in range(200, 299):
        raise ValueError("sign-in: bad http status code " + str(x.status_code))
    return json_result["session"]["id"]


def pad_string(s, size):
    """
    Pads the input string with spaces until it is exactly 30 characters long.
    If the string is already size characters or longer, it is returned unchanged.
    :param s: The input string.
    :param size the size of the string to pad.
    :return: The padded string of length
    """
    if len(s) < size:
        s = s + ' ' * (size - len(s))
    if len(s) > size:
        return s[:27] + "..."
    return s
