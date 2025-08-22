package com.codometer.apis.clients;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;


import com.codometer.apis.posters.Users;
import com.google.gson.Gson;
import com.google.gson.JsonParser;

import io.restassured.response.Response;

public class RestTest {

  @Test(priority = 1)
  public void getOperationTest() {
	  
	  System.out.println("Rest.getOperation().asPrettyString()");
	  Rest.setEndpoint("https://dummyjson.com/users");
//	  System.out.println(Rest.getOperation().asPrettyString());
//	  User user1 = new User(1, "user1firstname", "user1lastname", "user1maidenname", 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
//	  List<User> userList = new ArrayList<>();
//	  userList.add(user1);
//	  Users users = new Users(userList, 30, 30, 30);
//	  Response userResponse =Rest.getOperation();
//	  Gson gson = new Gson();
//	  Users users = (Users) gson.fromJson(userResponse.asString(), Users.class);
//	  System.out.println(users);
//	  System.out.println(users.getUsers().size());
	  // System.out.println(Rest.serializePayload(users));
	  List<Character> charList = new ArrayList<>();
	  try {
		  FileReader fileReader = new FileReader("C:\\Users\\mohit\\git\\com.codometer\\com.codometer\\src\\main\\resources\\AnyFiles\\user.json");
		  
		  JSONParser parser = new JSONParser();
		  try {
			  
			  	Object json = parser.parse(fileReader);
				JSONObject jsonobject = (JSONObject) json;
				JSONObject jsonobject1 = new JSONObject();
			  
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		  int c;char cc;
//		  
//		  while((c = fileReader.read()) != -1)
//		  {
//			  cc = (char) c;
//			  charList.add(cc);
//		  }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println(charList.toString());
	  
  }
  
//  @Test(priority = 2)
//  public void setEndpointTest() {
//	  
//  }
}
