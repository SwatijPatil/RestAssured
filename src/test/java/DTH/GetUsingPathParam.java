package DTH;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsingPathParam {
    @Test
    public void pathParam() {
        Response res = given().contentType(ContentType.JSON).when().
                get("http://localhost:3000/ApiStudents/");
        System.out.println("Response status code " + res.statusCode());
        System.out.println(res.asString());
    }
}
