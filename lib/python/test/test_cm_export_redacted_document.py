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

from openapi_client.models.cm_export_redacted_document import CMExportRedactedDocument  # noqa: E501

class TestCMExportRedactedDocument(unittest.TestCase):
    """CMExportRedactedDocument unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMExportRedactedDocument:
        """Test CMExportRedactedDocument
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMExportRedactedDocument`
        """
        model = CMExportRedactedDocument()  # noqa: E501
        if include_optional:
            return CMExportRedactedDocument(
                organisation_id = '',
                kb_id = '',
                project_id = '',
                url = '',
                export_native_format = True
            )
        else:
            return CMExportRedactedDocument(
                organisation_id = '',
                kb_id = '',
                project_id = '',
                url = '',
                export_native_format = True,
        )
        """

    def testCMExportRedactedDocument(self):
        """Test CMExportRedactedDocument"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
