package Practice_org.json;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class InFormOfArray {
    @Test
    public void postRequest(){
        JSONObject j=new JSONObject();
        j.put("House No","123450000");
        j.put("City","Bangalore");
        JSONObject j2=new JSONObject();
        j2.put("House No","12345780000");
        j2.put("City","Bangalore");
        JSONArray obj=new JSONArray();
        obj.put(0, j);
        obj.put(1, j2);

        JSONObject j1=new JSONObject();
        j1.put("FirstName","Swati");
        j1.put("LastName","PAtil");
        j1.put("Id","909099");
        j1.put("Designation","QA 2");
        j1.put("Address",obj);
        Response res=
                given().contentType(ContentType.JSON).body(j1.toString()).
                when().post("http://localhost:3000/ApiAutomation");
        System.out.println("Response body"+ res.asString());
    }
}
