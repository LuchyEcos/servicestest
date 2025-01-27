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
    JSONObject jsonBody;
    @Given("the base URL is {string}")
    public void theBaseURLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync with POST {string}")
    public void iConsultSync(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code should be {int}")
    public void responseCodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for error NIT is {string}")
    public void theBaseError1URLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync with error 0 with POST {string}")
    public void iConsultSyncError1(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response error code 1 should be {int}")
    public void responseError1CodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Invalid NIT is {string}")
    public void theBaseError2URLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync with error 1 with POST {string}")
    public void iConsultSyncError2(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response error code 2 should be {int}")
    public void responseError2CodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Invalid Sync code is {string}")
    public void theBaseError3URLIs(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync with error 2 with POST {string}")
    public void iConsultSyncError3(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response error code 3 should be {int}")
    public void responseError3CodeShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync date is {string}")
    public void theBaseURLSync2Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync date with POST {string}")
    public void iConsultSync2(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync date should be {int}")
    public void responseCodeSync2ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync document is {string}")
    public void theBaseURLSync3Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync document with POST {string}")
    public void iConsultSync3(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync document should be {int}")
    public void responseCodeSync3ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync legend is {string}")
    public void theBaseURLSync4Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync legend with POST {string}")
    public void iConsultSync4(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync legend should be {int}")
    public void responseCodeSync4ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync messages services is {string}")
    public void theBaseURLSync5Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync messages services  with POST {string}")
    public void iConsultSync5(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync messages services should be {int}")
    public void responseCodeSync5ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync catalog is {string}")
    public void theBaseURLSync6Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync catalog  with POST {string}")
    public void iConsultSync6(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync catalog should be {int}")
    public void responseCodeSync6ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync events is {string}")
    public void theBaseURLSync7Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync events  with POST {string}")
    public void iConsultSync7(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync events should be {int}")
    public void responseCodeSync7ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync canceled is {string}")
    public void theBaseURLSync8Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync canceled with POST {string}")
    public void iConsultSync8(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync canceled should be {int}")
    public void responseCodeSync8ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync country is {string}")
    public void theBaseURLSync9Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync country with POST {string}")
    public void iConsultSync9(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync country should be {int}")
    public void responseCodeSync9ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync identity documents is {string}")
    public void theBaseURLSync10Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync identity documents with POST {string}")
    public void iConsultSync10(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync identity documents should be {int}")
    public void responseCodeSync10ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync sector document is {string}")
    public void theBaseURLSync11Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync sector document with POST {string}")
    public void iConsultSync11(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync sector document should be {int}")
    public void responseCodeSync11ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync emission is {string}")
    public void theBaseURLSync12Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync emission with POST {string}")
    public void iConsultSync12(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync emission should be {int}")
    public void responseCodeSync12ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync room is {string}")
    public void theBaseURLSync13Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync room with POST {string}")
    public void iConsultSync13(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync room should be {int}")
    public void responseCodeSync13ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync pay methods is {string}")
    public void theBaseURLSync14Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync pay methods with POST {string}")
    public void iConsultSync14(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync pay methods should be {int}")
    public void responseCodeSync14ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync coin is {string}")
    public void theBaseURLSync15Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync coin with POST {string}")
    public void iConsultSync15(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync coin should be {int}")
    public void responseCodeSync15ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync points of sale is {string}")
    public void theBaseURLSync16Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync points of sale with POST {string}")
    public void iConsultSync16(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync points of sale should be {int}")
    public void responseCodeSync16ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync tax is {string}")
    public void theBaseURLSync17Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync tax with POST {string}")
    public void iConsultSync17(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync tax should be {int}")
    public void responseCodeSync17ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }

    @Given("the base URL for Sync unit is {string}")
    public void theBaseURLSync18Is(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;

    }

    @When("I consult sync unit with POST {string}")
    public void iConsultSync18(String url) {

        response =given()

                .header("Content-Type", "application/json")
                .log().all()
                .when()
                .post(baseUrl+url);

        System.out.println(">>>>>>>>>>>> Response <<<<<<<<<<<<<");
        response.then().log().all();
    }

    @Then("The response code for Sync unit should be {int}")
    public void responseCodeSync18ShouldBe(int expectedCode) {
        response.then().statusCode(expectedCode);
    }



}
