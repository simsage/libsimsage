# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.12.19
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.cm_slice_config import CMSliceConfig  # noqa: E501

class TestCMSliceConfig(unittest.TestCase):
    """CMSliceConfig unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSliceConfig:
        """Test CMSliceConfig
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSliceConfig`
        """
        model = CMSliceConfig()  # noqa: E501
        if include_optional:
            return CMSliceConfig(
                name = '',
                description = '',
                action = '',
                query = None
            )
        else:
            return CMSliceConfig(
                name = '',
                description = '',
                action = '',
                query = None,
        )
        """

    def testCMSliceConfig(self):
        """Test CMSliceConfig"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
