package by.onliner.ui;

import by.onliner.pages.HomePage;
import by.onliner.pages.LoginFormPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFormTest extends BaseTest {
    @Test
    public void testPasswordInputFieldPlaceholder() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        LoginFormPage loginFormPage = new LoginFormPage(driver);
        driver.get("https://www.onliner.by/");
        Assertions.assertEquals("Войти", loginFormPage.getTextEnterButton());

        homePage.clickButtonLogin();
        Assertions.assertEquals(loginFormPage.passwordInputFieldPlaceholderText, loginFormPage.getPasswordInputFieldPlaceholderText());
    }
}
