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

from openapi_client.api.auth_api import AuthApi  # noqa: E501


class TestAuthApi(unittest.TestCase):
    """AuthApi unit test stubs"""

    def setUp(self) -> None:
        self.api = AuthApi()  # noqa: E501

    def tearDown(self) -> None:
        pass

    def test_delete_group(self) -> None:
        """Test case for delete_group

        Delete Group  # noqa: E501
        """
        pass

    def test_delete_organisation(self) -> None:
        """Test case for delete_organisation

        Delete Organisation  # noqa: E501
        """
        pass

    def test_get_groups(self) -> None:
        """Test case for get_groups

        Get Groups  # noqa: E501
        """
        pass

    def test_get_ott(self) -> None:
        """Test case for get_ott

        Get a one-time token.  # noqa: E501
        """
        pass

    def test_get_user_organisation_list(self) -> None:
        """Test case for get_user_organisation_list

        Get a list of Organisations  # noqa: E501
        """
        pass

    def test_get_users_paginated(self) -> None:
        """Test case for get_users_paginated

        Get Users paginated  # noqa: E501
        """
        pass

    def test_import_users_and_groups(self) -> None:
        """Test case for import_users_and_groups

        """
        pass

    def test_my_roles(self) -> None:
        """Test case for my_roles

        Get users application roles  # noqa: E501
        """
        pass

    def test_remove_user_from_organisation(self) -> None:
        """Test case for remove_user_from_organisation

        Remove User from Organisation  # noqa: E501
        """
        pass

    def test_reset_password(self) -> None:
        """Test case for reset_password

        Perform a password-reset request.  # noqa: E501
        """
        pass

    def test_reset_password_request(self) -> None:
        """Test case for reset_password_request

        Password Reset Request  # noqa: E501
        """
        pass

    def test_save_group(self) -> None:
        """Test case for save_group

        Save Group  # noqa: E501
        """
        pass

    def test_sign_in(self) -> None:
        """Test case for sign_in

        Sign In  # noqa: E501
        """
        pass

    def test_sign_in_admin_using_jwt_msal(self) -> None:
        """Test case for sign_in_admin_using_jwt_msal

        JWT MSal Sign In  # noqa: E501
        """
        pass

    def test_sign_in_dms_using_jwt_msal(self) -> None:
        """Test case for sign_in_dms_using_jwt_msal

        JWT MSal Sign In  # noqa: E501
        """
        pass

    def test_sign_in_evolve_using_jwt_msal(self) -> None:
        """Test case for sign_in_evolve_using_jwt_msal

        JWT MSal Sign In  # noqa: E501
        """
        pass

    def test_sign_in_search_using_jwt_msal(self) -> None:
        """Test case for sign_in_search_using_jwt_msal

        JWT MSal Sign In  # noqa: E501
        """
        pass

    def test_sign_out(self) -> None:
        """Test case for sign_out

        Sign Out  # noqa: E501
        """
        pass

    def test_update_organisation(self) -> None:
        """Test case for update_organisation

        Save Organisation  # noqa: E501
        """
        pass

    def test_update_user(self) -> None:
        """Test case for update_user

        """
        pass

    def test_version8(self) -> None:
        """Test case for version8

        Get Version  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()