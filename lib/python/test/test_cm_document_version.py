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

from openapi_client.models.cm_document_version import CMDocumentVersion  # noqa: E501

class TestCMDocumentVersion(unittest.TestCase):
    """CMDocumentVersion unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMDocumentVersion:
        """Test CMDocumentVersion
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMDocumentVersion`
        """
        model = CMDocumentVersion()  # noqa: E501
        if include_optional:
            return CMDocumentVersion(
                url = 'https://server.com/document-1',
                version = 1,
                change_hash = '098f6bcd4621d373cade4e832627b4f6',
                created = 56
            )
        else:
            return CMDocumentVersion(
                url = 'https://server.com/document-1',
                version = 1,
                change_hash = '098f6bcd4621d373cade4e832627b4f6',
                created = 56,
        )
        """

    def testCMDocumentVersion(self):
        """Test CMDocumentVersion"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
