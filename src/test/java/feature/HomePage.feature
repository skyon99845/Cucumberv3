Feature: Welcome to RedBus
  Scenario: Verification of User able to Visit the RedBus Website
    #In order to check the RedBus Website Accessibility
    #As a SDET I need to visit the RedBus Website and check the title of the
    # WebPage is "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India"

    Given the user navigates to "RedBus Homepage"
    When the title of the webpage is "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India"
    Then  the user exit the browser