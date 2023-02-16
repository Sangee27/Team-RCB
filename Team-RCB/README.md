Team RCB API Tests(Cucumber - Rest Assured)

This automation suite is designed to test and validate the team
player details.

The project has 2 test cases that is located in below feature file
src/test/java/resource/features/team_details_validations.feature

Team Details validation scenario includes below test cases

-Validate that the team has only 4 foreign players

-Validate that there is atleast 1 wicket keeper

Important Note: scenarios need to have the tag @TeamPlayersValidation in order to be included in test executions.

You will need:
- Java version - 1.8
- Maven version - 3.8.6 
- IDE - IntelliJ IDEA

In order to execute the automation suite navigate to the Project directory within a Terminal/CMD window 
and run the command: 'mvn clean test'.

Report file can be found in below path
target/cucumber-report/cucumber.html
