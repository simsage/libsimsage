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

from openapi_client.models.cm_queue_item import CMQueueItem  # noqa: E501

class TestCMQueueItem(unittest.TestCase):
    """CMQueueItem unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMQueueItem:
        """Test CMQueueItem
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMQueueItem`
        """
        model = CMQueueItem()  # noqa: E501
        if include_optional:
            return CMQueueItem(
                organisation_id = '',
                process_id = '',
                project_id = '',
                task_id = '',
                project_type = '',
                task_type = '',
                task_screen = '',
                project_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                date_task_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                project_title = '',
                task_name = '',
                assigned_user = '',
                potential_users = [
                    ''
                    ],
                excluded_users = [
                    ''
                    ],
                potential_groups = [
                    ''
                    ],
                owns_item = True,
                can_claim = True,
                can_release = True,
                lock_type = ''
            )
        else:
            return CMQueueItem(
                organisation_id = '',
                process_id = '',
                project_id = '',
                task_id = '',
                project_type = '',
                task_type = '',
                task_screen = '',
                project_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                date_task_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                project_title = '',
                task_name = '',
                assigned_user = '',
                potential_users = [
                    ''
                    ],
                excluded_users = [
                    ''
                    ],
                potential_groups = [
                    ''
                    ],
                owns_item = True,
                can_claim = True,
                can_release = True,
                lock_type = '',
        )
        """

    def testCMQueueItem(self):
        """Test CMQueueItem"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
