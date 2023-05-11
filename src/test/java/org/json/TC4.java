package org.json;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

public class TC4 {
    @Test
    public void simple() {

        JSONObject j = new JSONObject();
        j.put("FirstName", "Swati");
        j.put("LastName", "Patil");
        j.put("Id", "Swatinew@02323");
        j.put("Designation", "QA LEAD");
        System.out.println(j.toString());
        Response res = given().contentType(ContentType.JSON)
                .body(j.toString()).when().post("http://localhost:3000/ApiStudents");
        System.out.println("Status code is");
        System.out.println(res.statusCode());
        System.out.println(res.asString());
    }
}
