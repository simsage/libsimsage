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

from openapi_client.models.cm_semantics_paginated_result import CMSemanticsPaginatedResult  # noqa: E501

class TestCMSemanticsPaginatedResult(unittest.TestCase):
    """CMSemanticsPaginatedResult unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSemanticsPaginatedResult:
        """Test CMSemanticsPaginatedResult
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSemanticsPaginatedResult`
        """
        model = CMSemanticsPaginatedResult()  # noqa: E501
        if include_optional:
            return CMSemanticsPaginatedResult(
                organisation_id = '00000000-0000-0000-0000-000000000001',
                kb_id = '00000000-0000-0000-0000-000000000001',
                filter = 'dog',
                semantic_list = [
                    openapi_client.models.cm_semantic.CMSemantic(
                        word = 'John', 
                        semantic = 'person', )
                    ],
                num_semantics = 4121
            )
        else:
            return CMSemanticsPaginatedResult(
                organisation_id = '00000000-0000-0000-0000-000000000001',
                kb_id = '00000000-0000-0000-0000-000000000001',
                filter = 'dog',
                semantic_list = [
                    openapi_client.models.cm_semantic.CMSemantic(
                        word = 'John', 
                        semantic = 'person', )
                    ],
                num_semantics = 4121,
        )
        """

    def testCMSemanticsPaginatedResult(self):
        """Test CMSemanticsPaginatedResult"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
