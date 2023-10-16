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

from openapi_client.models.cm_delete_project_cmd import CMDeleteProjectCmd  # noqa: E501

class TestCMDeleteProjectCmd(unittest.TestCase):
    """CMDeleteProjectCmd unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMDeleteProjectCmd:
        """Test CMDeleteProjectCmd
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMDeleteProjectCmd`
        """
        model = CMDeleteProjectCmd()  # noqa: E501
        if include_optional:
            return CMDeleteProjectCmd(
                organisation_id = '',
                kb_id = '',
                project_id = '',
                job_id = '',
                return_address = '',
                error_str = '',
                time_out = 56,
                var_async = True,
                is_return_result = True,
                return_result = True
            )
        else:
            return CMDeleteProjectCmd(
                organisation_id = '',
                kb_id = '',
                project_id = '',
                job_id = '',
                return_address = '',
                error_str = '',
                time_out = 56,
                var_async = True,
                is_return_result = True,
        )
        """

    def testCMDeleteProjectCmd(self):
        """Test CMDeleteProjectCmd"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()