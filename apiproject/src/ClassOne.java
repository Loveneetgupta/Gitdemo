import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ClassOne {
	
public static void main(String[] args) {
	
	//given-all input details
	//when-submit the API resource , http method
	//Then -Validate the response
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
	String response=  given().log().all().queryParam("key", "qaclick123")
				.header("Content-Type","application/json")
				.body(payload.Addplace()).when().post("/maps/api/place/add/json").then()
				.log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
				.header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
	
	System.out.println(response);
	
	JsonPath js =new JsonPath(response);  // for json parsing
	 	String placeid=js.getString("place_id");
	 	System.out.println("PlaceID="+placeid);
	 	
	 	//We have got the placeid and now we are going to update the address with the help of placeid
	 	
	 	//update place
	 	given().log().all().queryParam("key", "qaclick123")
		.header("Content-Type","application/json")
		.body("{\n"
				+ "\"place_id\":\""+placeid+"\",\n"
				+ "\"address\":\"70 Summer walk, USA\",\n"
				+ "\"key\":\"qaclick123\"\n"
				+ "}\n"
				+ "").
		when().put("/maps/api/place/update/json")
		.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
	}

}
