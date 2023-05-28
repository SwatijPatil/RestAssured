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

public class PostUsingMethod {

    public static String readJson(String filapath) throws FileNotFoundException {
        File f=new File(filapath);
        FileReader fr=new FileReader(f);
        JSONTokener jk=new JSONTokener(fr);
        JSONObject j=new JSONObject(jk);
        return j.toString();

    }
    @Test
    public void getByPathParam() throws FileNotFoundException {
        String bodyData = PostUsingMethod.
                readJson("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\Files\\file.json");
        Response res=
        given().log().all().contentType(ContentType.JSON).body(bodyData).when().log().all().post("  http://localhost:3000/ApiAutomation");
        System.out.println("Response body"+ res.asString());






    }

}
