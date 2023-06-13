import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HomeTest extends BaseTest {

    HomePage homePage;

    @Test
    public void openSiteAndCheckFooterText() {
        homePage = new HomePage(driver);
        homePage.goTo();
        String actualResult = homePage.getFooterText();
        Assertions.assertEquals("© 2001—2023 Onlíner", actualResult);
    }
}
