public class LoginFormPage {

    String titleFormLocator = "//*[@id='auth-container']/div/div[2]/div/div[1]";
    String passwordInputLocator = "//input[@type='password']";
    String nicknameInputLocator = "//input[@placeholder='Ник или e-mail']";
    String enterButtonLocator = "//button[@type='submit' and @class='auth-button auth-button_primary auth-button_middle auth-form__button auth-form__button_width_full']";
    String errorMassageEmailLocator = "//div[@class='auth-form__description auth-form__description_error auth-form__description_base auth-form__description_extended-other' and text()='Укажите ник или e-mail']";
}
