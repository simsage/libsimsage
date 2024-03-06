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

from openapi_client.models.cm_external_crawler_start import CMExternalCrawlerStart  # noqa: E501

class TestCMExternalCrawlerStart(unittest.TestCase):
    """CMExternalCrawlerStart unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMExternalCrawlerStart:
        """Test CMExternalCrawlerStart
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMExternalCrawlerStart`
        """
        model = CMExternalCrawlerStart()  # noqa: E501
        if include_optional:
            return CMExternalCrawlerStart(
                object_type = 'CMExternalCrawlerStartStop',
                organisation_id = '',
                kb_id = '',
                sid = '',
                source_id = 1,
                run_id = 56,
                encrypted = True,
                seed = 0
            )
        else:
            return CMExternalCrawlerStart(
                object_type = 'CMExternalCrawlerStartStop',
                organisation_id = '',
                kb_id = '',
                sid = '',
                source_id = 1,
                run_id = 56,
                encrypted = True,
                seed = 0,
        )
        """

    def testCMExternalCrawlerStart(self):
        """Test CMExternalCrawlerStart"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
