Feature: Refer a product to a friend

  @emailAFriend
  Scenario: As a user, I should able to add a product in a cart
    and I cannot refer a product to my friend without registration

    Given I am on homepage
    When  I add product to the cart
    And   I enter email details
    Then  I should not able to refer product to my friend
    And   I should see registration required error message

  @emailAFriend
  Scenario: As a user, I should able to add a product in a cart,
  So I can refer that product to my friend by email.

    Given I am on homepage
    And   I click on login button
    And   I enter login details
    And   I logged in successfully
    When  I add product to the cart
    And   I enter email details
    Then  I should able to refer a product to my friend
    And   I should see email send message