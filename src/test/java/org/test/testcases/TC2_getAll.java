package org.test.testcases;

import org.test.testSteps.HttpMethods;
import org.test.utilites.ReadJson;
import org.test.utilites.ReadProperties;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class TC2_getAll {
    @Test
    public void getAll() throws IOException {
        Properties properObject = ReadProperties.readPropertiesFileData("C:\\Users\\swati\\IdeaProjects\\RestAssured\\Config.properties");
        HttpMethods http=new HttpMethods(properObject);
        http.getAll("GET_URI");
    }
}
