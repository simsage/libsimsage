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

from openapi_client.models.cm_search_result_summary import CMSearchResultSummary  # noqa: E501

class TestCMSearchResultSummary(unittest.TestCase):
    """CMSearchResultSummary unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSearchResultSummary:
        """Test CMSearchResultSummary
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSearchResultSummary`
        """
        model = CMSearchResultSummary()  # noqa: E501
        if include_optional:
            return CMSearchResultSummary(
                project_id = '',
                kb_id = '',
                project_type = '',
                project_title = '',
                document_count = 56,
                results = [
                    openapi_client.models.cm_results_section.CMResultsSection(
                        query_tokens = [
                            openapi_client.models.cm_query_token.CMQueryToken(
                                type = '', 
                                value = '', )
                            ], 
                        caption = '', 
                        has_sub_terms = True, 
                        count = 56, )
                    ]
            )
        else:
            return CMSearchResultSummary(
                project_id = '',
                kb_id = '',
                project_type = '',
                project_title = '',
                document_count = 56,
                results = [
                    openapi_client.models.cm_results_section.CMResultsSection(
                        query_tokens = [
                            openapi_client.models.cm_query_token.CMQueryToken(
                                type = '', 
                                value = '', )
                            ], 
                        caption = '', 
                        has_sub_terms = True, 
                        count = 56, )
                    ],
        )
        """

    def testCMSearchResultSummary(self):
        """Test CMSearchResultSummary"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
