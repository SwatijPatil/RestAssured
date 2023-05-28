package pojo;

import Practice_org.json.SimpleJson;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TC1 {
    public static void main(String[]args){
        Demo d=new Demo();
        d.setFirstName("Swati");
        d.setDesignation("TL");
        d.setLastName("Patil");
        d.setID("788800");

  Response res=
                given().contentType(ContentType.JSON).body(d).when().post("http://localhost:3000/PostTest");
        System.out.println("Response body"+ res.asString());
        System.out.println(res.asString());
    }


}
