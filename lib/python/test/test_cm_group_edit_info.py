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

from openapi_client.models.cm_group_edit_info import CMGroupEditInfo  # noqa: E501

class TestCMGroupEditInfo(unittest.TestCase):
    """CMGroupEditInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMGroupEditInfo:
        """Test CMGroupEditInfo
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMGroupEditInfo`
        """
        model = CMGroupEditInfo()  # noqa: E501
        if include_optional:
            return CMGroupEditInfo(
                user_id_list = [
                    ''
                    ],
                active_users_page = 56,
                active_users_filter = '',
                available_users_page = 56,
                available_users_filter = '',
                page_size = 56
            )
        else:
            return CMGroupEditInfo(
                user_id_list = [
                    ''
                    ],
                active_users_page = 56,
                active_users_filter = '',
                available_users_page = 56,
                available_users_filter = '',
                page_size = 56,
        )
        """

    def testCMGroupEditInfo(self):
        """Test CMGroupEditInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
