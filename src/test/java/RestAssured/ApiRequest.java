package RestAssured;

import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiRequest {

    @Test
    public void getRequest() throws IOException {

        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2")
                .then().statusCode(200).
                body("data[2].email", equalTo("tobias.funke@reqres.in"))
        ;
        String s2 = given().get("/users/6").asPrettyString();
        System.out.println(s2);
        String s3 = given().get("/users/6").getBody().asString();
        System.out.println(s3);
        Response response = given().
                get("/users?page=2");
        String s = response.getBody().asString();
        FileUtils.writeStringToFile
                (new File("./tmp/test.json"), s, Charset.forName("UTF-8"));
        System.out.println(s);

    }

}
