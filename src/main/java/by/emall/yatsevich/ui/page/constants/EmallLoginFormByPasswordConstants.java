package by.emall.yatsevich.ui.page.constants;

public interface EmallLoginFormByPasswordConstants {

    String LOGIN_FORM_PAGE_BY_PASSWORD_URL = "https://emall.by/login/password";

    String LOGIN_FORM_PHONE_NUM_FIELD_XPATH = "//input[@class='new-input-phone_input__XWAH5']";
    String LOGIN_FORM_PASSWORD_FIELD_XPATH = "//input[@class='input_input___r0Z7 input_input_size_medium__00yqU']";
    String LOGIN_FORM_SEE_PASSWORD_BUTTON_XPATH = "//div[@class='input_clickable__oKJEf']";
    String LOGIN_FORM_ENTER_BUTTON_XPATH = "//button[@class='btn_btn__QQYBS btn_btn_colour_black__V_2g5 btn_btn_size_medium__oY0HW password_button__Pt0gU']";
    String LOGIN_FORM_ERROR_MESSAGE_XPATH = "//div[@class='password_error_message__KRNDP']";

    String LOGIN_FORM_ERROR_MESSAGE_EMPTY_FIELDS_TEXT = "Значение поля \"Номер телефона\" должно начинаться с +375 затем код (25|29|33|44) и далее 7 цифр (первая из которых не 0)\n" +
            "Поле \"Пароль\" обязательно для заполнения.";
    String LOGIN_FORM_ERROR_MESSAGE_EMPTY_PHONE_NUM_TEXT = "Значение поля \"Номер телефона\" должно начинаться с +375 затем код (25|29|33|44) и далее 7 цифр (первая из которых не 0)";
    String LOGIN_FORM_ERROR_MESSAGE_EMPTY_PASSWORD_TEXT = "Поле \"Пароль\" обязательно для заполнения.";

}
