package RestAssured;

import io.restassured.response.Response;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class TestResAssured {

    @Test
    public void test_01() throws IOException {
        Response response = get("https://reqres.in/api/users?page=2");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
        String response_Body = response.getBody().asString();
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
                body("data[0].id", equalTo(7)).log()
        ;

    }

}
