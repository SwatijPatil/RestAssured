package SimpleJson;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;

public class TC_3 {
    @Test
    public void postRequest() throws FileNotFoundException {
        String bodyData = TC_3.readJson();
        Response res=
        given().contentType(ContentType.JSON).body(bodyData).
                when().post("http://localhost:3000/ApiAutomation");
        System.out.println("Status code" + res.statusCode());
        System.out.println("Response body "+ res.asString());
        }
    public static  String readJson() throws FileNotFoundException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\Files\\Array.json");
        FileReader fr=new FileReader(f);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject j=new JSONObject(jt);
        return j.toString();
    }
}
