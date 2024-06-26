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

from openapi_client.models.cm_session_version import CMSessionVersion  # noqa: E501

class TestCMSessionVersion(unittest.TestCase):
    """CMSessionVersion unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSessionVersion:
        """Test CMSessionVersion
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSessionVersion`
        """
        model = CMSessionVersion()  # noqa: E501
        if include_optional:
            return CMSessionVersion(
                session = openapi_client.models.cm_session.CMSession(
                    id = '', 
                    user_id = '', 
                    organisation_id = '00000000-0000-0000-0000-000000000001', 
                    email = 'example@simsage.co.uk', 
                    ip_address = '', 
                    last_access = 56, 
                    role = '', 
                    session_type = '', ),
                user = openapi_client.models.cm_user.CMUser(
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
                    jwt_match_name_value_csv = '', ),
                organisation_list = [
                    openapi_client.models.cm_organisation.CMOrganisation(
                        id = '', 
                        name = '', 
                        enabled = True, 
                        auto_create_sso_users = True, 
                        auto_create_sso_domain_list = [
                            ''
                            ], 
                        auto_create_ssoacl_list = [
                            ''
                            ], 
                        auto_create_sso_role_list = [
                            ''
                            ], )
                    ],
                version = '7.5.9'
            )
        else:
            return CMSessionVersion(
                session = openapi_client.models.cm_session.CMSession(
                    id = '', 
                    user_id = '', 
                    organisation_id = '00000000-0000-0000-0000-000000000001', 
                    email = 'example@simsage.co.uk', 
                    ip_address = '', 
                    last_access = 56, 
                    role = '', 
                    session_type = '', ),
                user = openapi_client.models.cm_user.CMUser(
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
                    jwt_match_name_value_csv = '', ),
                organisation_list = [
                    openapi_client.models.cm_organisation.CMOrganisation(
                        id = '', 
                        name = '', 
                        enabled = True, 
                        auto_create_sso_users = True, 
                        auto_create_sso_domain_list = [
                            ''
                            ], 
                        auto_create_ssoacl_list = [
                            ''
                            ], 
                        auto_create_sso_role_list = [
                            ''
                            ], )
                    ],
                version = '7.5.9',
        )
        """

    def testCMSessionVersion(self):
        """Test CMSessionVersion"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
