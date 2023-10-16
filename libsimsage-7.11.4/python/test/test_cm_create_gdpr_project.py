# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.11.4
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.cm_create_gdpr_project import CMCreateGdprProject  # noqa: E501

class TestCMCreateGdprProject(unittest.TestCase):
    """CMCreateGdprProject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMCreateGdprProject:
        """Test CMCreateGdprProject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMCreateGdprProject`
        """
        model = CMCreateGdprProject()  # noqa: E501
        if include_optional:
            return CMCreateGdprProject(
                organisation_id = '',
                kb_id = '',
                project_details = openapi_client.models.gdpr_project.GdprProject(
                    id = '', 
                    created_by = '', 
                    last_modified_by = '', 
                    created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    last_modified = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    last_result_update = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    project_type = 'FREESTYLE', 
                    status = 'NEW', 
                    search_details = openapi_client.models.cm_gdpr_search_details.CMGdprSearchDetails(
                        first_name = '', 
                        last_name = '', 
                        document_title = '', 
                        other_identifiers = [
                            openapi_client.models.identifier.Identifier(
                                identifier_type = 'CREDIT_CARD_NUMBER', 
                                identifier = '', )
                            ], ), )
            )
        else:
            return CMCreateGdprProject(
                organisation_id = '',
                kb_id = '',
        )
        """

    def testCMCreateGdprProject(self):
        """Test CMCreateGdprProject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
