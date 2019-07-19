package com.mycompany.testiniumtask;
/**
 *
 * @author Fatih
 */
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
 
public class Rest_Assured {
 
    @Test
    public void n11_RestAssured() {
 
        RestAssured.baseURI = "https://n11.com/";
 
        RequestSpecification request = RestAssured
 
                .given()
                .config(RestAssured.config().sslConfig(new SSLConfig().allowAllHostnames()));
 
        Response response = request
 
                .when()
                .get("https://n11scdn.akamaized.net/static/favicon.ico")
 
                .then()
                .statusCode(200)
                .extract().response();
 
        int responseCode = response.getStatusCode();
        ResponseBody responseBody = response.getBody();
 
        String campaigns = response.jsonPath().getString("campaigns");
        String responses = response.jsonPath().getString("responses");
        String statusCode = response.jsonPath().getString("statusCode");
        String timeStamp = response.jsonPath().getString("timeStamp");
 
        System.out.println(responseCode);
        System.out.println(responseBody.asString());
 
        System.out.println("---------------------");
        System.out.println(campaigns);
        System.out.println(responses);
        System.out.println(statusCode);
        System.out.println(timeStamp);
 
        assert responseBody.asString() != null;
 
    }
}
