package starter.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.pages.IngresarPage;
import java.time.Duration;


public class IngresarSteps {

    IngresarPage ingresarPage;

    @Step
    public void goToIngresarSite(){
        ingresarPage.getDriver().navigate().to("http://yevo-web-dev.azurewebsites.net/ingresar");
    }

    private void completeField(WebElementFacade inputField, String entry){
        inputField.clear();
        inputField.sendKeys(entry);
    }

    @Step
    public void completeLoginForm(String documentNumber, String password){
        completeField(ingresarPage.getDocumentNumberInputField(), documentNumber);
        completeField(ingresarPage.getPasswordInputField(), password);
       // ingresarPage.getRecaptchaCheck().waitUntilEnabled().click();
//        WebDriverWait wait = new WebDriverWait(ingresarPage.getDriver(), 25000);
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
//                By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
//
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();


        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ingresarPage.getIngresarButton().click();
    }




}
