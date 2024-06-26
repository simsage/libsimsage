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

from openapi_client.models.cm_queue_filter import CMQueueFilter  # noqa: E501

class TestCMQueueFilter(unittest.TestCase):
    """CMQueueFilter unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMQueueFilter:
        """Test CMQueueFilter
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMQueueFilter`
        """
        model = CMQueueFilter()  # noqa: E501
        if include_optional:
            return CMQueueFilter(
                organisation_id = '',
                page = 56,
                page_size = 56,
                sort_direction = 56,
                sort_column = '',
                show_all = True
            )
        else:
            return CMQueueFilter(
                organisation_id = '',
                page = 56,
                page_size = 56,
                sort_direction = 56,
                sort_column = '',
                show_all = True,
        )
        """

    def testCMQueueFilter(self):
        """Test CMQueueFilter"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
