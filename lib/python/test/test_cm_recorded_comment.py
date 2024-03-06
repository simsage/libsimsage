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

from openapi_client.models.cm_recorded_comment import CMRecordedComment  # noqa: E501

class TestCMRecordedComment(unittest.TestCase):
    """CMRecordedComment unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMRecordedComment:
        """Test CMRecordedComment
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMRecordedComment`
        """
        model = CMRecordedComment()  # noqa: E501
        if include_optional:
            return CMRecordedComment(
                created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                project_id = '',
                slice_id = '',
                document_key = '',
                comment_level = '',
                comment = '',
                user = '',
                is_audit_event = True
            )
        else:
            return CMRecordedComment(
                created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                project_id = '',
                slice_id = '',
                document_key = '',
                comment_level = '',
                comment = '',
                user = '',
                is_audit_event = True,
        )
        """

    def testCMRecordedComment(self):
        """Test CMRecordedComment"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
