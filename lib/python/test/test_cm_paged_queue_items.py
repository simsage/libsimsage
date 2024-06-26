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

from openapi_client.models.cm_paged_queue_items import CMPagedQueueItems  # noqa: E501

class TestCMPagedQueueItems(unittest.TestCase):
    """CMPagedQueueItems unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMPagedQueueItems:
        """Test CMPagedQueueItems
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMPagedQueueItems`
        """
        model = CMPagedQueueItems()  # noqa: E501
        if include_optional:
            return CMPagedQueueItems(
                total = 56,
                results = [
                    openapi_client.models.cm_queue_item.CMQueueItem(
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
                        lock_type = '', )
                    ]
            )
        else:
            return CMPagedQueueItems(
                total = 56,
                results = [
                    openapi_client.models.cm_queue_item.CMQueueItem(
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
                        lock_type = '', )
                    ],
        )
        """

    def testCMPagedQueueItems(self):
        """Test CMPagedQueueItems"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
