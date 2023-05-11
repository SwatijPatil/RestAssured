package base;

import files.File2;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class AddPlace {
    public static void main(String[] args) {
        String responseData = RestAssured.baseURI = "http://216.10.245.166";
        given().header("Content-Type", "Application/json").body(File2.addNewApi()).
                when().post("Library/Addbook.php").then().log().all().assertThat()
                .statusCode(200).body("Msg", equalTo("successfully added")).extract().response().asString();
        System.out.println(responseData);
        JsonPath js = new JsonPath(responseData);
        String Id = js.get("ID");
        System.out.println(Id);
    }

}
