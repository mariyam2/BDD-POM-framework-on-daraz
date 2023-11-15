Feature: Adding Samsung phones based on filters such as prices, and some characterstics ( fast charging/free delivery) and moving out to checkout page

Background:
 Given User Logins with 03328261288 and Abc123++
    Then User is on Product Page
    Examples:
    |username|password|
    |03328261288|Abc123++|

  
  Scenario Outline: CASE:1a Search phones on search bar and add all products in cart within 1st page
    Then I want to search a phone name "Samsung Phone"
    Then Click search button   
    When I set the price min to <minprice> and max to <maxprice>
    When I add products in cart
    Then Navigate to cart
    Then I select all products and navigate to checkout page
    
    
    
    
    Examples:
      | minprice | maxprice |
      | 25000    | 80000    |  
   
    
    
  Scenario Outline: CASE:1b quantity to 5 for any phone model and moving to checkout page
  
  Then Click on add to cart
  Then Update quantity of any phone upto maximum or allowed quantity 
 
  
  
  Scenario Outline: Case 2: Add to cart all Samsung mobiles on first page with fast charging support
 
  Then Navigate to cart
  Then Remove any product(s) if found else ingore 
  Then I want to search a phone name "Samsung Phone"
  Then Click search button
  Then Getting products in cart with only fast charging support
  Then Navigate to cart
  Then I select all products and navigate to checkout page
  
  
  
  Scenario Outline: Case 3: Add to card Samsung phones on first page with price less than 50k and offers Free Delivery 
    Then Navigate to cart
    Then Remove any product(s) if found else ingore 
    Then I want to search a phone name "Samsung Phone"
    Then Click search button
    When I set the price min to <minprice> and max to <maxprice>
    Then I click on free delivery option as a filter
    When I add products in cart
    Then Navigate to cart
    Then I select all products and navigate to checkout page
    Examples:
      | minprice | maxprice |
      | 0   | 50000    |  
    

  