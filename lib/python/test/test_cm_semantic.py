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

from openapi_client.models.cm_semantic import CMSemantic  # noqa: E501

class TestCMSemantic(unittest.TestCase):
    """CMSemantic unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSemantic:
        """Test CMSemantic
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSemantic`
        """
        model = CMSemantic()  # noqa: E501
        if include_optional:
            return CMSemantic(
                word = 'John',
                semantic = 'person'
            )
        else:
            return CMSemantic(
                word = 'John',
                semantic = 'person',
        )
        """

    def testCMSemantic(self):
        """Test CMSemantic"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
