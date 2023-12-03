@ProductDetail
Feature: EditProduct

  @Detail1
  Scenario: User want to see product detail from product list
    Given User is on SecondHand App
    When User click one of product card
    Then User can see product detail

  @Detail1
  Scenario: User want to see product detail from product list that appeared on search result
    Given User is on SecondHand App
    When User click one of product item from "kucing" result list
    And User click on product want to see
    Then User can see product detail from product list that appeared on search result
