import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    String footerClassName = "footer-style__copy";
    String buttonEnterByClassName = "auth-bar__item auth-bar__item--text";
    String buttonNewsByClassName = "b-main-navigation__text";
    String servicesItemByXpath = "//span[@class='b-main-navigation__text' and text() = 'Услуги']";
    String mainNavAvtobaraholkaItemXpath = "//span[@class='b-main-navigation__text'and text()='Автобарахолка']";
    String mainNavForumItemXpath = "//span[@class='b-main-navigation__text'and text()='Форум']";

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
        public void clickServicesItem() {
            WebElement servicesItem = driver.findElement(By.xpath(servicesItemByXpath));
            servicesItem.click();
        }
    }
