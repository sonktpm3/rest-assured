package org.example.definitions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;
import org.junit.Test;

public class Get_NonBDDResponseDemo {
    RequestSpecification requestSpecification;
    Response response;
    private static final String URL = "http://dummy.restapiexample.com/api/v1/employee/1";
    @Test
    public void verifyStatusCode() {
        // base
//        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
//
//        // Create a request specification
//        requestSpecification = RestAssured.given();
//
//        // Calling GET method
//        response = requestSpecification.get();
//
//        // Let's print response body.
//        String resString = response.prettyPrint();
//        System.out.println("Response Details : " + resString);
//
//        // Get status line
//        String statusLine = response.getStatusLine();
//        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
//
//        // Get status code
//        int statusCode = response.getStatusCode();
//        Assert.assertEquals(statusCode, 200);

        // Serenity
        response = SerenityRest.given().contentType("application/json").header("Content-Type", "application/json")
                .when().get(URL);
        System.out.println("Response Details : " + response.print());

    }
}