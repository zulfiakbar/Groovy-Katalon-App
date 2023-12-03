@ProductList
Feature: View Product List

  @PRL001
  Scenario: VPR001 - Users want to see all product list
    Given User is on SecondHand App
    When User verify semua on telusuri kategori
    Then User can see all product

  @PRL002
  Scenario: VPR002 - User want to see product list based on category filter
    Given User is on SecondHand App
    When User click one of category button on Telusuri Kategori section
    Then User can see product list based on category filter

  @PRL003
  Scenario: VPR003 - User want to see product list based on search
    Given User is on SecondHand App
    When User click one of product item from "search" result list
    Then User can see product list based on search