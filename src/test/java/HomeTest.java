import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
    @Test
    public void testCheckHomepageIsOpened(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.onliner.by");
        HomePage homePage = new HomePage(driver);
        String actualFooterText = homePage.getFooterText();
        System.out.println(actualFooterText);
        Assertions.assertEquals("© 2001—2023 Onlíner", actualFooterText);
        driver.quit();
    }
}
