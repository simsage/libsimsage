# SimSage python3 code examples

## use
Set up the right values for your SimSage instance in `common.py`.
The values you'll see in `common.py` are:

| name              | value                                 | description                                                                                                                 |
|-------------------|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| api_base          | http://test.simsage.ai/api            | remote SimSage SaaS server location, e.g. https://test.simsage.ai/api                                                       |
| organisation_id   | c276f883-e0c8-43ae-9119-df8b7df9c574  | SimSage organisation ID to use                                                                                              |
| kb_id             | 46ff0c75-7938-492c-ab50-442496f5de51  | SimSage knowledge-base id to use                                                                                            |
| sid               | 1282271b-6ffe-4435-a496-52d822442fb2  | Security ID used for uploading external documents, can be recylced and got from the admin UX for a given knowledgebase      |
| source_id         | 1                                     | the id of the source you want to upload into, this source must be set up as an "external source" in the admin UX for upload |
| email             | info@simsage.nz                       | the user name / email used to sign-into the SimSage API, NB. this account must have the right SimSage roles for the task    |
| password          | ...your-password...                   | the password to sign-into the SimSage API, this can be set using the admin UX                                               |

## utilities

Here is a list of the utilities/examples by file:

| file               | description                                                                                                                 |
|--------------------|-----------------------------------------------------------------------------------------------------------------------------|
| create_user.py     | an example showing how to create a new user for the SimSage platform.                                                       |
| download.py        | an example showing how to download a document from SimSage by url.                                                          |
| logs.py            | an example showing how to view SimSage platform logs by service-name                                                        |
| search.py          | an example showing how to perform a search on the SimSage platform                                                          |
| source_list.py     | an example showing how to get a list of sources and their status.                                                           |
| upload_document.py | an example showing how to upload a document into SimSage.                                                                   |

