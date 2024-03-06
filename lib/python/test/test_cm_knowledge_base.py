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

from openapi_client.models.cm_knowledge_base import CMKnowledgeBase  # noqa: E501

class TestCMKnowledgeBase(unittest.TestCase):
    """CMKnowledgeBase unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMKnowledgeBase:
        """Test CMKnowledgeBase
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMKnowledgeBase`
        """
        model = CMKnowledgeBase()  # noqa: E501
        if include_optional:
            return CMKnowledgeBase(
                organisation_id = '',
                kb_id = '',
                name = 'My little Pony knowledge-base',
                email = 'example@simsage.co.uk',
                security_id = '',
                created = 56,
                max_queries_per_day = 5000,
                analytics_window_in_months = 12,
                enabled = True,
                operator_enabled = True,
                capacity_warnings = True,
                index_schedule = 'eg. If we want to optimize the indexes every Monday from midnight to 1am, and Tuesday 5pm (GMT), we'd use: "mon-00,tue-17"',
                last_index_optimization_time = 56
            )
        else:
            return CMKnowledgeBase(
                organisation_id = '',
                kb_id = '',
                name = 'My little Pony knowledge-base',
                email = 'example@simsage.co.uk',
                security_id = '',
                created = 56,
                max_queries_per_day = 5000,
                analytics_window_in_months = 12,
                enabled = True,
                operator_enabled = True,
                capacity_warnings = True,
                index_schedule = 'eg. If we want to optimize the indexes every Monday from midnight to 1am, and Tuesday 5pm (GMT), we'd use: "mon-00,tue-17"',
                last_index_optimization_time = 56,
        )
        """

    def testCMKnowledgeBase(self):
        """Test CMKnowledgeBase"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
