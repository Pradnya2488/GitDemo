Feature: Home Page

  @Test
  Scenario Outline: Validate Home Page
    Given Navigate to Home page "<url>" using "<browsername>"
    When I click Alert button
    Then Verify Alert window is displayed

    Examples: 
      | browsername | url                                                    |
      | CR          | https://www.rahulshettyacademy.com/AutomationPractice/ |
