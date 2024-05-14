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

from openapi_client.models.cm_search_definition import CMSearchDefinition  # noqa: E501

class TestCMSearchDefinition(unittest.TestCase):
    """CMSearchDefinition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSearchDefinition:
        """Test CMSearchDefinition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSearchDefinition`
        """
        model = CMSearchDefinition()  # noqa: E501
        if include_optional:
            return CMSearchDefinition(
                keyed_queries = [
                    openapi_client.models.cm_search_term.CMSearchTerm(
                        key = '', 
                        caption = '', 
                        search_usage = 'REQUIRED', 
                        redaction_usage = 'REQUIRED', 
                        default_value = '', 
                        sub_terms = [
                            openapi_client.models.cm_sub_term.CMSubTerm(
                                key = '', 
                                caption = '', 
                                type = '', )
                            ], )
                    ],
                semantic_term_queries = [
                    openapi_client.models.cm_search_term.CMSearchTerm(
                        key = '', 
                        caption = '', 
                        search_usage = 'REQUIRED', 
                        redaction_usage = 'REQUIRED', 
                        default_value = '', 
                        sub_terms = [
                            openapi_client.models.cm_sub_term.CMSubTerm(
                                key = '', 
                                caption = '', 
                                type = '', )
                            ], )
                    ]
            )
        else:
            return CMSearchDefinition(
                keyed_queries = [
                    openapi_client.models.cm_search_term.CMSearchTerm(
                        key = '', 
                        caption = '', 
                        search_usage = 'REQUIRED', 
                        redaction_usage = 'REQUIRED', 
                        default_value = '', 
                        sub_terms = [
                            openapi_client.models.cm_sub_term.CMSubTerm(
                                key = '', 
                                caption = '', 
                                type = '', )
                            ], )
                    ],
                semantic_term_queries = [
                    openapi_client.models.cm_search_term.CMSearchTerm(
                        key = '', 
                        caption = '', 
                        search_usage = 'REQUIRED', 
                        redaction_usage = 'REQUIRED', 
                        default_value = '', 
                        sub_terms = [
                            openapi_client.models.cm_sub_term.CMSubTerm(
                                key = '', 
                                caption = '', 
                                type = '', )
                            ], )
                    ],
        )
        """

    def testCMSearchDefinition(self):
        """Test CMSearchDefinition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
