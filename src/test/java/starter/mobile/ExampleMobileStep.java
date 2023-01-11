package starter.mobile;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ExampleMobileStep {

    ExampleMobilePage mobileSearchPage;
    @Step
    public void lookForTextInAndroid(){
        //mobileSearchPage.open();
        mobileSearchPage.getDriver().get("https://www.yevo.com.pe");
        //WebElement testing = mobileSearchPage.getDriver().findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText"));
       // MobileElement testing = (MobileElement) mobileSearchPage.getDriver().findElement(MobileBy.xpath("//android.widget.EditText"));
       // mobileSearchPage.getAndroidSearchButton_Default().sendKeys("Yevo", Keys.ENTER);
        System.out.println();
    }

}
