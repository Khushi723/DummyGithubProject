Feature: Testing of Home page of the application

Background: Given User is on the Home page of the application

Scenario: Click on Summer Dresses inside Women label
					When User clicks on the "Women" label
					And Opens a pop-up to select further options
					Then User select the "Summer Dresses"
					And Opens the similar page for the user

Scenario: Click on Yellow color filter
					Given User is on the Home page of the application
					When User scroll down the page to see color filter
					And User select the "Yellow" color filter
					And Opens the "Color Yellow" dresses for the user
					Then Sort the dresses by "Price: Lowest First"
					And Dresses appears in the ascending order of price