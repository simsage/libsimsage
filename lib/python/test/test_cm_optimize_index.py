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

from openapi_client.models.cm_optimize_index import CMOptimizeIndex  # noqa: E501

class TestCMOptimizeIndex(unittest.TestCase):
    """CMOptimizeIndex unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMOptimizeIndex:
        """Test CMOptimizeIndex
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMOptimizeIndex`
        """
        model = CMOptimizeIndex()  # noqa: E501
        if include_optional:
            return CMOptimizeIndex(
                organisation_id = '00000000-0000-0000-0000-000000000001',
                kb_id = '00000000-0000-0000-0000-000000000001',
                optimize_all_indexes = False
            )
        else:
            return CMOptimizeIndex(
                organisation_id = '00000000-0000-0000-0000-000000000001',
                kb_id = '00000000-0000-0000-0000-000000000001',
                optimize_all_indexes = False,
        )
        """

    def testCMOptimizeIndex(self):
        """Test CMOptimizeIndex"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
