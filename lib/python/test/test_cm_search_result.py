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

from openapi_client.models.cm_search_result import CMSearchResult  # noqa: E501

class TestCMSearchResult(unittest.TestCase):
    """CMSearchResult unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMSearchResult:
        """Test CMSearchResult
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMSearchResult`
        """
        model = CMSearchResult()  # noqa: E501
        if include_optional:
            return CMSearchResult(
                kb_id = '00000000-0000-0000-0000-000000000001',
                url = 'https://simsage.ai/some/document.pdf',
                url_id = 22,
                source_id = 1,
                title = 'my little pony returns',
                author = 'John Elderberries',
                text_list = ["The little ponies were very excited."],
                text_index = 0,
                score = 231.22,
                sort_desc = True,
                qna_result = False,
                first_sentence = 0,
                created = 0,
                uploaded = 0,
                last_modified = 0,
                document_type = 'pdf',
                num_sentences = 3121,
                num_words = 31211,
                num_relationships = 231211,
                binary_size = 31211,
                text_size = 31211,
                file_type = 'Acrobat PDF 1.0.1',
                crawled = 0,
                converted = 0,
                parsed = 0,
                indexed = 0,
                previewed = 0,
                similar_document_list = [
                    openapi_client.models.cm_similar_document.CMSimilarDocument(
                        url = 'some-document.txt', 
                        url_id = 1, 
                        similarity = 1.337, )
                    ],
                related_list = [
                    openapi_client.models.cm_document_relationship.CMDocumentRelationship(
                        url_id = 1, 
                        is_child = True, 
                        related_url_id = 5, 
                        related_url = 'related-document.txt', 
                        web_url = 'https://server.com/related-document.txt', 
                        title = 'my title', 
                        binary_size = 1234, 
                        document_type = 'pdf', 
                        created = 56, 
                        last_modified = 56, 
                        child = True, )
                    ],
                metadata = {"person":3,"ms-file-type":"doc"},
                filename = 'index.html',
                folder_id = '(a guid)',
                render_type = 'rt search'
            )
        else:
            return CMSearchResult(
                kb_id = '00000000-0000-0000-0000-000000000001',
                url = 'https://simsage.ai/some/document.pdf',
                url_id = 22,
                source_id = 1,
                title = 'my little pony returns',
                author = 'John Elderberries',
                text_list = ["The little ponies were very excited."],
                text_index = 0,
                score = 231.22,
                sort_desc = True,
                qna_result = False,
                first_sentence = 0,
                created = 0,
                uploaded = 0,
                last_modified = 0,
                document_type = 'pdf',
                num_sentences = 3121,
                num_words = 31211,
                num_relationships = 231211,
                binary_size = 31211,
                text_size = 31211,
                file_type = 'Acrobat PDF 1.0.1',
                crawled = 0,
                converted = 0,
                parsed = 0,
                indexed = 0,
                previewed = 0,
                similar_document_list = [
                    openapi_client.models.cm_similar_document.CMSimilarDocument(
                        url = 'some-document.txt', 
                        url_id = 1, 
                        similarity = 1.337, )
                    ],
                related_list = [
                    openapi_client.models.cm_document_relationship.CMDocumentRelationship(
                        url_id = 1, 
                        is_child = True, 
                        related_url_id = 5, 
                        related_url = 'related-document.txt', 
                        web_url = 'https://server.com/related-document.txt', 
                        title = 'my title', 
                        binary_size = 1234, 
                        document_type = 'pdf', 
                        created = 56, 
                        last_modified = 56, 
                        child = True, )
                    ],
                metadata = {"person":3,"ms-file-type":"doc"},
                filename = 'index.html',
                folder_id = '(a guid)',
                render_type = 'rt search',
        )
        """

    def testCMSearchResult(self):
        """Test CMSearchResult"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
