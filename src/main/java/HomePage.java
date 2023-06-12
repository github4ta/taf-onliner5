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
    String mainNavFleaItemByXpath = "//span[@class='b-main-navigation__text'][text()='Барахолка']";
    String buttonCatalogItemXpath = "//span[@class='b-main-navigation__text' and text() = 'Каталог']";
    String buttonHousesAndApartmentsXPath= "//*[@id='container']/div/div[2]/header/div[1]/div/nav/ul[1]/li[4]/a/span";

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage clickNewsButton() {
        WebElement buttonNews = driver.findElement(By.className(buttonNewsByXpath));
        buttonNews.click();
        return this;

    public void clickButtonEnter(){
        WebElement buttonEnter = driver.findElement(By.className(buttonEnterByClassName));
        buttonEnter.click();
    }
    public void clickmainNavAvtobaraholkaItem(){
        Webelement mainNavAvtobaraholkaItem = driver.findElement(By.Xpath(mainNavAvtobaraholkaItemXpath));
        mainNavAvtobaraholkaItem.click();
    }
      
    public void clickServicesItem() {
            WebElement servicesItem = driver.findElement(By.xpath(servicesItemByXpath));
            servicesItem.click();
        }
    }
    public void clickbuttonCatalogItem(){
        WebElement buttonCatalogItem = driver.findElement(By.xpath(buttonCatalogItemXpath));
        buttonCatalogItem.click();
    }
}
