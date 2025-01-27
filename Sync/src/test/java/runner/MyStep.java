package runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
public class MyStep {

    String baseUrl ;
    int userId;
    String email;
    String pass;
    Response response;
    String bearerToken = "700d0c7a86eb84028bf5cd204b11587f812f9d7cd880dc4edbdbd1d407ae9954";
    JSONObject jsonBody;
    @Given("the base URL is {string}")
    public void theBaseURLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult users with GET {string}")
    public void iConsultSync(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " +  bearerToken)
                .log().all()
                .when()
                .get(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code should be {int}")
    public void responseCodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for create users is {string}")
    public void theBaseError1URLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I create users with POST {string}")
    public void iConsultSyncError1(String url,String body) {
        jsonBody = new JSONObject(body);
        response =given()
                .body(body.toString())
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " +  bearerToken)
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for POST should be {int}")
    public void responseError1CodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for update user is {string}")
    public void theBaseError2URLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I update with PATCH {string}")
    public void iConsultSyncError2(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " +  bearerToken)
                .log().all()
                .when()
                .patch(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for patch should be {int}")
    public void responseError2CodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for delete user is {string}")
    public void theBaseError3URLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I delete a user with DELETE {string}")
    public void iConsultSyncError3(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " +  bearerToken)
                .log().all()
                .when()
                .delete(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for delete should be {int}")
    public void responseNotificationCodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }


}
