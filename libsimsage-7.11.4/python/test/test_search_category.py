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

from openapi_client.models.search_category import SearchCategory  # noqa: E501

class TestSearchCategory(unittest.TestCase):
    """SearchCategory unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> SearchCategory:
        """Test SearchCategory
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `SearchCategory`
        """
        model = SearchCategory()  # noqa: E501
        if include_optional:
            return SearchCategory(
                sc_type = 'SCT_PLAIN',
                category_type = '',
                order = 56,
                sort_default = '',
                sort_asc_text = '',
                sort_desc_text = '',
                metadata = '',
                display_name = '',
                sort = True,
                min_value = 56,
                max_value = 56,
                items = [
                    openapi_client.models.name_counter_level.NameCounterLevel(
                        name = '', 
                        count = 56, )
                    ]
            )
        else:
            return SearchCategory(
                sc_type = 'SCT_PLAIN',
                category_type = '',
                order = 56,
                sort_default = '',
                sort_asc_text = '',
                sort_desc_text = '',
                metadata = '',
                display_name = '',
                sort = True,
                min_value = 56,
                max_value = 56,
                items = [
                    openapi_client.models.name_counter_level.NameCounterLevel(
                        name = '', 
                        count = 56, )
                    ],
        )
        """

    def testSearchCategory(self):
        """Test SearchCategory"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
