package RestAssured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredTestClass {

    @Test
    public void getResponseBody() {
        given().
                when().get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").
                then().log().all();
    }
}
