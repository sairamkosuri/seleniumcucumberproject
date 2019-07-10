Feature: Search Engine
Scenario Outline: TestMeApp SearchEngine

Given url for TESTMEAPP "http://10.232.237.143:443/TestMeApp/"
When  user enters username field "<username>" 
And user enters password field "<passWord>" 
And user clicks login button
And user clicks search button and types"<data>"
And user clicks find details
Then user checks for cart symbol
Examples:
|username  |passWord |data|
|lalitha   |password123|HeadPhone|