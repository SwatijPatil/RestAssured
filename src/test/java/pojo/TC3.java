package pojo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TC3 {
    public static void main(String[]args){
        StudentBasicInfo basic=new StudentBasicInfo();
        Address[] address= new Address[2];
        address[0]=new Address();
        address[0].setLandmark("land");
        address[0].setHouseNo("land1234");
        address[1]=new Address();

        address[1].setLandmark("land23");
        address[1].setHouseNo("land3000");

        basic.setAddress(address);
        basic.setName("lsq");
        basic.setId("testuserswati");
        Response res=
        given().contentType(ContentType.JSON).body(basic).when().post("  http://localhost:3000/PostTest");
        System.out.println(res.asString());
    }
}
