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

from openapi_client.models.sign_in_admin import SignInAdmin  # noqa: E501

class TestSignInAdmin(unittest.TestCase):
    """SignInAdmin unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SignInAdmin:
        """Test SignInAdmin
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SignInAdmin`
        """
        model = SignInAdmin()  # noqa: E501
        if include_optional:
            return SignInAdmin(
                job_id = '',
                return_address = '',
                error_str = '',
                time_out = 56,
                var_async = True,
                is_return_result = True,
                email = '',
                password = '',
                roles = [
                    ''
                    ],
                remote_address = '',
                session = openapi_client.models.session.Session(
                    id = '', 
                    user_id = '', 
                    organisation_id = '', 
                    email = '', 
                    ip_address = '', 
                    last_access = 56, 
                    role = '', 
                    session_type = '', 
                    context_stack = [
                        openapi_client.models.context_item.ContextItem(
                            kb_id = '', 
                            created = 56, 
                            name_value = {
                                'key' : ''
                                }, 
                            syn_set_lemma = '', 
                            syn_set_cloud = [
                                ''
                                ], )
                        ], ),
                user = openapi_client.models.user.User(
                    id = '', 
                    email = '', 
                    first_name = '', 
                    surname = '', 
                    password_hash = '', 
                    confirmed = True, 
                    roles = [
                        openapi_client.models.user_role.UserRole(
                            user_id = '', 
                            organisation_id = '', 
                            role = '', )
                        ], 
                    operator_kb_list = [
                        openapi_client.models.operator_knowledge_base.OperatorKnowledgeBase(
                            user_id = '', 
                            organisation_id = '', 
                            kb_id = '', )
                        ], 
                    group_list = [
                        openapi_client.models.group.Group(
                            organisation_id = '', 
                            name = '', 
                            user_id_list = [
                                ''
                                ], )
                        ], ),
                organisation_id = '',
                organisation_list = [
                    openapi_client.models.organisation.Organisation(
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
                return_result = True
            )
        else:
            return SignInAdmin(
                job_id = '',
                return_address = '',
                error_str = '',
                time_out = 56,
                var_async = True,
                is_return_result = True,
                email = '',
                password = '',
                roles = [
                    ''
                    ],
                remote_address = '',
                session = openapi_client.models.session.Session(
                    id = '', 
                    user_id = '', 
                    organisation_id = '', 
                    email = '', 
                    ip_address = '', 
                    last_access = 56, 
                    role = '', 
                    session_type = '', 
                    context_stack = [
                        openapi_client.models.context_item.ContextItem(
                            kb_id = '', 
                            created = 56, 
                            name_value = {
                                'key' : ''
                                }, 
                            syn_set_lemma = '', 
                            syn_set_cloud = [
                                ''
                                ], )
                        ], ),
                user = openapi_client.models.user.User(
                    id = '', 
                    email = '', 
                    first_name = '', 
                    surname = '', 
                    password_hash = '', 
                    confirmed = True, 
                    roles = [
                        openapi_client.models.user_role.UserRole(
                            user_id = '', 
                            organisation_id = '', 
                            role = '', )
                        ], 
                    operator_kb_list = [
                        openapi_client.models.operator_knowledge_base.OperatorKnowledgeBase(
                            user_id = '', 
                            organisation_id = '', 
                            kb_id = '', )
                        ], 
                    group_list = [
                        openapi_client.models.group.Group(
                            organisation_id = '', 
                            name = '', 
                            user_id_list = [
                                ''
                                ], )
                        ], ),
                organisation_id = '',
                organisation_list = [
                    openapi_client.models.organisation.Organisation(
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
        )
        """

    def testSignInAdmin(self):
        """Test SignInAdmin"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
