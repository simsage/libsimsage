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

from openapi_client.models.cm_syn_set_list import CMSynSetList  # noqa: E501

class TestCMSynSetList(unittest.TestCase):
    """CMSynSetList unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSynSetList:
        """Test CMSynSetList
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSynSetList`
        """
        model = CMSynSetList()  # noqa: E501
        if include_optional:
            return CMSynSetList(
                list = '',
                total_size = 56
            )
        else:
            return CMSynSetList(
                list = '',
                total_size = 56,
        )
        """

    def testCMSynSetList(self):
        """Test CMSynSetList"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
