package Practice_org.json;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ComplexJson1 {
    @Test
    public void postRequest(){
        JSONObject inner=new JSONObject();
        inner.put("House no","1234");
        inner.put("City","Bangalore");
        JSONObject outer=new JSONObject();
        outer.put("FirstName","Swati");
        outer.put("LastName","Patil");
        outer.put("Id","Patil1234");
        outer.put("Designation","Test Lead");
        outer.put("Address",inner);
        Response res=
        given().contentType(ContentType.JSON).log().all().body(outer.toString()).when().
                post("  http://localhost:3000/ApiAutomation");
        System.out.println("Response body"+res.asString());

    }

}
