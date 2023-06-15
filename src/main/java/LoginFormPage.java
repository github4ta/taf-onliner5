public class LoginFormPage {
    Webdriver webdriver;

    String titleFormLocator = "//*[@id='auth-container']/div/div[2]/div/div[1]";
    String passwordInputLocator = "//input[@type='password']";
    String nicknameInputLocator = "//input[@placeholder='Ник или e-mail']";
    String enterButtonLocator = "//button[@type='submit' and @class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";

    public void clickButtonEnter(){
        webDriver.findElement(By.xpath(enterButtonLocator)).click();
    }
}

