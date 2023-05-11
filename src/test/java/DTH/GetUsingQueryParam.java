package DTH;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUsingQueryParam {
    @Test
    public void queryParam() {
        Response res = given().contentType(ContentType.JSON).
                when().
                get("http://localhost:3000/ApiStudents?Id=Sudharani");
        System.out.println(res.statusCode());
        System.out.println(res.asString());


    }
}
