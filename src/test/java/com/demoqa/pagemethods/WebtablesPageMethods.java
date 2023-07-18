package com.demoqa.pagemethods;

import com.demoqa.pageelements.WebtablesPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class WebtablesPageMethods extends WebtablesPageElements {

    private String webtablesPageUrl = "https://demoqa.com/webtables";

    private final static String FIRST_NAME = "Lucy";

    private final static String LAST_NAME = "Black";

    private final static String EDIT_AGE_VALUE = "0";

    protected final static String EMAIL = "lucy.black.123@test.com.ua";
    SoftAssert softAssert = new SoftAssert();

    public WebtablesPageMethods(WebDriver driver) {
        super(driver);
    }

    public String getWebtablesUrl() {
        return webtablesPageUrl;
    }

    public WebtablesPageMethods openWebtablesUrl() {
        System.out.println("Opening page: " + getWebtablesUrl());
        openUrl(getWebtablesUrl());
        System.out.println("Page opened!");
        return this;
    }

    public WebtablesPageMethods clickAddButton() {
        getAddButton().click();
        return this;
    }

    public WebtablesPageMethods validateListUpdate() {

        for (int i = 0; i < getListElements().size(); i++) {
            System.out.println(getListElements().size());
            WebElement newRecord = getListElements().get(i);

            softAssert.assertTrue(getListElements().get(i).getText().contains(EMAIL));

            break;
        }
        return this;
    }

    public WebtablesPageMethods editAgeField() {
        getEditButton().click();
        getAge().clear();
        getAge().sendKeys(EDIT_AGE_VALUE);
        getSubmitButton();

        softAssert.assertEquals(getAgeTableValue(EMAIL).getText(), EDIT_AGE_VALUE, "The value " + getAge() + " is not updated to " + EDIT_AGE_VALUE + ". Actual value is" + getAgeTableValue(EMAIL).getText());

        return this;
    }

    public WebtablesPageMethods addUser() {
        getFirstName().sendKeys(FIRST_NAME);
        getLastName().sendKeys(LAST_NAME);
        getUserEmail().sendKeys(EMAIL);
        getAge().sendKeys("23");
        getSalary().sendKeys("11235");
        getDepartment().sendKeys("QA");
        getSubmitButton().click();

        return this;
    }
}

