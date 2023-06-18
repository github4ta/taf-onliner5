import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFormPage {
  
    WebDriver webdriver;

    String titleFormLocator = "//*[@id='auth-container']/div/div[2]/div/div[1]";
    String passwordInputLocator = "//input[@type='password']";
    String nicknameInputLocator = "//input[@placeholder='Ник или e-mail']";
    String enterButtonLocator = "//button[@type='submit' and @class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    String errorMassageEmailLocator = "/div[contains(text(),'Укажите ник или e-mail')]";
    String passwordInputFieldPlaceholderText = "Пароль";
    String EnterPasswordLocator = "//*[@id='auth-container']/div/div[2]/div/form/div[2]/div/div/div[2]/div";

    public LoginFormPage(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    public void clickButtonEnter(){
        webdriver.findElement(By.xpath(enterButtonLocator)).click();
    }
  
    public String getTextTitleForm(){
        String textTitleForm = webdriver.findElement(By.xpath(titleFormLocator)).getText();
        return textTitleForm;
    }
    public String getPasswordInputFieldPlaceholderText(){
        WebElement passwordInputField = webdriver.findElement(By.xpath(passwordInputLocator));
        return passwordInputField.getAttribute("placeholder");
    }
}

