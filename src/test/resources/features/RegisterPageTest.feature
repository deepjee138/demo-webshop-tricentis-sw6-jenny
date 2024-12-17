Feature: Register Page test

  @sanity @smoke @regression
  Scenario: Verify user should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    Then Verify register text

  @smoke @regression
  Scenario: verify that first name last name email password and confirm password fields are mandatory
    Given I am on homepage
    When I click on register link
    And I click on register button
    Then  I should see the error message "First name is required." next to Firstname field
    And   I should see the error message "Last name is required." next to Lastname field
    And   I should see the error message "Email is required." next to email field
    And   I should see the error message "Password is required." next to confirm password field
  @regression
    Scenario: verifyThatUserShouldCreateAccountSuccessfully
      Given I am on homepage
      When I click on register link
      And I select gender "Female"
      And I enter first name "jenny"
      And I enter last name "patel"
      And I enter emailID "jennyPatel21099@gmail.com"
      And I enter pwd "prime1234"
      And I enter confirm password "prime1234"
      And I click on register button
      Then I should see message "Your registration completed"

