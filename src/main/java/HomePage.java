import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;
  
    private String footerTextLocator ="/html/body/div[1]/footer/div/div/div/div[2]/div[2]";
    private String mainMenuNewsItemLocator = "//span[@class='b-main-navigation__text' and text()='Новости']";
    private String mainMenuHousesAndApartmentsItemLocator = "//span[@ class='b-main-navigation__text' and text() = 'Дома и квартиры']";
    private String mainMenuAutoItemLocator = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[3]/a/span";
    private String loginButtonLocator = "auth-bar__item auth-bar__item--text";



    public String getFooterText(){
        WebElement getText = driver.findElement(By.xpath(footerTextLocator));
        String footerText = getText.getText();
        return footerText;
    }
    public LoginFormPage(WebDriver driver) {
        this.driver = driver;
    }
}
