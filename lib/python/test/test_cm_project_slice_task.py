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

from openapi_client.models.cm_project_slice_task import CMProjectSliceTask  # noqa: E501

class TestCMProjectSliceTask(unittest.TestCase):
    """CMProjectSliceTask unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMProjectSliceTask:
        """Test CMProjectSliceTask
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMProjectSliceTask`
        """
        model = CMProjectSliceTask()  # noqa: E501
        if include_optional:
            return CMProjectSliceTask(
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
                detail = openapi_client.models.cm_project_slice.CMProjectSlice(
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
                        ], )
            )
        else:
            return CMProjectSliceTask(
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
                detail = openapi_client.models.cm_project_slice.CMProjectSlice(
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
                        ], ),
        )
        """

    def testCMProjectSliceTask(self):
        """Test CMProjectSliceTask"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
