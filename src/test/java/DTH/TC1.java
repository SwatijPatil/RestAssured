package DTH;

import groovy.json.JsonToken;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;

public class TC1 {
    @Test
    public void testCase() throws FileNotFoundException {
        File f = new File("C:\\Users\\swati\\IdeaProjects\\RestAssured\\SimpleJson.json");
        FileReader fr = new FileReader(f);    // reading data line by line
        JSONTokener jt = new JSONTokener(fr);// for reading the json data
        JSONObject j = new JSONObject(jt);
        System.out.println(j);
        Response res = given().contentType(ContentType.JSON).body(j.toString()).when().
                post(" http://localhost:3000/ApiStudents");
        System.out.println(res.statusCode());
        System.out.println(res.asString());


    }
}
