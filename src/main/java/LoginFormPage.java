import org.openqa.selenium.WebDriver;

public class LoginFormPage {

    private WebDriver driver;
    private String labelTitleEnterByClassName = "auth-form__title auth-form__title_big auth-form__title_condensed-default";

    public LoginFormPage(WebDriver driver){

        this.driver = driver;
    }
}
