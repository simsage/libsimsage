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

from openapi_client.models.cm_project_definition import CMProjectDefinition  # noqa: E501

class TestCMProjectDefinition(unittest.TestCase):
    """CMProjectDefinition unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMProjectDefinition:
        """Test CMProjectDefinition
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMProjectDefinition`
        """
        model = CMProjectDefinition()  # noqa: E501
        if include_optional:
            return CMProjectDefinition(
                project_id = '',
                task_id = '',
                organisation_id = '',
                project_frame = openapi_client.models.cm_project_frame.CMProjectFrame(
                    project_type = '', 
                    title = '', 
                    narrative = '', ),
                keyed_search_terms = [
                    openapi_client.models.cm_keyed_search_term.CMKeyedSearchTerm(
                        key = '', 
                        redact = True, 
                        redaction_disabled = True, 
                        row_required = True, 
                        search = True, 
                        search_disabled = True, 
                        value = '', 
                        sub_terms = [
                            openapi_client.models.cm_search_sub_term.CMSearchSubTerm(
                                key = '', 
                                value = '', 
                                type = '', )
                            ], )
                    ],
                semantic_terms = [
                    openapi_client.models.cm_semantic_term.CMSemanticTerm(
                        key = '', 
                        redact = True, 
                        redaction_disabled = True, 
                        search = True, 
                        search_disabled = True, 
                        caption = '', )
                    ],
                filters = openapi_client.models.cm_filter.CMFilter(
                    knowledge_base = '', 
                    filetypes = [
                        ''
                        ], 
                    sources = [
                        ''
                        ], ),
                validation_result = {
                    'key' : True
                    }
            )
        else:
            return CMProjectDefinition(
                organisation_id = '',
                project_frame = openapi_client.models.cm_project_frame.CMProjectFrame(
                    project_type = '', 
                    title = '', 
                    narrative = '', ),
                filters = openapi_client.models.cm_filter.CMFilter(
                    knowledge_base = '', 
                    filetypes = [
                        ''
                        ], 
                    sources = [
                        ''
                        ], ),
        )
        """

    def testCMProjectDefinition(self):
        """Test CMProjectDefinition"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
