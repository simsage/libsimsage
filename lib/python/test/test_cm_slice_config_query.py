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

from openapi_client.models.cm_slice_config_query import CMSliceConfigQuery  # noqa: E501

class TestCMSliceConfigQuery(unittest.TestCase):
    """CMSliceConfigQuery unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSliceConfigQuery:
        """Test CMSliceConfigQuery
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSliceConfigQuery`
        """
        model = CMSliceConfigQuery()  # noqa: E501
        if include_optional:
            return CMSliceConfigQuery(
                type = '',
                token_list = [
                    openapi_client.models.cm_query_token.CMQueryToken(
                        type = '', 
                        value = '', )
                    ]
            )
        else:
            return CMSliceConfigQuery(
                type = '',
                token_list = [
                    openapi_client.models.cm_query_token.CMQueryToken(
                        type = '', 
                        value = '', )
                    ],
        )
        """

    def testCMSliceConfigQuery(self):
        """Test CMSliceConfigQuery"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
