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

from openapi_client.models.cm_project_info import CMProjectInfo  # noqa: E501

class TestCMProjectInfo(unittest.TestCase):
    """CMProjectInfo unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMProjectInfo:
        """Test CMProjectInfo
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMProjectInfo`
        """
        model = CMProjectInfo()  # noqa: E501
        if include_optional:
            return CMProjectInfo(
                key = '',
                caption = '',
                description = '',
                search = openapi_client.models.cm_search_definition.CMSearchDefinition(
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
                        ], ),
                steps = [
                    openapi_client.models.cm_step_config.CMStepConfig(
                        caption = '', 
                        config = openapi_client.models.config.config(), )
                    ],
                slice_actions = {
                    'key' : ''
                    },
                screen_configs = {
                    'key' : {
                        'key' : None
                        }
                    }
            )
        else:
            return CMProjectInfo(
                key = '',
                caption = '',
                description = '',
                search = openapi_client.models.cm_search_definition.CMSearchDefinition(
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
                        ], ),
                steps = [
                    openapi_client.models.cm_step_config.CMStepConfig(
                        caption = '', 
                        config = openapi_client.models.config.config(), )
                    ],
                slice_actions = {
                    'key' : ''
                    },
                screen_configs = {
                    'key' : {
                        'key' : None
                        }
                    },
        )
        """

    def testCMProjectInfo(self):
        """Test CMProjectInfo"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
