package io.hypermine.hypersign.authenticator;

import io.hypermine.hypersign.service.AuthServerCaller;
import org.json.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		// AuthServerCaller authserCaller = new AuthServerCaller();
		// String response = authserCaller.getChallenge();
		// Object o1 = JSONValue.parse(response);
		JSONObject jsonObject = new JSONObject();
		// System.out.println(jsonObject.data.getString("data"));
		System.out.println("\nTes JSON : " + jsonObject.toString());
	}
}