package getRequest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstApiTest {

    @Test
    public void getPostTest() {

        given()
                .baseUri("https://jsonplaceholder.typicode.com")
                .header("Accept", "application/json")

                .when()
                .get("/posts/1")

                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("userId", equalTo(1))
                .body("title", notNullValue())
                .log().all();
    }
}
