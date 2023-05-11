package base;

import static io.restassured.RestAssured.*;

import files.Payload;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class First {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://rahulshettyacademy.com/";
        String response = given().log().all().queryParam("key", "qaclick123").
                header("Content-Type", "application/json").
                body(Payload.addPlace()).when().post("maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
                .body("scope", equalTo("APP")).extract().response().asString();
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String placeId = js.getString("place_id");
        System.out.println(placeId);
        //______________ Update put________
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body("{\n" +
                        "\"place_id\":\"" + placeId + " \",\n" +
                        "\"address\":\"70 winter walk, USA\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}").put("maps/api/place/update/json").then().assertThat().statusCode(200);


    }

}
