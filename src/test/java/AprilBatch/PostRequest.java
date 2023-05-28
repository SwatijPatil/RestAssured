package AprilBatch;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PostRequest {
    @Test
    public void postRequest() throws FileNotFoundException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\Files\\file.json");
        FileReader fr=new FileReader(f);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject j=new JSONObject(jt);
        System.out.println(j.toString());
      Response response =given().contentType(ContentType.JSON).log().all().
              body(j.toString()).when().log().all().post("  http://localhost:3000/UiAutomatin");

      System.out.println("Status code " + response.statusCode());
      System.out.println("response "+response.asString());
    }
}

