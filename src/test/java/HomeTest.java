import org.junit.jupiter.api.Assertions;

class HomeTest extends Test {

    HomePage homePage;
    @org.junit.jupiter.api.Test
    public void openSiteAndCheckFooterText(){
        homePage = new HomePage(driver);
        homePage.goTo();
        String actualResult = homePage.getFooterText();
        Assertions.assertEquals("© 2001—2023 Onlíner", actualResult);
    }
}