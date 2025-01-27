Feature: Sync
  Scenario: as a user I want to verify the Users list by API
    Given the base URL is "https://gorest.co.in"
    When I consult users with GET "/public/v2/users"
    Then The response code should be 200

    Given the base URL for create users is "https://gorest.co.in"
    When I create users with POST "/public/v2/users"
"""
{
"name":"Tenali Ramakrishna",
"gender":"male",
"email":"user+14@user.com",
"status":"active"
}
"""
    Then The response code for POST should be 201

    Given the base URL for update user is "https://gorest.co.in"
    When I update with PATCH "/public/v2/users/7621831"
    Then The response code for patch should be 200

    Given the base URL for delete user is "https://gorest.co.in"
    When I delete a user with DELETE "/public/v2/users/7637413"
    Then The response code for delete should be 204

