import org.openqa.selenium.WebDriver;

public class LoginFormPage {

    WebDriver driver;
    String labelTitleEnterByClassName = "auth-form__title auth-form__title_big auth-form__title_condensed-default";
    String buttonLoginByClassName = "auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full";
  
    public LoginFormPage(WebDriver driver){

        this.driver = driver;
    }
}
