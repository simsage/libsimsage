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

from openapi_client.models.cm_text_to_search_conversion import CMTextToSearchConversion  # noqa: E501

class TestCMTextToSearchConversion(unittest.TestCase):
    """CMTextToSearchConversion unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMTextToSearchConversion:
        """Test CMTextToSearchConversion
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMTextToSearchConversion`
        """
        model = CMTextToSearchConversion()  # noqa: E501
        if include_optional:
            return CMTextToSearchConversion(
                organisation_id = '00000000-0000-0000-0000-000000000001',
                kb_id = '00000000-0000-0000-0000-000000000001',
                text = '',
                filter = ''
            )
        else:
            return CMTextToSearchConversion(
                organisation_id = '00000000-0000-0000-0000-000000000001',
                kb_id = '00000000-0000-0000-0000-000000000001',
                text = '',
                filter = '',
        )
        """

    def testCMTextToSearchConversion(self):
        """Test CMTextToSearchConversion"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()