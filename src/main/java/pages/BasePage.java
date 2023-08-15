package pages;

import config.AppiumConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(AppiumConfig.getDriver()), this);
    }

    public String getText(MobileElement element) {
        return element.getText().trim().toUpperCase();
    }

    public void typeText(String text, MobileElement element) {
        element.click();
        element.clear();
        element.sendKeys(text);
        AppiumConfig.getDriver().hideKeyboard();
    }

    public void click(MobileElement element) {
        element.click();
    }

    public void wait(MobileElement element) {
        new WebDriverWait(AppiumConfig.getDriver(), 15)
                .until(ExpectedConditions.visibilityOf(element));
    }

}
