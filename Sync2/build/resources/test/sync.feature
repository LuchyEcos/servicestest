Feature: Sync
  Scenario: as a user I want to verify the microservices of Sync by API
    Given the base URL is "http://test.datec.com.bo:3550"
    When I consult sync with POST "/api/v1/sync/portal/1015537027/E3001"
    Then The response code should be 201

    Given the base URL for error NIT is "http://test.datec.com.bo:3550"
    When I consult sync with error 0 with POST "/api/v1/sync/portal/9900793/E3002"
    Then The response error code 1 should be 400

    Given the base URL for Invalid NIT is "http://test.datec.com.bo:3550"
    When I consult sync with error 1 with POST "/api/v1/sync/portal/0/E3003"
    Then The response error code 2 should be 400

    Given the base URL for Invalid Sync code is "http://test.datec.com.bo:3550"
    When I consult sync with error 2 with POST "/api/v1/sync/portal/1015537027/E0000"
    Then The response error code 3 should be 400

    Given the base URL for Sync date is "http://test.datec.com.bo:3550"
    When I consult sync date with POST "/api/v1/sync/portal/1015537027/E3002"
    Then The response code for Sync date should be 201

    Given the base URL for Sync document is "http://test.datec.com.bo:3550"
    When I consult sync document with POST "/api/v1/sync/portal/1015537027/E3003"
    Then The response code for Sync document should be 201

    Given the base URL for Sync legend is "http://test.datec.com.bo:3550"
    When I consult sync legend with POST "/api/v1/sync/portal/1015537027/E3004"
    Then The response code for Sync legend should be 201

    Given the base URL for Sync messages services is "http://test.datec.com.bo:3550"
    When I consult sync messages services  with POST "/api/v1/sync/portal/1015537027/E3005"
    Then The response code for Sync messages services should be 201

    Given the base URL for Sync catalog is "http://test.datec.com.bo:3550"
    When I consult sync catalog  with POST "/api/v1/sync/portal/1015537027/E3006"
    Then The response code for Sync catalog should be 201

    Given the base URL for Sync events is "http://test.datec.com.bo:3550"
    When I consult sync events  with POST "/api/v1/sync/portal/1015537027/E3007"
    Then The response code for Sync events should be 201

    Given the base URL for Sync canceled is "http://test.datec.com.bo:3550"
    When I consult sync canceled with POST "/api/v1/sync/portal/1015537027/E3008"
    Then The response code for Sync canceled should be 201

    Given the base URL for Sync country is "http://test.datec.com.bo:3550"
    When I consult sync country with POST "/api/v1/sync/portal/1015537027/E3009"
    Then The response code for Sync country should be 201

    Given the base URL for Sync identity documents is "http://test.datec.com.bo:3550"
    When I consult sync identity documents with POST "/api/v1/sync/portal/1015537027/E3010"
    Then The response code for Sync identity documents should be 201

    Given the base URL for Sync sector document is "http://test.datec.com.bo:3550"
    When I consult sync sector document with POST "/api/v1/sync/portal/1015537027/E3011"
    Then The response code for Sync sector document should be 201

    Given the base URL for Sync emission is "http://test.datec.com.bo:3550"
    When I consult sync emission with POST "/api/v1/sync/portal/1015537027/E3012"
    Then The response code for Sync emission should be 201

    Given the base URL for Sync room is "http://test.datec.com.bo:3550"
    When I consult sync room with POST "/api/v1/sync/portal/1015537027/E3013"
    Then The response code for Sync room should be 201

    Given the base URL for Sync pay methods is "http://test.datec.com.bo:3550"
    When I consult sync pay methods with POST "/api/v1/sync/portal/1015537027/E3014"
    Then The response code for Sync pay methods should be 201

    Given the base URL for Sync coin is "http://test.datec.com.bo:3550"
    When I consult sync coin with POST "/api/v1/sync/portal/1015537027/E3015"
    Then The response code for Sync coin should be 201

    Given the base URL for Sync points of sale is "http://test.datec.com.bo:3550"
    When I consult sync points of sale with POST "/api/v1/sync/portal/1015537027/E3016"
    Then The response code for Sync points of sale should be 201

    Given the base URL for Sync tax is "http://test.datec.com.bo:3550"
    When I consult sync tax with POST "/api/v1/sync/portal/1015537027/E3017"
    Then The response code for Sync tax should be 201

    Given the base URL for Sync unit is "http://test.datec.com.bo:3550"
    When I consult sync unit with POST "/api/v1/sync/portal/1015537027/E3018"
    Then The response code for Sync unit should be 201