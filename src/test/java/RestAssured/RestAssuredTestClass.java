package RestAssured;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import static io.restassured.RestAssured.*;

public class RestAssuredTestClass {

    @Test
    public void getResponseBody() {
        baseURI = "http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
        given().
                when().get().
                then().log().all();
    }

    @Test
    public void getCustomerDetails() throws IOException {
        baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
        String customerDetails = given().queryParam("CUSTOMER_ID", "68195").
                queryParam("PASSWORD", "1234!").
                queryParam("Account_No", "1").
                when().get().
                then().log().body().toString();
        Document document= Jsoup.parse(customerDetails);
        System.out.printf(document.toString());
        FileUtils.writeStringToFile(new File("./tmp/test_Customer.html"), customerDetails, Charset.forName("UTF-8"));
    }

    @Test
    public void getCustomerDetailsResponseCode() throws IOException {
        baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
        int customerResponseDetails = given().queryParam("CUSTOMER_ID", "68195").
                queryParam("PASSWORD", "1234!").
                queryParam("Account_No", "1").
                when().get().
                getStatusCode();
        System.out.printf(String.valueOf(customerResponseDetails));
    }


}
