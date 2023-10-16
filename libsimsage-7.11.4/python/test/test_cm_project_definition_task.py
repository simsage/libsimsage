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

from openapi_client.models.cm_project_definition_task import CMProjectDefinitionTask  # noqa: E501

class TestCMProjectDefinitionTask(unittest.TestCase):
    """CMProjectDefinitionTask unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMProjectDefinitionTask:
        """Test CMProjectDefinitionTask
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMProjectDefinitionTask`
        """
        model = CMProjectDefinitionTask()  # noqa: E501
        if include_optional:
            return CMProjectDefinitionTask(
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
                detail = openapi_client.models.cm_project_definition.CMProjectDefinition(
                    project_id = '', 
                    task_id = '', 
                    organisation_id = '', 
                    project_frame = openapi_client.models.cm_project_frame.CMProjectFrame(
                        project_type = '', 
                        title = '', 
                        narrative = '', ), 
                    keyed_search_terms = [
                        openapi_client.models.cm_keyed_search_term.CMKeyedSearchTerm(
                            key = '', 
                            redact = True, 
                            redaction_disabled = True, 
                            row_required = True, 
                            search = True, 
                            search_disabled = True, 
                            value = '', 
                            sub_terms = [
                                openapi_client.models.cm_search_sub_term.CMSearchSubTerm(
                                    key = '', 
                                    value = '', 
                                    type = '', )
                                ], )
                        ], 
                    semantic_terms = [
                        openapi_client.models.cm_semantic_term.CMSemanticTerm(
                            key = '', 
                            redact = True, 
                            redaction_disabled = True, 
                            search = True, 
                            search_disabled = True, 
                            caption = '', )
                        ], 
                    filters = openapi_client.models.cm_filter.CMFilter(
                        knowledge_base = '', 
                        filetypes = [
                            ''
                            ], 
                        sources = [
                            ''
                            ], ), 
                    validation_result = {
                        'key' : True
                        }, )
            )
        else:
            return CMProjectDefinitionTask(
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
                detail = openapi_client.models.cm_project_definition.CMProjectDefinition(
                    project_id = '', 
                    task_id = '', 
                    organisation_id = '', 
                    project_frame = openapi_client.models.cm_project_frame.CMProjectFrame(
                        project_type = '', 
                        title = '', 
                        narrative = '', ), 
                    keyed_search_terms = [
                        openapi_client.models.cm_keyed_search_term.CMKeyedSearchTerm(
                            key = '', 
                            redact = True, 
                            redaction_disabled = True, 
                            row_required = True, 
                            search = True, 
                            search_disabled = True, 
                            value = '', 
                            sub_terms = [
                                openapi_client.models.cm_search_sub_term.CMSearchSubTerm(
                                    key = '', 
                                    value = '', 
                                    type = '', )
                                ], )
                        ], 
                    semantic_terms = [
                        openapi_client.models.cm_semantic_term.CMSemanticTerm(
                            key = '', 
                            redact = True, 
                            redaction_disabled = True, 
                            search = True, 
                            search_disabled = True, 
                            caption = '', )
                        ], 
                    filters = openapi_client.models.cm_filter.CMFilter(
                        knowledge_base = '', 
                        filetypes = [
                            ''
                            ], 
                        sources = [
                            ''
                            ], ), 
                    validation_result = {
                        'key' : True
                        }, ),
        )
        """

    def testCMProjectDefinitionTask(self):
        """Test CMProjectDefinitionTask"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
