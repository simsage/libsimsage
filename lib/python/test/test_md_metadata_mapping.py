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

from openapi_client.models.md_metadata_mapping import MDMetadataMapping  # noqa: E501

class TestMDMetadataMapping(unittest.TestCase):
    """MDMetadataMapping unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> MDMetadataMapping:
        """Test MDMetadataMapping
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `MDMetadataMapping`
        """
        model = MDMetadataMapping()  # noqa: E501
        if include_optional:
            return MDMetadataMapping(
                data_type = 'one of: string, long',
                display = 'The price of the item',
                ext_metadata = 'a name',
                metadata = 'price',
                string_value_list = 'pants,shorts',
                number_value_list = '1.0'
            )
        else:
            return MDMetadataMapping(
                data_type = 'one of: string, long',
                display = 'The price of the item',
                ext_metadata = 'a name',
                metadata = 'price',
                string_value_list = 'pants,shorts',
                number_value_list = '1.0',
        )
        """

    def testMDMetadataMapping(self):
        """Test MDMetadataMapping"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()