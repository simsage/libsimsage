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

from openapi_client.models.knowledge_base import KnowledgeBase  # noqa: E501

class TestKnowledgeBase(unittest.TestCase):
    """KnowledgeBase unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> KnowledgeBase:
        """Test KnowledgeBase
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `KnowledgeBase`
        """
        model = KnowledgeBase()  # noqa: E501
        if include_optional:
            return KnowledgeBase(
                kb_id = '',
                organisation_id = '',
                name = '',
                email = '',
                security_id = '',
                created = 56,
                max_queries_per_day = 56,
                analytics_window_in_months = 56,
                enabled = True,
                operator_enabled = True,
                capacity_warnings = True,
                index_schedule = '',
                last_index_optimization_time = 56
            )
        else:
            return KnowledgeBase(
                kb_id = '',
                organisation_id = '',
                name = '',
                email = '',
                security_id = '',
                created = 56,
                max_queries_per_day = 56,
                analytics_window_in_months = 56,
                enabled = True,
                operator_enabled = True,
                capacity_warnings = True,
                index_schedule = '',
                last_index_optimization_time = 56,
        )
        """

    def testKnowledgeBase(self):
        """Test KnowledgeBase"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
