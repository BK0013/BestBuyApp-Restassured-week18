package com.bestbuy.categories;

import com.bestbuy.testbase.TestBaseForCategories;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class CategoriesDeleteTest extends TestBaseForCategories {

    @Test
    public void deleteSingleCategory() {
        Response response = given()
                .pathParam("id", "abcat0010123")
                .when()
                .delete("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
