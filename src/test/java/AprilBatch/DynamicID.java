package AprilBatch;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.given;

public class DynamicID {
    @Test
    public void dynamicIdGeneration() throws FileNotFoundException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\Files\\fileDynamic.json");
        FileReader fr=new FileReader(f);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject j=new JSONObject(jt);
        Random r=new Random();
        Integer value=r.nextInt();// in integer form convert it into a String value
        String bodyData = j.toString();
        bodyData = bodyData.replaceAll(Pattern.quote("{{id}}"),value.toString());

Response res=
        given().contentType(ContentType.JSON).log().all().
                body(bodyData).when().log().all().post("  http://localhost:3000/UiAutomatin");
System.out.println("Status code "+ res.statusCode());
System.out.println("Response "+ res.asString());

    }
}
