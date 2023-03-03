package PageObjects.RestAssured;

import io.restassured.http.Headers;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
//import org.junit.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

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
        String customerDetails =
                given().queryParam("CUSTOMER_ID", "68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1").
                        when().get().
                        then().log().body().toString();
        Document document = Jsoup.parse(customerDetails);
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
        given().
                when().get().
                then().assertThat().statusCode(200);
        System.out.printf(String.valueOf(customerResponseDetails));
    }

    @Test
    public void getExtractHeader() {
        baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
        Headers headers = given().get().
                then().extract().headers();
        System.out.printf(headers.toString());
    }

    @Test
    public void getTheResponseTime() {
        baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
        long timeIn = given().get().timeIn(TimeUnit.MILLISECONDS);
        System.out.printf("Response Time is : " + timeIn + " millisecond(s)");
    }

    @Test
    public void getContentType() {
        baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
        String contentType = given().get().
                then().extract().contentType();
        System.out.printf("Content Type : " + contentType);
    }

    @Test
    public void getSpecificPartOfResponseBody() {
        baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
        ArrayList<String> amountPath = given().get().
                then().extract().path("result.statements.AMOUNT");
        for (String o : amountPath) {
            System.out.println("The Amount value fetched is : " + o);
        }
    }


}
