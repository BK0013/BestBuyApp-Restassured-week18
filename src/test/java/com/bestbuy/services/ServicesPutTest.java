package com.bestbuy.services;

import com.bestbuy.model.ServicesPojo;
import com.bestbuy.testbase.TestBaseForServices;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class ServicesPutTest extends TestBaseForServices {

    @Test
    public void updateServicesWithPut() {

        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Electronic Repairs");

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", "25")
                .body(servicesPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}
