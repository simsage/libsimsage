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

from openapi_client.models.cm_semantic_term import CMSemanticTerm  # noqa: E501

class TestCMSemanticTerm(unittest.TestCase):
    """CMSemanticTerm unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSemanticTerm:
        """Test CMSemanticTerm
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSemanticTerm`
        """
        model = CMSemanticTerm()  # noqa: E501
        if include_optional:
            return CMSemanticTerm(
                key = '',
                redact = True,
                redaction_disabled = True,
                search = True,
                search_disabled = True,
                caption = ''
            )
        else:
            return CMSemanticTerm(
                key = '',
                redact = True,
                redaction_disabled = True,
                search = True,
                search_disabled = True,
                caption = '',
        )
        """

    def testCMSemanticTerm(self):
        """Test CMSemanticTerm"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
