@smoke
Feature: Successful purchase
  Scenario: Login Successfully
    When Enter valid username and valid password
    Then verify login successfully
    And add the most two products into cart
    And click on the cart
    Then Verify navigation to cart page and existence of selected products
    And click on checkout button
    Then verify navigation to checkout page
    And Enter first name,last name and postal code
    Then verify navigation to overview page and amount of products are selected
    And click on finish button
    Then verify finish the order