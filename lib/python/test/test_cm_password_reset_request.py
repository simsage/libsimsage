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

from openapi_client.models.cm_password_reset_request import CMPasswordResetRequest  # noqa: E501

class TestCMPasswordResetRequest(unittest.TestCase):
    """CMPasswordResetRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMPasswordResetRequest:
        """Test CMPasswordResetRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMPasswordResetRequest`
        """
        model = CMPasswordResetRequest()  # noqa: E501
        if include_optional:
            return CMPasswordResetRequest(
                email = 'example@simsage.co.uk',
                reset_url = 'https://your.simsage.ai/admin/reset-password'
            )
        else:
            return CMPasswordResetRequest(
                email = 'example@simsage.co.uk',
                reset_url = 'https://your.simsage.ai/admin/reset-password',
        )
        """

    def testCMPasswordResetRequest(self):
        """Test CMPasswordResetRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
