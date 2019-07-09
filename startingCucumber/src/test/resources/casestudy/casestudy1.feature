Feature: Register to TestMeApp
Scenario Outline: Register to TestMeApp
Given url for testmeapp "http://10.232.237.143:443/TestMeApp/"
When user clicks on "signup button"
#Then user is in "register page"
And user clicks on username and gives "<username>" as username
And user clicks on firstname and gives "<firstname>" as firstname
And user clicks on lastname and gives "<lastname>" as lastname
And user clicks on password and gives "<password>" as password
And user clicks on confirmpassword and gives "<confirmpassword>" as confirmpassword
And user selects male and gives "<gender>"as gender
And user clicks on email and gives "<email>" as email
And user clicks on mobilenumber and gives "<mobilenumber>" as mobilenumber
And user clicks on dateofbirth and gives "<dateofbirth>" as dateofbirth
And user clicks on address and gives "<address>" as address
And user clicks on placeofbirth and gives "<placeofbirth>" as placeofbirth
Then user clicks on register 



Examples:
|username|firstname|lastname|password|confirmpassword|gender|email|mobilenumber|dateofbirth|address|placeofbirth|
|ksrk1346|brahma|ramm|sairam|sairam|male|sairamsasa321@gmail.com|9160202926|21/01/1998|bangalore|visakhapatnam|