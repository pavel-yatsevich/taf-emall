package by.emall.yatsevich.ui.page;

public class EmallMainPage extends AbstractPage {

    private static final String BASE_URL = "https://emall.by/";
    public static final String EMALL_MAIN_PAGE_LOGIN_FORM_BUTTON_XPATH = "//button[@class='touchable_button__GJNQZ actions_action__button__OiPrx']";

    public EmallMainPage() {
        super();
    }

    @Override
    public CookiesTitlePage openPage() {
        driver.navigate().to(BASE_URL);
        return new CookiesTitlePage();
    }
}
