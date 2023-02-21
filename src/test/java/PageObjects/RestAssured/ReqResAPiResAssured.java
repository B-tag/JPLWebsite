package PageObjects.RestAssured;

import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ReqResAPiResAssured {

    @Test
    public void test_01() throws IOException {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        String response_Body = response.getBody().asPrettyString();
        FileUtils.writeStringToFile(new File("./tmp/test.json"), response_Body, Charset.forName("UTF-8"));
        System.out.println(response_Body);

        int resCode = response.getStatusCode();
        Assert.assertEquals(resCode, 200);
    }

    @Test
    public void test_02() {

        baseURI = "https://reqres.in/api";
        given().
                get("/users?page=2").
                then().
                statusCode(200).
                log().all().
                body("data[0].id", equalTo(7)).log();
    }

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
        FileUtils.writeStringToFile(new File("./tmp/test-get.json"), s2, Charset.forName("UTF-8"));

        Response response = given().get("/users?page=2");
        String s = response.getBody().asPrettyString();
        FileUtils.writeStringToFile(new File("./tmp/test-get-all-users.json"), s, Charset.forName("UTF-8"));
        System.out.println(s);
    }

    @Test
    public void getSingleUserByID() {
        baseURI = "https://reqres.in/api";
        Response response = given().get("/users/4");
        String s = response.getBody().asPrettyString();
        System.out.println(s);
    }
}
