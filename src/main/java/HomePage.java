import org.openqa.selenium.WebDriver;

public class HomePage {
    String footerClassName = "footer-style__copy";
    String buttonEnterByClassName = "auth-bar__item auth-bar__item--text";
    String buttonNewsByClassName = "b-main-navigation__text";
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
}
