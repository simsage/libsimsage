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

from openapi_client.models.cm_results_section import CMResultsSection  # noqa: E501

class TestCMResultsSection(unittest.TestCase):
    """CMResultsSection unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMResultsSection:
        """Test CMResultsSection
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMResultsSection`
        """
        model = CMResultsSection()  # noqa: E501
        if include_optional:
            return CMResultsSection(
                query_tokens = [
                    openapi_client.models.cm_query_token.CMQueryToken(
                        type = '', 
                        value = '', )
                    ],
                caption = '',
                has_sub_terms = True,
                count = 56
            )
        else:
            return CMResultsSection(
                query_tokens = [
                    openapi_client.models.cm_query_token.CMQueryToken(
                        type = '', 
                        value = '', )
                    ],
                caption = '',
                has_sub_terms = True,
                count = 56,
        )
        """

    def testCMResultsSection(self):
        """Test CMResultsSection"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
