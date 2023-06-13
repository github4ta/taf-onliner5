import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginFormTest extends BaseTest {

    @Test
    public void testLoginFormOpened() {
        HomePage homePage = new HomePage(driver);
        homePage.goTo();
        homePage.clickButtonEnter();

        LoginFormPage loginFormPage = new LoginFormPage(driver);
        String actual = loginFormPage.getLabelTitleEnter();

        Assertions.assertEquals("Вход", actual);
    }
}
