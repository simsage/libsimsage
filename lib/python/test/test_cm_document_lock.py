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

from openapi_client.models.cm_document_lock import CMDocumentLock  # noqa: E501

class TestCMDocumentLock(unittest.TestCase):
    """CMDocumentLock unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMDocumentLock:
        """Test CMDocumentLock
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMDocumentLock`
        """
        model = CMDocumentLock()  # noqa: E501
        if include_optional:
            return CMDocumentLock(
                organisation_id = '',
                kb_id = '',
                url = 'document-1',
                url_id = 22,
                source_id = 1,
                user_id = '',
                name = '',
                checkout_date = 56
            )
        else:
            return CMDocumentLock(
                organisation_id = '',
                kb_id = '',
                url = 'document-1',
                url_id = 22,
                source_id = 1,
                user_id = '',
                name = '',
                checkout_date = 56,
        )
        """

    def testCMDocumentLock(self):
        """Test CMDocumentLock"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
