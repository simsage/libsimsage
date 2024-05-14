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

from openapi_client.models.cm_document_folder import CMDocumentFolder  # noqa: E501

class TestCMDocumentFolder(unittest.TestCase):
    """CMDocumentFolder unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CMDocumentFolder:
        """Test CMDocumentFolder
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CMDocumentFolder`
        """
        model = CMDocumentFolder()  # noqa: E501
        if include_optional:
            return CMDocumentFolder(
                source_id = 1,
                url = '/folder-1/document-1',
                parent_folder_id = '',
                folder_id = '',
                url_id = 22,
                folder_name = 'folder-1',
                item_type = 'dms',
                folder_list = [
                    openapi_client.models.cm_document_folder.CMDocumentFolder(
                        source_id = 1, 
                        url = '/folder-1/document-1', 
                        parent_folder_id = '', 
                        folder_id = '', 
                        url_id = 22, 
                        folder_name = 'folder-1', 
                        item_type = 'dms', 
                        folder_list = [
                            openapi_client.models.cm_document_folder.CMDocumentFolder(
                                source_id = 1, 
                                url = '/folder-1/document-1', 
                                parent_folder_id = '', 
                                folder_id = '', 
                                url_id = 22, 
                                folder_name = 'folder-1', 
                                item_type = 'dms', 
                                folder_list = [
                                    
                                    ], 
                                file_list = [
                                    openapi_client.models.cm_document.CMDocument(
                                        organisation_id = '', 
                                        kb_id = '', 
                                        url = 'document-1', 
                                        url_id = 1, 
                                        origin = 'uploaded', 
                                        title = 'My little pony.', 
                                        author = 'John Manyberries', 
                                        document_type = 'many possible values, eg. doc,pdf,html', 
                                        created = 56, 
                                        uploaded = 56, 
                                        last_modified = 56, 
                                        crawled = 56, 
                                        converted = 56, 
                                        parsed = 56, 
                                        indexed = 56, 
                                        previewed = 56, 
                                        change_hash = '118f6bcd4621d373cade4e832627b4cc', 
                                        content_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                        source_id = 1, 
                                        parent_url = '', 
                                        acls = [
                                            openapi_client.models.cm_document_acl.CMDocumentAcl(
                                                acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                                                access = 'RW', 
                                                is_user = True, 
                                                user = True, )
                                            ], 
                                        metadata = {"file-extension":"txt"}, 
                                        num_sentences = 56, 
                                        num_words = 56, 
                                        num_relationships = 56, 
                                        binary_size = 56, 
                                        text_size = 56, 
                                        version_list = [
                                            openapi_client.models.cm_document_version.CMDocumentVersion(
                                                url = 'https://server.com/document-1', 
                                                version = 1, 
                                                change_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                                created = 56, )
                                            ], 
                                        note_list = [
                                            openapi_client.models.cm_document_note.CMDocumentNote(
                                                organisation_id = '', 
                                                kb_id = '', 
                                                url = 'document-1', 
                                                note_id = 1, 
                                                note_text = 'example text', 
                                                user_id = '1234', 
                                                email = 'joe@bloggs.com', 
                                                created = 56, )
                                            ], 
                                        activity_list = [
                                            openapi_client.models.cm_document_audit.CMDocumentAudit(
                                                organisation_id = '', 
                                                kb_id = '', 
                                                url = 'document-1', 
                                                user_id = '1234', 
                                                email = 'joe@bloggs.com', 
                                                description = 'something happened', 
                                                created = 56, )
                                            ], 
                                        type_description = 'Portable Network Graphics', 
                                        filename = 'index.html', 
                                        folder_id = '(a guid)', )
                                    ], 
                                acls = [
                                    openapi_client.models.cm_document_acl.CMDocumentAcl(
                                        acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                                        access = 'RW', 
                                        is_user = True, 
                                        user = True, )
                                    ], )
                            ], 
                        file_list = [
                            openapi_client.models.cm_document.CMDocument(
                                organisation_id = '', 
                                kb_id = '', 
                                url = 'document-1', 
                                url_id = 1, 
                                origin = 'uploaded', 
                                title = 'My little pony.', 
                                author = 'John Manyberries', 
                                document_type = 'many possible values, eg. doc,pdf,html', 
                                created = 56, 
                                uploaded = 56, 
                                last_modified = 56, 
                                crawled = 56, 
                                converted = 56, 
                                parsed = 56, 
                                indexed = 56, 
                                previewed = 56, 
                                change_hash = '118f6bcd4621d373cade4e832627b4cc', 
                                content_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                source_id = 1, 
                                parent_url = '', 
                                acls = [
                                    
                                    ], 
                                metadata = {"file-extension":"txt"}, 
                                num_sentences = 56, 
                                num_words = 56, 
                                num_relationships = 56, 
                                binary_size = 56, 
                                text_size = 56, 
                                version_list = [
                                    openapi_client.models.cm_document_version.CMDocumentVersion(
                                        url = 'https://server.com/document-1', 
                                        version = 1, 
                                        change_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                        created = 56, )
                                    ], 
                                note_list = [
                                    openapi_client.models.cm_document_note.CMDocumentNote(
                                        organisation_id = '', 
                                        kb_id = '', 
                                        url = 'document-1', 
                                        note_id = 1, 
                                        note_text = 'example text', 
                                        user_id = '1234', 
                                        email = 'joe@bloggs.com', 
                                        created = 56, )
                                    ], 
                                activity_list = [
                                    openapi_client.models.cm_document_audit.CMDocumentAudit(
                                        organisation_id = '', 
                                        kb_id = '', 
                                        url = 'document-1', 
                                        user_id = '1234', 
                                        email = 'joe@bloggs.com', 
                                        description = 'something happened', 
                                        created = 56, )
                                    ], 
                                type_description = 'Portable Network Graphics', 
                                filename = 'index.html', 
                                folder_id = '(a guid)', )
                            ], 
                        acls = [
                            
                            ], )
                    ],
                file_list = [
                    openapi_client.models.cm_document.CMDocument(
                        organisation_id = '', 
                        kb_id = '', 
                        url = 'document-1', 
                        url_id = 1, 
                        origin = 'uploaded', 
                        title = 'My little pony.', 
                        author = 'John Manyberries', 
                        document_type = 'many possible values, eg. doc,pdf,html', 
                        created = 56, 
                        uploaded = 56, 
                        last_modified = 56, 
                        crawled = 56, 
                        converted = 56, 
                        parsed = 56, 
                        indexed = 56, 
                        previewed = 56, 
                        change_hash = '118f6bcd4621d373cade4e832627b4cc', 
                        content_hash = '098f6bcd4621d373cade4e832627b4f6', 
                        source_id = 1, 
                        parent_url = '', 
                        acls = [
                            openapi_client.models.cm_document_acl.CMDocumentAcl(
                                acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                                access = 'RW', 
                                is_user = True, 
                                user = True, )
                            ], 
                        metadata = {"file-extension":"txt"}, 
                        num_sentences = 56, 
                        num_words = 56, 
                        num_relationships = 56, 
                        binary_size = 56, 
                        text_size = 56, 
                        version_list = [
                            openapi_client.models.cm_document_version.CMDocumentVersion(
                                url = 'https://server.com/document-1', 
                                version = 1, 
                                change_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                created = 56, )
                            ], 
                        note_list = [
                            openapi_client.models.cm_document_note.CMDocumentNote(
                                organisation_id = '', 
                                kb_id = '', 
                                url = 'document-1', 
                                note_id = 1, 
                                note_text = 'example text', 
                                user_id = '1234', 
                                email = 'joe@bloggs.com', 
                                created = 56, )
                            ], 
                        activity_list = [
                            openapi_client.models.cm_document_audit.CMDocumentAudit(
                                organisation_id = '', 
                                kb_id = '', 
                                url = 'document-1', 
                                user_id = '1234', 
                                email = 'joe@bloggs.com', 
                                description = 'something happened', 
                                created = 56, )
                            ], 
                        type_description = 'Portable Network Graphics', 
                        filename = 'index.html', 
                        folder_id = '(a guid)', )
                    ],
                acls = [
                    openapi_client.models.cm_document_acl.CMDocumentAcl(
                        acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                        access = 'RW', 
                        is_user = True, 
                        user = True, )
                    ]
            )
        else:
            return CMDocumentFolder(
                source_id = 1,
                url = '/folder-1/document-1',
                parent_folder_id = '',
                folder_id = '',
                url_id = 22,
                folder_name = 'folder-1',
                item_type = 'dms',
                folder_list = [
                    openapi_client.models.cm_document_folder.CMDocumentFolder(
                        source_id = 1, 
                        url = '/folder-1/document-1', 
                        parent_folder_id = '', 
                        folder_id = '', 
                        url_id = 22, 
                        folder_name = 'folder-1', 
                        item_type = 'dms', 
                        folder_list = [
                            openapi_client.models.cm_document_folder.CMDocumentFolder(
                                source_id = 1, 
                                url = '/folder-1/document-1', 
                                parent_folder_id = '', 
                                folder_id = '', 
                                url_id = 22, 
                                folder_name = 'folder-1', 
                                item_type = 'dms', 
                                folder_list = [
                                    
                                    ], 
                                file_list = [
                                    openapi_client.models.cm_document.CMDocument(
                                        organisation_id = '', 
                                        kb_id = '', 
                                        url = 'document-1', 
                                        url_id = 1, 
                                        origin = 'uploaded', 
                                        title = 'My little pony.', 
                                        author = 'John Manyberries', 
                                        document_type = 'many possible values, eg. doc,pdf,html', 
                                        created = 56, 
                                        uploaded = 56, 
                                        last_modified = 56, 
                                        crawled = 56, 
                                        converted = 56, 
                                        parsed = 56, 
                                        indexed = 56, 
                                        previewed = 56, 
                                        change_hash = '118f6bcd4621d373cade4e832627b4cc', 
                                        content_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                        source_id = 1, 
                                        parent_url = '', 
                                        acls = [
                                            openapi_client.models.cm_document_acl.CMDocumentAcl(
                                                acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                                                access = 'RW', 
                                                is_user = True, 
                                                user = True, )
                                            ], 
                                        metadata = {"file-extension":"txt"}, 
                                        num_sentences = 56, 
                                        num_words = 56, 
                                        num_relationships = 56, 
                                        binary_size = 56, 
                                        text_size = 56, 
                                        version_list = [
                                            openapi_client.models.cm_document_version.CMDocumentVersion(
                                                url = 'https://server.com/document-1', 
                                                version = 1, 
                                                change_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                                created = 56, )
                                            ], 
                                        note_list = [
                                            openapi_client.models.cm_document_note.CMDocumentNote(
                                                organisation_id = '', 
                                                kb_id = '', 
                                                url = 'document-1', 
                                                note_id = 1, 
                                                note_text = 'example text', 
                                                user_id = '1234', 
                                                email = 'joe@bloggs.com', 
                                                created = 56, )
                                            ], 
                                        activity_list = [
                                            openapi_client.models.cm_document_audit.CMDocumentAudit(
                                                organisation_id = '', 
                                                kb_id = '', 
                                                url = 'document-1', 
                                                user_id = '1234', 
                                                email = 'joe@bloggs.com', 
                                                description = 'something happened', 
                                                created = 56, )
                                            ], 
                                        type_description = 'Portable Network Graphics', 
                                        filename = 'index.html', 
                                        folder_id = '(a guid)', )
                                    ], 
                                acls = [
                                    openapi_client.models.cm_document_acl.CMDocumentAcl(
                                        acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                                        access = 'RW', 
                                        is_user = True, 
                                        user = True, )
                                    ], )
                            ], 
                        file_list = [
                            openapi_client.models.cm_document.CMDocument(
                                organisation_id = '', 
                                kb_id = '', 
                                url = 'document-1', 
                                url_id = 1, 
                                origin = 'uploaded', 
                                title = 'My little pony.', 
                                author = 'John Manyberries', 
                                document_type = 'many possible values, eg. doc,pdf,html', 
                                created = 56, 
                                uploaded = 56, 
                                last_modified = 56, 
                                crawled = 56, 
                                converted = 56, 
                                parsed = 56, 
                                indexed = 56, 
                                previewed = 56, 
                                change_hash = '118f6bcd4621d373cade4e832627b4cc', 
                                content_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                source_id = 1, 
                                parent_url = '', 
                                acls = [
                                    
                                    ], 
                                metadata = {"file-extension":"txt"}, 
                                num_sentences = 56, 
                                num_words = 56, 
                                num_relationships = 56, 
                                binary_size = 56, 
                                text_size = 56, 
                                version_list = [
                                    openapi_client.models.cm_document_version.CMDocumentVersion(
                                        url = 'https://server.com/document-1', 
                                        version = 1, 
                                        change_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                        created = 56, )
                                    ], 
                                note_list = [
                                    openapi_client.models.cm_document_note.CMDocumentNote(
                                        organisation_id = '', 
                                        kb_id = '', 
                                        url = 'document-1', 
                                        note_id = 1, 
                                        note_text = 'example text', 
                                        user_id = '1234', 
                                        email = 'joe@bloggs.com', 
                                        created = 56, )
                                    ], 
                                activity_list = [
                                    openapi_client.models.cm_document_audit.CMDocumentAudit(
                                        organisation_id = '', 
                                        kb_id = '', 
                                        url = 'document-1', 
                                        user_id = '1234', 
                                        email = 'joe@bloggs.com', 
                                        description = 'something happened', 
                                        created = 56, )
                                    ], 
                                type_description = 'Portable Network Graphics', 
                                filename = 'index.html', 
                                folder_id = '(a guid)', )
                            ], 
                        acls = [
                            
                            ], )
                    ],
                file_list = [
                    openapi_client.models.cm_document.CMDocument(
                        organisation_id = '', 
                        kb_id = '', 
                        url = 'document-1', 
                        url_id = 1, 
                        origin = 'uploaded', 
                        title = 'My little pony.', 
                        author = 'John Manyberries', 
                        document_type = 'many possible values, eg. doc,pdf,html', 
                        created = 56, 
                        uploaded = 56, 
                        last_modified = 56, 
                        crawled = 56, 
                        converted = 56, 
                        parsed = 56, 
                        indexed = 56, 
                        previewed = 56, 
                        change_hash = '118f6bcd4621d373cade4e832627b4cc', 
                        content_hash = '098f6bcd4621d373cade4e832627b4f6', 
                        source_id = 1, 
                        parent_url = '', 
                        acls = [
                            openapi_client.models.cm_document_acl.CMDocumentAcl(
                                acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                                access = 'RW', 
                                is_user = True, 
                                user = True, )
                            ], 
                        metadata = {"file-extension":"txt"}, 
                        num_sentences = 56, 
                        num_words = 56, 
                        num_relationships = 56, 
                        binary_size = 56, 
                        text_size = 56, 
                        version_list = [
                            openapi_client.models.cm_document_version.CMDocumentVersion(
                                url = 'https://server.com/document-1', 
                                version = 1, 
                                change_hash = '098f6bcd4621d373cade4e832627b4f6', 
                                created = 56, )
                            ], 
                        note_list = [
                            openapi_client.models.cm_document_note.CMDocumentNote(
                                organisation_id = '', 
                                kb_id = '', 
                                url = 'document-1', 
                                note_id = 1, 
                                note_text = 'example text', 
                                user_id = '1234', 
                                email = 'joe@bloggs.com', 
                                created = 56, )
                            ], 
                        activity_list = [
                            openapi_client.models.cm_document_audit.CMDocumentAudit(
                                organisation_id = '', 
                                kb_id = '', 
                                url = 'document-1', 
                                user_id = '1234', 
                                email = 'joe@bloggs.com', 
                                description = 'something happened', 
                                created = 56, )
                            ], 
                        type_description = 'Portable Network Graphics', 
                        filename = 'index.html', 
                        folder_id = '(a guid)', )
                    ],
                acls = [
                    openapi_client.models.cm_document_acl.CMDocumentAcl(
                        acl = 'e.g. "example@simsage.co.uk" or "domain users"', 
                        access = 'RW', 
                        is_user = True, 
                        user = True, )
                    ],
        )
        """

    def testCMDocumentFolder(self):
        """Test CMDocumentFolder"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
