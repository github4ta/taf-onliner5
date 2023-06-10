import org.openqa.selenium.WebDriver;

public class LoginFormPage {

    WebDriver driver;
  
    String labelTitleEnterByClassName = "auth-form__title auth-form__title_big auth-form__title_condensed-default";
    String inputPasswordFieldXpath = "//input[@type='password']";
    String buttonLoginByClassName = "auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full";
    String inputNickNameByXPath ="//input[@placeholder='Ник или e-mail']";
    String errorMessageEmailXpath = "//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
  
    public LoginFormPage(WebDriver driver){
        this.driver = driver;
    }
}
