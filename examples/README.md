# SimSage python3 code examples

## utilities

Here is a list of the utilities/examples by file:

| file               | description                                                                                                                 |
|--------------------|-------------------------------------------------|
| common.py          | Common values shared by these utilities.        |
| create_user.py     | Create a new user for the SimSage platform.     |
| download.py        | Download a document from SimSage by url.        |
| logs.py            | View SimSage platform logs by service-name.     |
| search.py          | Search the SimSage platform.                    |
| source_list.py     | Get a list of sources and their status.         |
| upload_document.py | Upload a document into SimSage.                 |


## usage
Set up the right values for your SimSage instance in `common.py`.  The values you'll see in `common.py` are:

| name                  | default value                        | description                                                                                                                 |
|-----------------------|--------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| api_base              | http://test.simsage.ai/api           | remote SimSage SaaS server location, e.g. https://test.simsage.ai/api                                                       |
| organisation_id       | c276f883-e0c8-43ae-9119-df8b7df9c574 | SimSage organisation ID to use                                                                                              |
| kb_id                 | 46ff0c75-7938-492c-ab50-442496f5de51 | SimSage knowledge-base id to use                                                                                            |
| sid                   | 1282271b-6ffe-4435-a496-52d822442fb2 | Security ID used for uploading external documents, can be recylced and got from the admin UX for a given knowledgebase      |
| source_id             | 1                                    | the id of the source you want to upload into, this source must be set up as an "external source" in the admin UX for upload |
| email                 | info@simsage.nz                      | the user name / email used to sign-into the SimSage API, NB. this account must have the right SimSage roles for the task    |
| check_ssl_certificate | False                                | set this value to True if you want the SSL certificate to be checked for strict validity                                    |
| password              | ...your-password...                  | the password to sign-into the SimSage API, this can be set using the admin UX, only needed for some functionality           |

