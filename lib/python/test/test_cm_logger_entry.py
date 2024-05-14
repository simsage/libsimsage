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

from openapi_client.models.cm_logger_entry import CMLoggerEntry  # noqa: E501

class TestCMLoggerEntry(unittest.TestCase):
    """CMLoggerEntry unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMLoggerEntry:
        """Test CMLoggerEntry
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMLoggerEntry`
        """
        model = CMLoggerEntry()  # noqa: E501
        if include_optional:
            return CMLoggerEntry(
                message = '',
                type = '',
                service = '',
                stack_trace = '',
                created = 56
            )
        else:
            return CMLoggerEntry(
                message = '',
                type = '',
                service = '',
                stack_trace = '',
                created = 56,
        )
        """

    def testCMLoggerEntry(self):
        """Test CMLoggerEntry"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
