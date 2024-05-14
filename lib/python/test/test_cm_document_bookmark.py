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

from openapi_client.models.cm_document_bookmark import CMDocumentBookmark  # noqa: E501

class TestCMDocumentBookmark(unittest.TestCase):
    """CMDocumentBookmark unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMDocumentBookmark:
        """Test CMDocumentBookmark
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMDocumentBookmark`
        """
        model = CMDocumentBookmark()  # noqa: E501
        if include_optional:
            return CMDocumentBookmark(
                organisation_id = '',
                kb_id = '',
                user_id = '',
                source_id = 1,
                url = 'document-1',
                url_id = 22,
                is_folder = False,
                folder = True
            )
        else:
            return CMDocumentBookmark(
                organisation_id = '',
                kb_id = '',
                user_id = '',
                source_id = 1,
                url = 'document-1',
                url_id = 22,
                is_folder = False,
        )
        """

    def testCMDocumentBookmark(self):
        """Test CMDocumentBookmark"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
