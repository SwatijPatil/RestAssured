package Practice_org.json;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SimpleJson {
    @Test
    public void postRequest(){
        JSONObject j=new JSONObject();
        j.put("FirstName","Sudha");
        j.put("LastName","Patil");
        j.put("Id","swati19917");
        j.put("Designation","Test ebgineer");
        System.out.println(j.toString());
        Response res=
        given().contentType(ContentType.JSON).body(j.toString()).when().
                post(" http://localhost:3000/ApiAutomation");
        System.out.println("Status code"+res.statusCode());
        System.out.println("Response body "+res.asString());

    }


}
