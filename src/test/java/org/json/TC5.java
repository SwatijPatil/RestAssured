package org.json;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TC5 {
    @Test
    public void postRequest() {
        JSONObject inner = new JSONObject();
        inner.put("City", "Bidar");
        inner.put("Area", "Test Area");
        JSONObject outer = new JSONObject();
        outer.put("FirstName", "Swati");
        outer.put("LastName", "Patil");
        outer.put("Id", "Swati@12");
        outer.put("Address", inner);
        System.out.println(outer.toString());
        Response res =
                given().contentType(ContentType.JSON).body(outer.toString())
                        .when().post("http://localhost:3000/Automation");
        System.out.println("Statis code is" + res.statusCode());
        System.out.println("Response Body" + res.asString());

    }
}
