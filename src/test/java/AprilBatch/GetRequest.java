package AprilBatch;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;

public class GetRequest {
    @Test
    public void getRequest() throws FileNotFoundException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\Files\\file.json");
        FileReader fr=new FileReader(f);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject j=new JSONObject(jt);
        System.out.println(j.toString());
       Response res=
      given().contentType(ContentType.JSON).
              when().get("http://localhost:3000/UiAutomatin");


System.out.println("Status code "+ res.statusCode());
System.out.println("JSON RESPONSE BODY "+res.asString());


    }
}
