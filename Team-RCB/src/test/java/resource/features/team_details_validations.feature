Feature: RCB team details validation

  #Currently storing response as mock and validating the player details since Header,Body,Endpoint,etc is not provided for this API.
  @TeamPlayersValidation
  Scenario: User validates the RCB team players
    Given Team Players details
   # When Hit getPlayerDetails endpoint => Commenting this step as no endpoint is provided.
    Then Validate that the team has only 4 foreign players
    And Validate that there is atleast 1 wicket keeper