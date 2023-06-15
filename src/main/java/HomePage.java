public class HomePage {

    private ChromeDriver driver;
    private String getTextLocatorXpath="/html/body/div[1]/footer/div/div/div/div[2]/div[2] ";
    private String mainMenuNewsItemLocator = "//span[@class='b-main-navigation__text' and text()='Новости']";

    private String MainMenuAutoItemLocator = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[3]/a/span";

    public HomePage(ChromeDriver driver) {
        this.driver = driver;
    }

    public getText(){
        WebElement getText = driver.findElement(By.xpath(getTextLocatorXpath));
        String getTextMessage = getText.getText();
        retutn getTextMessage;
    }
}
