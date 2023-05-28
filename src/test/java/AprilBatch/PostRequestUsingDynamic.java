package AprilBatch;

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

public class PostRequestUsingDynamic {

    public static String readJson(String filepath) throws FileNotFoundException {
        File f=new File(filepath);
        FileReader fr=new FileReader(f);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject j=new JSONObject(jt);
        String value = j.toString();
        return j.toString();
    }
    @Test
    public void postRequest() throws FileNotFoundException {
        String requestBody = PostRequestUsingDynamic.readJson("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\Files\\fileDynamic.json");
        Random r=new Random();
        Integer value = r.nextInt();
       requestBody = requestBody.replaceAll(Pattern.quote("{{id}}"), value.toString());
       Response res=
               given().contentType(ContentType.JSON).body(requestBody).when().post("http://localhost:3000/UiAutomatin");
       System.out.println("Response Data" +res.asString());

    }

}
