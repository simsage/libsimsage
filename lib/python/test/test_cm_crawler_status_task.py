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

from openapi_client.models.cm_crawler_status_task import CMCrawlerStatusTask  # noqa: E501

class TestCMCrawlerStatusTask(unittest.TestCase):
    """CMCrawlerStatusTask unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMCrawlerStatusTask:
        """Test CMCrawlerStatusTask
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMCrawlerStatusTask`
        """
        model = CMCrawlerStatusTask()  # noqa: E501
        if include_optional:
            return CMCrawlerStatusTask(
                task_info = openapi_client.models.cm_task_info.CMTaskInfo(
                    task_id = '', 
                    project_id = '', 
                    organisation_id = '', 
                    source_kb_id = '', 
                    crawler_kb_id = '', 
                    project_type = '', 
                    project_title = '', 
                    project_narrative = '', 
                    slice_id = '', 
                    process_id = '', 
                    process_name = '', 
                    task_type = '', 
                    task_name = '', 
                    date_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    date_completed = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    potential_users = '', 
                    excluded_users = '', 
                    potential_groups = '', 
                    assigned_user = '', ),
                detail = openapi_client.models.cm_crawler_status.CMCrawlerStatus(
                    organisation_id = '', 
                    kb_id = '', 
                    project_title = '', 
                    project_type = '', 
                    crawler_id = '', 
                    crawler_name = '', 
                    start_time = 56, 
                    end_time = 56, 
                    is_running = True, 
                    specific_json = '', )
            )
        else:
            return CMCrawlerStatusTask(
                task_info = openapi_client.models.cm_task_info.CMTaskInfo(
                    task_id = '', 
                    project_id = '', 
                    organisation_id = '', 
                    source_kb_id = '', 
                    crawler_kb_id = '', 
                    project_type = '', 
                    project_title = '', 
                    project_narrative = '', 
                    slice_id = '', 
                    process_id = '', 
                    process_name = '', 
                    task_type = '', 
                    task_name = '', 
                    date_created = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    date_completed = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'), 
                    potential_users = '', 
                    excluded_users = '', 
                    potential_groups = '', 
                    assigned_user = '', ),
                detail = openapi_client.models.cm_crawler_status.CMCrawlerStatus(
                    organisation_id = '', 
                    kb_id = '', 
                    project_title = '', 
                    project_type = '', 
                    crawler_id = '', 
                    crawler_name = '', 
                    start_time = 56, 
                    end_time = 56, 
                    is_running = True, 
                    specific_json = '', ),
        )
        """

    def testCMCrawlerStatusTask(self):
        """Test CMCrawlerStatusTask"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
