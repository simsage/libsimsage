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

from openapi_client.models.cm_query_focussed_summarization import CMQueryFocussedSummarization  # noqa: E501

class TestCMQueryFocussedSummarization(unittest.TestCase):
    """CMQueryFocussedSummarization unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMQueryFocussedSummarization:
        """Test CMQueryFocussedSummarization
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMQueryFocussedSummarization`
        """
        model = CMQueryFocussedSummarization()  # noqa: E501
        if include_optional:
            return CMQueryFocussedSummarization(
                summary = [
                    openapi_client.models.cmd_paragraph_summary.CMDParagraphSummary(
                        url = '', 
                        text = '', 
                        score = 1.337, )
                    ],
                message = ''
            )
        else:
            return CMQueryFocussedSummarization(
                summary = [
                    openapi_client.models.cmd_paragraph_summary.CMDParagraphSummary(
                        url = '', 
                        text = '', 
                        score = 1.337, )
                    ],
                message = '',
        )
        """

    def testCMQueryFocussedSummarization(self):
        """Test CMQueryFocussedSummarization"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
