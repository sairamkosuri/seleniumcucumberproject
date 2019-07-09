Feature: user logins to his account
Scenario Outline: user logins to testmeapp
Given  url for testmeapp is "http://10.232.237.143:443/TestMeApp/"
When user clicks on signin button
And  user enters "<username>" in username field
And  user enters "<password>" in password field
And user clicks on "<login>" button
Then user will be in homepage

Examples:
|username|password|login|
|ksrk1346|sairam|login|