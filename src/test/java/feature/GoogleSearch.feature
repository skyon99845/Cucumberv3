@Regression
  Feature: Google Search
    Scenario: Visit the Google Website
      Given Open chrome browser and enter the "google" link
      When Get the title of the Webpage
      Then Close the browser