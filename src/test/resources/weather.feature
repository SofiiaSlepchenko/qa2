Feature: Weather API
  Scenario: Testing city coordinates
    Given city id: 524901
    When we are requesting weather data
    Then lon is 145.77
    And lat is -16.92
    And weather id is 802
    And weather main is "Clouds"
    And weather description is "scattered clouds"
    And icon is "123"
    And base is "station"
    And temp is 300.15
    And pressure is 1007
    And humidity is 74
    And temp_min is 300.15
    And temp_max is 300.15
    And visibility is 10000
    And wind speed is 3.6
    And wind deg is 160
    And clouds all is 40
    And dt is 1485790200
    And sys type is 1
    And sys id is 8166
    And sys message is 0.2064
    And sys country is "AU"
    And sys sunrise is 1485720272
    And sys sunset is 1485766550
    And id is 2172797
    And name is "Cairns"
    And cod is 200



