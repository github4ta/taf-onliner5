import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{
    String footerClassName = "footer-style__copy";
    String buttonEnterByClassName = "auth-bar__item auth-bar__item--text";
    String buttonNewsByXpath = "//span[@class='b-main-navigation__text' and text() = 'Новости']";
    String servicesItemByXpath = "//span[@class='b-main-navigation__text' and text() = 'Услуги']";
    String mainNavAvtobaraholkaItemXpath ="//span[@class='b-main-navigation__text'and text()='Автобарахолка']";
    String mainNavForumItemXpath ="//span[@class='b-main-navigation__text'and text()='Форум']";

        public void clickForumItem() {
            WebElement forumItem = driver.findElement(By.xpath(mainNavForumItemXpath));
            forumItem.click();
        }
    }
