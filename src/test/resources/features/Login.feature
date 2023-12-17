@Login
  Feature: Login
    As a user i want login to website sauce demo

    @TC1
    Scenario: User login with valid credential
    Given User already on login page
      When User input "standard_user" as username
      And User input "secret_sauce" as password
      Then User click login button

    @TC2
    Scenario: User login with valid credential and do select on inventory page
      Given User already on login page
      When User input "standard_user" as a username "secret_sauce" as a password
      Then User already on inventory page
      When User sort product by "Price (low to high)"
      And User click product "Sauce Labs Onesie"
      And User click product "Sauce Labs Bike Light"
      And User click keranjang button
      And User click remove product
      And User click checkout product
      And User input "Ziko" as a firstname "Surya Lesmana" as a lastname "123456" as a postalcode
      And User checking all information payment
      Then User recieve Complete Texts

        @TC3
        Scenario Outline: User login with invalid credential
          Given User already on login page
          When User input "<username>" as a username "<password>" as a password
          Then User see "<errorMassage>" as error massage
          Examples:
            | username      | password       | errorMassage                                                              |
            | standard_user |                | Epic sadface: Password is required                                        |
            |               | secret_sauce   | Epic sadface: Username is required                                        |
            |               |                | Epic sadface: Username is required                                        |
            | ziko          | keyenz_abiezzz | Epic sadface: Username and password do not match any user in this service |