package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import starter.steps.HomeSteps;
import starter.steps.IngresarSteps;

public class IngresarStepDefinitions {

    @Steps
    IngresarSteps ingresarSteps;

    @Steps
    HomeSteps homeSteps;

    @Given("User opens the website")
    public void userOpensTheWebsite() {
        ingresarSteps.goToIngresarSite();
    }

    @Given("the user clicks on login button")
    public void theUserClicksOnLoginButton() {
    }

    @Given("the user enters the credentials document number {string} and password {string}")
    public void theUserEntersTheCredentialsDocumentNumberAndPassword(String documentNumber, String password) {
        ingresarSteps.completeLoginForm(documentNumber, password);
    }

    @And("Username {string} should be displayed")
    public void usernameShouldBeDisplayed(String username) {
        Assertions.assertThat(homeSteps.validateUserNameIsDisplayed(username)).isTrue();
    }

    @Then("Yevo home page should be displayed")
    public void yevoHomePageShouldBeDisplayed() {
        //Assertions.assertThat(homeSteps.validateHomePageIsDisplayed()).isTrue();
    }
}

