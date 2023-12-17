@Task
  Feature: End to End
    As a user i want buy some product

    Scenario: User login with valid credential and do select product till payment product
      Given User already on login page
      When User input "standard_user" as a username "secret_sauce" as a password
      Then User already on inventory page
      When User sort product by "Price (low to high)"
      And User click product "Sauce Labs Onesie"
      And User click product "Sauce Labs Bike Light"
      And User click cart button
      And User click remove product
      And User click checkout product
      And User input "Ziko" as a firstname "Surya Lesmana" as a lastname "123456" as a postalCode
      Then User verify payment information and shipping information
      And User verify item total price "Item total: $7.99" product added
      And User verify tax "Tax: $0.64" from item total price
      And User verify total price "Total: $8.63" from item total and tax
      When User click finish button
      Then User already completing the order


