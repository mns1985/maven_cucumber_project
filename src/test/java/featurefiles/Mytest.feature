Feature: Testing login

  Background: Browser initialization
    Given open chrome browser in private window

  @apple
  Scenario: chat for soch website
    Given Open soch Website
    When Click on chat button
    Then Enter chat information
    When I Click on submit button
    Then chat window closed

@apple
  @ball
  Scenario:sort by recomended drop-down
    Given Open soch Website1
    When Click on Topwear link in menubar
    Then I Click on kurtas link
    When i click on sort by recomended tab
    Then I select high-low link from drop-down
    Then chat window closed1


  @mytest
  Scenario:add an item to wishlist
    Given Open soch Website2
    When Click on sarees link in menubar
    Then I Click on partywear sarees  link
    Then select a product
    Then click on wishlist
    Then chat window closed2


  @stringtest
  Scenario: chat soch website with data
    Given Open soch Website
    When Click on chat button
    When I Enter chat information name as "Harsha" and email as "harsha@gmail.com" and phonenumber as "+1234567" and message as "about my order"
    When I Click on submit button
    Then chat window closed3

  @multipledata
  Scenario Outline: chat soch website with multiple data
    Given Open soch Website
    When Click on chat button
    When I Enter chat information name as "<name>" and email as "<emailid>" and phonenumber as "<phonenumber>" and message as "<message>"
    When I Click on submit button
    Then chat window closed
    Examples:
      | name   | emailid          | phonenumber | message           |
      | Harsha | harsha@gmail.com | +1234567    | About my order    |
      | charan | charan@gmail.com | +12378906   | About returns     |
      | manasa | manasa@gmail.com | +9876544    | Regarding payment |


