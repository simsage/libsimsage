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

from openapi_client.models.cm_user import CMUser  # noqa: E501

class TestCMUser(unittest.TestCase):
    """CMUser unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMUser:
        """Test CMUser
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMUser`
        """
        model = CMUser()  # noqa: E501
        if include_optional:
            return CMUser(
                id = '',
                email = 'example@simsage.co.uk',
                first_name = 'John',
                surname = 'Smallberries',
                roles = [
                    openapi_client.models.cm_user_role.CMUserRole(
                        organisation_id = '00000000-0000-0000-0000-000000000001', 
                        role = 'one of admin,manager,operator,dms', )
                    ],
                operator_kb_list = [
                    openapi_client.models.cm_operator_knowledge_base.CMOperatorKnowledgeBase(
                        user_id = '', 
                        organisation_id = '00000000-0000-0000-0000-000000000001', 
                        kb_id = '', )
                    ],
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
            return CMUser(
                id = '',
                email = 'example@simsage.co.uk',
                first_name = 'John',
                surname = 'Smallberries',
                roles = [
                    openapi_client.models.cm_user_role.CMUserRole(
                        organisation_id = '00000000-0000-0000-0000-000000000001', 
                        role = 'one of admin,manager,operator,dms', )
                    ],
                operator_kb_list = [
                    openapi_client.models.cm_operator_knowledge_base.CMOperatorKnowledgeBase(
                        user_id = '', 
                        organisation_id = '00000000-0000-0000-0000-000000000001', 
                        kb_id = '', )
                    ],
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

    def testCMUser(self):
        """Test CMUser"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
