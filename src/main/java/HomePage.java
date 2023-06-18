import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private String footerTextLocator = "//body//footer[1]//div[@class='footer-style__copy']";
    private String mainMenuNewsItemLocator = "//span[@class='b-main-navigation__text' and text()='Новости']";
    private String mainMenuHousesAndApartmentsItemLocator = "//span[@class='b-main-navigation__text' and text()='Дома и квартиры']";
    private String mainMenuCatalogItemLocator = "//span[@class='b-main-navigation__text' and text()='Каталог']";
    private String mainMenuAutoItemLocator = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[3]/a/span";
    private String mainMenuForumItemLocator = "//span[@class='b-main-navigation__text'and text()='Форум']";
    private String mainMenuBaraholkaItemLocator = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[6]/a/span";
    private String mainMenuUslugiLocator = "//span[@class='b-main-navigation__text' and contains(text(), 'Услуги')]";
    private String loginButtonLocator = "auth-bar__item--text";

    public String getFooterText() {
        WebElement getText = driver.findElement(By.xpath(footerTextLocator));
        return getText.getText();
    }
    public void clickButtonLogin() {
        driver.findElement(By.className(loginButtonLocator)).click();
    }
    public void clickHousesAndApartmentsItem() {
        driver.findElement(By.xpath(mainMenuHousesAndApartmentsItemLocator)).click();
    }
    public void clickMenuItemUslugi(){
        driver.findElement(By.xpath(mainMenuUslugiLocator)).click();
    }
}
