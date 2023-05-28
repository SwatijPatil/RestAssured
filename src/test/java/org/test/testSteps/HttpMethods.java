package org.test.testSteps;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Properties;

import static io.restassured.RestAssured.given;

public class HttpMethods {
    public Properties prop;


    public HttpMethods(Properties prop){
        this.prop=prop;
    }
    public Response postRequest(String requestBody, String uri){
        String urlValue = prop.getProperty(uri);
     Response res=
        given().contentType(ContentType.JSON).body(requestBody).
                when().post(urlValue);
     System.out.println(res.asString());
        return res;
    }
    public void getAll(String geturi){
        String geturlvalue = prop.getProperty(geturi);
        Response res=
                given().contentType(ContentType.JSON).
                        when().get(geturlvalue);
        System.out.println(res.asString());


    }

}
