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

from openapi_client.models.document_bookmark import DocumentBookmark  # noqa: E501

class TestDocumentBookmark(unittest.TestCase):
    """DocumentBookmark unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> DocumentBookmark:
        """Test DocumentBookmark
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `DocumentBookmark`
        """
        model = DocumentBookmark()  # noqa: E501
        if include_optional:
            return DocumentBookmark(
                user_id = '',
                source_id = 56,
                url = '',
                url_id = 56,
                is_folder = True,
                folder = True
            )
        else:
            return DocumentBookmark(
                user_id = '',
                source_id = 56,
                url = '',
                url_id = 56,
                is_folder = True,
        )
        """

    def testDocumentBookmark(self):
        """Test DocumentBookmark"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
