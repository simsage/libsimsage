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

from openapi_client.models.cm_start_project import CMStartProject  # noqa: E501

class TestCMStartProject(unittest.TestCase):
    """CMStartProject unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMStartProject:
        """Test CMStartProject
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMStartProject`
        """
        model = CMStartProject()  # noqa: E501
        if include_optional:
            return CMStartProject(
                task_id = '',
                organisation_id = ''
            )
        else:
            return CMStartProject(
                task_id = '',
                organisation_id = '',
        )
        """

    def testCMStartProject(self):
        """Test CMStartProject"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
