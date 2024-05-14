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

from openapi_client.models.cm_external_mark_reset_crawl import CMExternalMarkResetCrawl  # noqa: E501

class TestCMExternalMarkResetCrawl(unittest.TestCase):
    """CMExternalMarkResetCrawl unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMExternalMarkResetCrawl:
        """Test CMExternalMarkResetCrawl
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMExternalMarkResetCrawl`
        """
        model = CMExternalMarkResetCrawl()  # noqa: E501
        if include_optional:
            return CMExternalMarkResetCrawl(
                object_type = 'CMExternalMarkResetCrawl',
                organisation_id = '',
                kb_id = '',
                sid = '',
                source_id = 1,
                delta_reset_roots = [
                    ''
                    ],
                encrypted = True,
                seed = 0
            )
        else:
            return CMExternalMarkResetCrawl(
                object_type = 'CMExternalMarkResetCrawl',
                organisation_id = '',
                kb_id = '',
                sid = '',
                source_id = 1,
                delta_reset_roots = [
                    ''
                    ],
                encrypted = True,
                seed = 0,
        )
        """

    def testCMExternalMarkResetCrawl(self):
        """Test CMExternalMarkResetCrawl"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()