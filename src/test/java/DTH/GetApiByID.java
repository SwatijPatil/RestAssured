package DTH;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetApiByID {
    @Test
    public void getRequest() {
        Response res = given().contentType(ContentType.JSON).
                when().
                get("http://localhost:3000/ApiStudents?Id=Sudharani");
        System.out.println("Status code is" + res.statusCode());

    }


}
