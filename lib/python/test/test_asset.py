# coding: utf-8

"""
    SimSage REST API

    SimSage REST API

    The version of the OpenAPI document: 7.13.31
    Contact: info@simsage.co.uk
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest
import datetime

from openapi_client.models.asset import Asset  # noqa: E501

class TestAsset(unittest.TestCase):
    """Asset unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Asset:
        """Test Asset
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Asset`
        """
        model = Asset()  # noqa: E501
        if include_optional:
            return Asset(
                url = '',
                parent_url = '',
                mime_type = '',
                acls = [
                    openapi_client.models.asset_acl.AssetACL(
                        name = '', 
                        display_name = '', 
                        access = '', 
                        is_user = True, 
                        membership_list = [
                            ''
                            ], 
                        user = True, )
                    ],
                title = '',
                author = '',
                binary_size = 56,
                template = '',
                created = 56,
                last_modified = 56,
                metadata = {
                    'key' : ''
                    },
                data = 'YQ==',
                preview_image = 'YQ=='
            )
        else:
            return Asset(
                url = '',
                parent_url = '',
                mime_type = '',
                acls = [
                    openapi_client.models.asset_acl.AssetACL(
                        name = '', 
                        display_name = '', 
                        access = '', 
                        is_user = True, 
                        membership_list = [
                            ''
                            ], 
                        user = True, )
                    ],
                title = '',
                author = '',
                binary_size = 56,
                template = '',
                created = 56,
                last_modified = 56,
                metadata = {
                    'key' : ''
                    },
        )
        """

    def testAsset(self):
        """Test Asset"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
