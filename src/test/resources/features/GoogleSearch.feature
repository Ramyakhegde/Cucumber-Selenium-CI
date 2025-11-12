Feature: DuckDuckGo Search Functionality

  Scenario: Verify DuckDuckGo search works
    Given I open the browser
    When I navigate to "https://duckduckgo.com/"
    And I search for "Selenium WebDriver"
    Then the page title should contain "Selenium WebDriver"

