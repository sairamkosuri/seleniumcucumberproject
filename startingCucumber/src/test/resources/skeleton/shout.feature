Feature: Shout Feature
@tag1 @tag3
Scenario: Saun and lucia are within the range

Given Saun is 20 meters away from lucia
When Saun shouts "Free coffee"
Then Lucia listens to the message
@tag2
Scenario: saun and lucia are not in the range
Given Saun is 1000 meters away from lucia
When Saun shouts "Free coffee"
Then Lucia cannot listen to the message 