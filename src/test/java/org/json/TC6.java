package org.json;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TC6 {
    @Test
    public void postRequestType() {
        JSONObject obj1 = new JSONObject();
        obj1.put("City", "Bangalore");
        obj1.put("Area", "VN");
        JSONObject obj2 = new JSONObject();
        obj2.put("City", "Bidar");
        obj2.put("Area", "MMMM");
        JSONArray array = new JSONArray();
        array.put(0, obj1);
        array.put(1, obj2);

        JSONObject j = new JSONObject();
        j.put("FirstName", "Suma");
        j.put("LastName", "Patil");
        j.put("Id", "id@1234");
        j.put("Address", array);

        Response res = given().contentType(ContentType.JSON).body(j.toString())
                .when().post("http://localhost:3000/Automation");

        System.out.println("Status code is " + res.statusCode());
        System.out.println("Response Body" + res.asString());

    }
}
