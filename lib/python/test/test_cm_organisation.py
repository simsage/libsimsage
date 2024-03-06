# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.13.31
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.cm_organisation import CMOrganisation  # noqa: E501

class TestCMOrganisation(unittest.TestCase):
    """CMOrganisation unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMOrganisation:
        """Test CMOrganisation
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMOrganisation`
        """
        model = CMOrganisation()  # noqa: E501
        if include_optional:
            return CMOrganisation(
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
                    ]
            )
        else:
            return CMOrganisation(
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
                    ],
        )
        """

    def testCMOrganisation(self):
        """Test CMOrganisation"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
