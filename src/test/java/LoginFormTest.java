import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginFormTest extends BaseTest {

    @Test
    public void inputEmailPlaceholderCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonEnter();
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        Assertions.assertEquals("Ник или e-mail", loginFormPage.inputNickName());
    }

    @Test
    public void inputPasswordPlaceholderCheck() {
        HomePage homePage = new HomePage(driver);
        homePage.clickButtonEnter();
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        Assertions.assertEquals("Ник или e-mail", loginFormPage.inputPasswordCheck());
    }
}
