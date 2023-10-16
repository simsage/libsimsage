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

from openapi_client.models.cm_start_crawler import CMStartCrawler  # noqa: E501

class TestCMStartCrawler(unittest.TestCase):
    """CMStartCrawler unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMStartCrawler:
        """Test CMStartCrawler
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMStartCrawler`
        """
        model = CMStartCrawler()  # noqa: E501
        if include_optional:
            return CMStartCrawler(
                organisation_id = '',
                kb_id = '',
                source_id = 1,
                url_list = ''
            )
        else:
            return CMStartCrawler(
                organisation_id = '',
                kb_id = '',
                source_id = 1,
                url_list = '',
        )
        """

    def testCMStartCrawler(self):
        """Test CMStartCrawler"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()