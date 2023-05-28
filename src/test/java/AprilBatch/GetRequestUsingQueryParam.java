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

public class GetRequestUsingQueryParam {
    @Test
    public void getUsingQuryParam() throws FileNotFoundException {
        Response res=
        given().contentType(ContentType.JSON).when().get("http://localhost:3000/UiAutomatin?ID=1234");
        System.out.println("Response body "+ res.asString());


    }
}
