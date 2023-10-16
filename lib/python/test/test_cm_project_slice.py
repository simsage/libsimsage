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

from openapi_client.models.cm_project_slice import CMProjectSlice  # noqa: E501

class TestCMProjectSlice(unittest.TestCase):
    """CMProjectSlice unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMProjectSlice:
        """Test CMProjectSlice
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMProjectSlice`
        """
        model = CMProjectSlice()  # noqa: E501
        if include_optional:
            return CMProjectSlice(
                id = '',
                project_id = '',
                name = '',
                description = '',
                action = '',
                reassignment_options = [
                    openapi_client.models.cm_slice_reassignment.CMSliceReassignment(
                        slice_id = '', 
                        slice_name = '', 
                        users = [
                            ''
                            ], )
                    ]
            )
        else:
            return CMProjectSlice(
                id = '',
                project_id = '',
                name = '',
                description = '',
                action = '',
                reassignment_options = [
                    openapi_client.models.cm_slice_reassignment.CMSliceReassignment(
                        slice_id = '', 
                        slice_name = '', 
                        users = [
                            ''
                            ], )
                    ],
        )
        """

    def testCMProjectSlice(self):
        """Test CMProjectSlice"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()