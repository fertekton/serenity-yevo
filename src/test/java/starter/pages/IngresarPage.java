package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://yevo-web-dev.azurewebsites.net/")
public class IngresarPage extends PageObject {

    @FindBy(xpath = "//input[@formcontrolname='documentNumber']")
    private WebElementFacade documentNumberInputField;

    @FindBy(xpath = "//input[@formcontrolname='password']")
    private WebElementFacade passwordInputField;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    private WebElementFacade recaptchaCheck;

    private By recaptchaCheckLocator = By.xpath("//div[@class='recaptcha-checkbox-border']");

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade ingresarButton;

    public WebElementFacade getDocumentNumberInputField() {
        return documentNumberInputField;
    }

    public WebElementFacade getPasswordInputField() {
        return passwordInputField;
    }

    public WebElementFacade getRecaptchaCheck() {
        return recaptchaCheck;
    }

    public WebElementFacade getIngresarButton() {
        return ingresarButton;
    }

    public By getRecaptchaCheckLocator() {
        return recaptchaCheckLocator;
    }
}
