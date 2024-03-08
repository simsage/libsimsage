# SimSage Search python 3 example

## use
Set up the right values for your SimSage instance in any of the code samples.

run `python3 do_search.py`

the values above are:

| name              | value                                 | description                                                                                                                 |
|-------------------|---------------------------------------|-----------------------------------------------------------------------------------------------------------------------------|
| api_base          | http://test.simsage.ai/api            | remote SimSage SaaS server location, e.g. https://test.simsage.ai/api                                                       |
| organisation_id   | c276f883-e0c8-43ae-9119-df8b7df9c574  | SimSage organisation ID to use for searching                                                                                |
| kb_id             | 46ff0c75-7938-492c-ab50-442496f5de51  | SimSage knowledge-base id to use for searching                                                                              |
| sid               | 1282271b-6ffe-4435-a496-52d822442fb2  | Security ID used for uploading external documents, can be recylced and got from the admin UX for a given knowledgebase      |
| source_id         | 1                                     | the id of the source you want to upload into, this source must be set up as an "external source" in the admin UX for upload |
| email             | info@simsage.nz                       | the user name / email used to sign-into the SimSage API, NB. this account must have the right SimSage roles for the task    |
| password          | <your-password>                       | the password to sign-into the SimSage API, this can be set using the admin UX                                               |
