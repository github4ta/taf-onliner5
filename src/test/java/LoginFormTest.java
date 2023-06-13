import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoginFormTest extends Test {

    @Test
    public void testLoginHeader(){
        driver.get("https://www.onliner.by/");
        homePage.clickButtonEnter();
        String actualResult = loginFormPage.getResultTextLogin();
        Assertions.assertEquals(actualResult, "Вход");
    }
    @Test
    public void inputEmailPlaceholderCheck() {
        homePage.clickButtonEnter();
        Assertions.assertEquals("Ник или e-mail",loginFormPage.inputNickName());
    }
}