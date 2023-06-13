import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFormPage {

    WebDriver driver;

    String labelTitleEnterByXPath = "//*[@id='auth-container']/div/div[2]/div/div[1]";
    String inputPasswordFieldXpath = "//input[@type='password']";
    String buttonLoginByClassName = "auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full";
    String inputNickNameByXPath = "//input[@placeholder='Ник или e-mail']";
    String errorMessageEmailXpath = "//div[contains(@class,'auth-form__description_error') and contains(text(), 'Укажите ник или e-mail')]";
    String errorMessagePasswordXpath = "//div[contains(@class,'auth-form__description_error') and contains(text(), 'Укажите пароль')]";


    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonLogin() {
        driver.findElement(By.className(buttonLoginByClassName)).click();
    }

    public String getLabelTitleEnter() {
        WebElement labelTitleEnter = driver.findElement(By.xpath(labelTitleEnterByXPath));
        return labelTitleEnter.getText();
    }

    public LoginFormPage inputNickName() {
        WebElement inputName = driver.findElement(By.xpath(inputNickNameByXPath));
        inputName.click();
        return this;
    }

    public LoginFormPage inputPasswordCheck() {
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordFieldXpath));
        inputPassword.click();
        return this;
    }

    public String getTextOfBtnLogin() {
        WebElement getText = driver.findElement(By.className(buttonLoginByClassName));
        return getText.getText();
    }

    public String getPasswordText(){
        WebElement resultField = driver.findElement(By.xpath(inputPasswordFieldXpath));
        return resultField.getText();
    }
}
