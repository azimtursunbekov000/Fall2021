@Smoke
Feature:  Data TAble practice
@Regression
  Scenario: Order Kimchi from Arigato
    Given user is on NambaFood
    When user click on Foods
    Then user should see "250 best cafe"
    And user should find Sushi category
    When user click on Sushi
    Then user should see List of cafes
    And user should scroll down the page to Arigato cafe
    When user click on Arigato
    Then user should see Arigato menu
    And  user should find Kimchi
    When  user increase Kimchi amount to 3
    And user should click on Order button
    Then  on the Card user should 450 s



  @Regression
    Scenario: Verify following tabs are display in Amazon
      Given user is on "https://www.amazon.com/"
      Then  following menu bar should be display on Home page
      | All|Today's Deals|Customer Service|Registry||Gift Cards|Sell


  @Regression
      Scenario: cars model
        Given user is on cars.kg
        Then following cars should be displayed
        |BMW|Toyota |Lexus|Mers   |Lada |Tesla  |
        |525|camry  |ES   |e500   |Sedan|Model s|
        |745|Avalon |LX   |S Class|Niva |Model x|
