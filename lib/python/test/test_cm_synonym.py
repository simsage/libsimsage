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

from openapi_client.models.cm_synonym import CMSynonym  # noqa: E501

class TestCMSynonym(unittest.TestCase):
    """CMSynonym unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSynonym:
        """Test CMSynonym
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSynonym`
        """
        model = CMSynonym()  # noqa: E501
        if include_optional:
            return CMSynonym(
                id = '',
                words = 'dog, canine, woof-woof'
            )
        else:
            return CMSynonym(
                id = '',
                words = 'dog, canine, woof-woof',
        )
        """

    def testCMSynonym(self):
        """Test CMSynonym"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
