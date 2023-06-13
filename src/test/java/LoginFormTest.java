import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginFormTest extends BaseTest {
    @Test
    public void testIsCorrectNameButtonSignIn(){
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        LoginFormPage page = new LoginFormPage(driver);

        homePage.goTo();
        homePage.clickButtonEnter();
        Assertions.assertEquals("Войти", page.getTextOfBtnLogin());
    }
}
