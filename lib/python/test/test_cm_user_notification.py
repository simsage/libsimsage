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

from openapi_client.models.cm_user_notification import CMUserNotification  # noqa: E501

class TestCMUserNotification(unittest.TestCase):
    """CMUserNotification unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMUserNotification:
        """Test CMUserNotification
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMUserNotification`
        """
        model = CMUserNotification()  # noqa: E501
        if include_optional:
            return CMUserNotification(
                url = '/folder-1',
                source_id = 1,
                is_folder = False,
                user_id = '',
                who_id = '',
                email = 'joe@bloggs.com',
                notification_type = 'document',
                description = 'something happened',
                created = 56,
                folder = True
            )
        else:
            return CMUserNotification(
                url = '/folder-1',
                source_id = 1,
                is_folder = False,
                user_id = '',
                who_id = '',
                email = 'joe@bloggs.com',
                notification_type = 'document',
                description = 'something happened',
                created = 56,
        )
        """

    def testCMUserNotification(self):
        """Test CMUserNotification"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
