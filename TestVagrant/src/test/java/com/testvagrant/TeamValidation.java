package com.testvagrant;

import org.json.simple.JSONObject;
import java.io.FileReader;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.google.gson.Gson;


//This test class validates the teamRCB JSON for following test scenarios

public class TeamValidation {

	public static Player[] players;
	
//This runs only once before execution of test cases and 
// it reads the given JSON and convert it as java object which is used to validate in test cases.

	@Before
	public void init() {

		try {

			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(".\\src\\test\\resources\\TeamRCB.json");
			Object teamobj = parser.parse(reader);
			JSONObject jsonobj = (JSONObject) teamobj;
			Gson gson = new Gson();
			players = gson.fromJson(jsonobj.get("player").toString(), Player[].class);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test
	public void validateWicketKeepers() {

		boolean wkfound = false;

		for (Player player : players) {

			if (player.getRole().equalsIgnoreCase("Wicket-keeper")) {
				wkfound = true;
				break;
			}

		}

		Assert.assertTrue("wicket keeper found", wkfound);
	}

	@Test
	public void validateForeignPlayers() {

		int count = 0;

		for (Player player : players) {

			System.out.println(player.getCountry());
			if (!player.getCountry().equalsIgnoreCase("India")) {
				count = count + 1;

			}

		}

		System.out.print(count);
		Assert.assertEquals("Team has Foreign players", 4, count);

	}

}
