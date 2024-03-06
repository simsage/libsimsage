# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.12.19
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.cm_paged_results_cm_sliced_document import CMPagedResultsCMSlicedDocument  # noqa: E501

class TestCMPagedResultsCMSlicedDocument(unittest.TestCase):
    """CMPagedResultsCMSlicedDocument unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMPagedResultsCMSlicedDocument:
        """Test CMPagedResultsCMSlicedDocument
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMPagedResultsCMSlicedDocument`
        """
        model = CMPagedResultsCMSlicedDocument()  # noqa: E501
        if include_optional:
            return CMPagedResultsCMSlicedDocument(
                total = 56,
                results = [
                    openapi_client.models.cm_sliced_document.CMSlicedDocument(
                        project_id = '', 
                        slice_id = '', 
                        source = '', 
                        extension = '', 
                        document_key = '', 
                        title = '', 
                        size = 56, 
                        folder_id = '', 
                        count = 56, 
                        confidence = 56, 
                        status = '', 
                        assigned_user = '', 
                        owns_item = True, 
                        can_claim = True, )
                    ]
            )
        else:
            return CMPagedResultsCMSlicedDocument(
                total = 56,
                results = [
                    openapi_client.models.cm_sliced_document.CMSlicedDocument(
                        project_id = '', 
                        slice_id = '', 
                        source = '', 
                        extension = '', 
                        document_key = '', 
                        title = '', 
                        size = 56, 
                        folder_id = '', 
                        count = 56, 
                        confidence = 56, 
                        status = '', 
                        assigned_user = '', 
                        owns_item = True, 
                        can_claim = True, )
                    ],
        )
        """

    def testCMPagedResultsCMSlicedDocument(self):
        """Test CMPagedResultsCMSlicedDocument"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
