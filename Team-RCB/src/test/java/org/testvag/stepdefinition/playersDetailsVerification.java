package org.testvag.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testvag.functions.apiFunctions;


public class playersDetailsVerification {
    public String playersResponse;
    public int playersCount;
    JsonPath js;

    @Given("Team Players details")
    public void inputTeamPlayerDetails() {
        playersResponse = apiFunctions.playersDetails();
        //Retrieve Player count
        js = new JsonPath(playersResponse);
        playersCount = js.getInt("player.size()");
    }

    @Then("Validate that the team has only 4 foreign players")
    public void validateForiegnPlayersCount() {
        int foriegnPlayers = 0;
        for (int i = 0; i < playersCount; i++) {
            String playersCountry = js.get("player[" + i + "].country").toString();
            if (!"India".equalsIgnoreCase(playersCountry)) {
                foriegnPlayers = foriegnPlayers + 1;
            }
        }
        Assert.assertEquals(foriegnPlayers, 4);
    }

    @And("Validate that there is atleast 1 wicket keeper")
    public void ValidateWicketKeeperCount() {
        int wicketKeeperPlayer = 0;
        String playersRole = null;
        for (int i = 0; i < playersCount; i++) {
            playersRole = js.get("player[" + i + "].role");
            if (playersRole.equalsIgnoreCase("Wicket-keeper")) {
                wicketKeeperPlayer = wicketKeeperPlayer + 1;
                //System.out.println("Wicket-Keeper found in the players list!");
            }
        }
        Assert.assertEquals(wicketKeeperPlayer, 1);

    }
}

