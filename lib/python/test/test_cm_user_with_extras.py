# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.14.12
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.cm_user_with_extras import CMUserWithExtras  # noqa: E501

class TestCMUserWithExtras(unittest.TestCase):
    """CMUserWithExtras unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMUserWithExtras:
        """Test CMUserWithExtras
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMUserWithExtras`
        """
        model = CMUserWithExtras()  # noqa: E501
        if include_optional:
            return CMUserWithExtras(
                id = '',
                email = '',
                password = '',
                first_name = '',
                surname = '',
                roles = '',
                operator_kb_list = '',
                group_list = [
                    openapi_client.models.cm_group.CMGroup(
                        organisation_id = '00000000-0000-0000-0000-000000000001', 
                        name = 'Domain Users', 
                        original_name = 'Domain Users', 
                        user_id_list = [
                            ''
                            ], )
                    ],
                jwt_match_name_value_csv = ''
            )
        else:
            return CMUserWithExtras(
                id = '',
                email = '',
                password = '',
                first_name = '',
                surname = '',
                roles = '',
                operator_kb_list = '',
                group_list = [
                    openapi_client.models.cm_group.CMGroup(
                        organisation_id = '00000000-0000-0000-0000-000000000001', 
                        name = 'Domain Users', 
                        original_name = 'Domain Users', 
                        user_id_list = [
                            ''
                            ], )
                    ],
                jwt_match_name_value_csv = '',
        )
        """

    def testCMUserWithExtras(self):
        """Test CMUserWithExtras"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
