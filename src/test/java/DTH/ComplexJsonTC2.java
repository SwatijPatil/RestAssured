package DTH;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;

public class ComplexJsonTC2 {
    @Test
    public void complexjsonformat() throws FileNotFoundException {
        File f = new File("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\complex.json");
        FileReader fr = new FileReader(f);
        JSONTokener jt = new JSONTokener(fr);
        JSONObject j = new JSONObject(jt);
        System.out.println(j.toString());
        Response res = given().contentType(ContentType.JSON).body(j.toString()).when()
                .post("http://localhost:3000/ApiStudents");
        System.out.println(res.statusCode());


    }
}
