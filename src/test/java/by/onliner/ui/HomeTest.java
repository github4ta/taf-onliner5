package by.onliner.ui;

import by.onliner.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest {
    @Test
    public void testCheckHomepageIsOpened(){
        driver.get("https://www.onliner.by");
        HomePage homePage = new HomePage(driver);
        String actualFooterText = homePage.getFooterText();
        Assertions.assertEquals("© 2001—2023 Onlíner", actualFooterText);
    }
}
