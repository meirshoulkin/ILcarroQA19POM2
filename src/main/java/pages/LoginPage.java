package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editLoginEmail']")
    MobileElement inputEmail;

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/editLoginPassword']")
    MobileElement inputPassword;

    @FindBy(xpath = "//*[@resource-id = 'com.telran.ilcarro:id/loginBtn']")
    MobileElement btnYalla;

    public void fillLoginForm(String email, String password) {
        wait(inputEmail);
        typeText(email, inputEmail);
        typeText(password, inputPassword);
        click(btnYalla);
    }
}
