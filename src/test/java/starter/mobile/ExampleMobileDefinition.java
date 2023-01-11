package starter.mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ExampleMobileDefinition {

    @Steps
    ExampleMobileStep exampleMobileStep;

    @Given("I want to search Yevo in google in android")
    public void iWantToSearchYevoInGoogleInAndroid() {
        exampleMobileStep.lookForTextInAndroid();
    }

    @When("the client clicks on Yevo link in android")
    public void theClientClicksOnYevoLinkInAndroid() {
    }

    @Then("Yevo home page should be displayed in android")
    public void yevoHomePageShouldBeDisplayedInAndroid() {
    }
}
