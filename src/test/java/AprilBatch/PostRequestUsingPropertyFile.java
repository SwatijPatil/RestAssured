package AprilBatch;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

import static io.restassured.RestAssured.given;

public class PostRequestUsingPropertyFile {
    @Test
    public void postRequest() throws IOException {
        File f=new File("C:\\Users\\swati\\IdeaProjects\\RestAssured\\Config.properties");
        FileInputStream fis=new FileInputStream(f);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println("Test Case Pass");
        System.out.println(prop.getProperty("POST_URL"));
        String bodydata = PostRequestUsingPropertyFile.
                readJson("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\Files\\file.json");
        Response res=
        given().contentType(ContentType.JSON).body(bodydata).
                when().log().all()
                .post(prop.getProperty("POST_URL"));
        System.out.println("Response body "+ res.asString());

    }
    public static String readJson(String filepath) throws FileNotFoundException {
        File f=new File(filepath);
        FileReader fr=new FileReader(f);
        JSONTokener jt=new JSONTokener(fr);
        JSONObject j=new JSONObject(jt);
        return j.toString();
    }
}
