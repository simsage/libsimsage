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

from openapi_client.models.cm_document_note import CMDocumentNote  # noqa: E501

class TestCMDocumentNote(unittest.TestCase):
    """CMDocumentNote unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMDocumentNote:
        """Test CMDocumentNote
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMDocumentNote`
        """
        model = CMDocumentNote()  # noqa: E501
        if include_optional:
            return CMDocumentNote(
                organisation_id = '',
                kb_id = '',
                url = 'document-1',
                note_id = 1,
                note_text = 'example text',
                user_id = '1234',
                email = 'joe@bloggs.com',
                created = 56
            )
        else:
            return CMDocumentNote(
                organisation_id = '',
                kb_id = '',
                url = 'document-1',
                note_id = 1,
                note_text = 'example text',
                user_id = '1234',
                email = 'joe@bloggs.com',
                created = 56,
        )
        """

    def testCMDocumentNote(self):
        """Test CMDocumentNote"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
