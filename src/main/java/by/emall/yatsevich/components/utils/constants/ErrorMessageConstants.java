package by.emall.yatsevich.components.utils.constants;

public abstract class ErrorMessageConstants {

    public static final String ERROR_MESSAGE_EMPTY_PHONE_NUM_FIELD_TEXT = "Поле \"Номер телефона\" обязательно для заполнения.";
    public static final String ERROR_MESSAGE_EMPTY_ALL_FIELDS_TEXT = "Поле \"Номер телефона\" обязательно для заполнения.\n" +
            "Поле \"Пароль\" обязательно для заполнения.";
    public static final String ERROR_MESSAGE_INVALID_PHONE_NUM_EMPTY_PASSWORD_TEXT = "Значение поля \"Номер телефона\"" +
            " должно начинаться с +375 затем код (25|29|33|44) и далее 7 цифр (первая из которых не 0)\n" +
            "Поле \"Пароль\" обязательно для заполнения.";
    public static final String ERROR_MESSAGE_INVALID_PHONE_NUM_VALID_PASSWORD_TEXT = "Значение поля \"Номер телефона\"" +
            " должно начинаться с +375 затем код (25|29|33|44) и далее 7 цифр (первая из которых не 0)";
    public static final String ERROR_MESSAGE_VALID_PHONE_NUM_EMPTY_PASSWORD_TEXT = "Поле \"Пароль\" обязательно для заполнения.";
    public static final String ERROR_MESSAGE_BAD_DATA_TEXT = "Неверный логин или пароль";
    public static final String ERROR_MESSAGE_NO_AUTH_TOKEN = "auth token";
    public static final String ERROR_MESSAGE_PHONE_NUMBER = "Пожалуйста, убедитесь, что правильно ввели телефон";
}
