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

from openapi_client.models.cm_get_html import CMGetHtml  # noqa: E501

class TestCMGetHtml(unittest.TestCase):
    """CMGetHtml unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMGetHtml:
        """Test CMGetHtml
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMGetHtml`
        """
        model = CMGetHtml()  # noqa: E501
        if include_optional:
            return CMGetHtml(
                organisation_id = '',
                kb_id = '',
                url_id = 56,
                url = 'https://server.com/document-1',
                page = 56,
                html = '',
                width = 56,
                height = 56,
                num_pages = 56
            )
        else:
            return CMGetHtml(
                organisation_id = '',
                kb_id = '',
                url_id = 56,
                url = 'https://server.com/document-1',
                page = 56,
                html = '',
                width = 56,
                height = 56,
                num_pages = 56,
        )
        """

    def testCMGetHtml(self):
        """Test CMGetHtml"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
