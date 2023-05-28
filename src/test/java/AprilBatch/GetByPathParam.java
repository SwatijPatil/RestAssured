package AprilBatch;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetByPathParam {
    @Test
    public void getbypathParam(){
        Response rs=
        given().contentType(ContentType.JSON).when().log().all().
                get("http://localhost:3000/UiAutomatin/2");
        System.out.println("Response body"+ rs.asString());
    }
}

