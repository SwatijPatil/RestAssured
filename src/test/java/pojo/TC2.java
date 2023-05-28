package pojo;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TC2 {
    public static  void main(String[]args){

        AddressInfo add=new AddressInfo();
        add.setHouseNo("1234");
        add.setCity("addhhh");

        BasicInfo basic= new BasicInfo();
        basic.setFirstName("sudha");
        basic.setLastName("patil");
        basic.setId("3456");
        basic.setAddressInfo(add);
        Response res=
        given().contentType(ContentType.JSON).body(basic).when().post("http://localhost:3000/PostTest");

System.out.println("Response data" + res.asString());
    }
}
