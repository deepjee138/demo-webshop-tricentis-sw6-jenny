Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @sanity @smoke @regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @smoke @regression
  Scenario: User should log in successfully with Invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primefivetest11@yahoo.com"
    And I enter password "abc1235"
    And I click on login button
    Then I should log in unsuccessfully

  @regression
  Scenario: User should log in successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "primefivetest@yahoo.com"
    And I enter password "abc123"
    And I click on login button
    Then I should see LogOut Link is display

  @regression
  Scenario:VerifyThatUserShouldLogOutSuccessFully
    Given I am on homepage
    When I click on login link
    And I enter email "primefivetest@yahoo.com"
    And I enter password "abc123"
    And I click on login button
    And I click On LogOutLink
    Then I should see the login link is display