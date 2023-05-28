package org.test.testcases;

import io.restassured.response.Response;
import org.test.testSteps.HttpMethods;
import org.test.utilites.ReadJson;
import org.test.utilites.ReadProperties;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Pattern;

public class TC1_PostRequest {
    @Test
    public void postrequest() throws IOException {
        Properties prObject = ReadProperties.readPropertiesFileData("C:\\Users\\swati\\IdeaProjects\\RestAssured\\Config.properties");
        String requestBodyData = ReadJson.readJsonFile("C:\\Users\\swati\\IdeaProjects\\RestAssured\\src\\test\\java\\org\\test\\resourses\\Simple.json");
        HttpMethods ht=new HttpMethods(prObject);
        Response res=ht.postRequest(requestBodyData,"POST_URI");


    }
}
