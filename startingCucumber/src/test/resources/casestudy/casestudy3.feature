Feature: Search Engine
Scenario Outline: TestMeApp SearchEngine

Given url "http://10.232.237.143:443/TestMeApp/"
When  user enters username "<username>" 
And user enters password "<passWord>" 
And user clicks on login button
And user clicks on search button and types"<data>"
And user clicks on find details
And user clicks on add to cart button
And user clicks on cart symbol
And user clicks on checkoutbutton
And user clicks on proceedtopay
And user selects on AndhraBank
And usert clicks on continue
#And user enters username "<username1>"
#And user enters password "<passWord1>"
And user clicks on login button1
Examples:
|username  |passWord |data|
|lalitha   |password123|HeadPhone|
