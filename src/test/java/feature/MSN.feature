@Smoke

Feature: Microsoft Bing Search
  Scenario: Visit the Microsoft Bing Website
    Given Open chrome browser and enter the "link"
    When Get title of the Webpage
    Then Quit browser