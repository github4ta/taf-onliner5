import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginFormTest extends Test{
    @Test
    public void inputEmailPlaceholderCheck() {
        homePage.clickButtonEnter();
        Assertions.assertEquals("Ник или e-mail",loginFormPage.inputNickName());
    }
    @Test
    public void inputPasswordPlaceholderCheck() {
        homePage.clickButtonEnter();
        Assertions.assertEquals("Ник или e-mail",loginFormPage.inputPasswordCheck());
    }

}