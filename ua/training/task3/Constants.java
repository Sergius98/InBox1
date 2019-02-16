package ua.training.task3;

public class Constants {
    public static final String NAME_REG_EX = "[A-Z][a-zA-Z]*";
    public static final String SECOND_NAME_REG_EX = "[A-Z][a-zA-Z]*";
    public static final String SURNAME_REG_EX = "[A-Z][a-zA-Z'.-]*";
    //public static final String SHORT_FULL_NAME_REG_EX = "[A-Z][a-zA-Z]*[ ][A-Z]\\.";
    public static final String NICKNAME_REG_EX = "[\\w\\_\\-\\.]+";
    public static final String COMMENT_REG_EX = ".{0,40}";
    public static final String GROUPS_REG_EX = "[A-Z]+(, [A-Z]+)*";
    public static final String CITY_PHONE_NUMBER_REG_EX = "[\\+]?[\\d]{3}(?<whitespace>[ ]?)((\\([\\d]{2}\\))|([\\d]{2}))"+
            "\\k<whitespace>[\\d]{3}\\k<whitespace>[\\d]{2}\\k<whitespace>[\\d]{2}";
    public static final String MOBILE_PHONE_NUMBER_REG_EX = CITY_PHONE_NUMBER_REG_EX;
    public static final String MOBILE_PHONE_NUMBER_2_REG_EX = "(" + CITY_PHONE_NUMBER_REG_EX + ")?";
    public static final String EMAIL_REG_EX = "([A-Za-z0-9]+(\\.|_)?)+@" +
            "([A-Za-z0-9]+(\\.|\\-)?)+.[A-Za-z]+";
    public static final String SKYPE_REG_EX = "[A-Za-z][A-Za-z0-9\\.,\\-_]{5,31}";
    public static final String POST_CODE_REG_EX = "[0-9]{5,6}";
    public static final String CITY_REG_EX = "[A-Z][a-zA-Z'.-]*( [A-Z][a-zA-Z'.-]*)*";
    public static final String STREET_REG_EX = "[A-Z][a-zA-Z'.-]*( [A-Z][a-zA-Z'.-]*)*";
    public static final String HOUSE_REG_EX = "[0-9]+(/[0-9]+)?(-[A-Za-z]+)?";
    public static final String APPARTMENT_REG_EX = "[0-9]+(-[A-Za-z]+)?";
}
