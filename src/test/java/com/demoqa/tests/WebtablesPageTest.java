package com.demoqa.tests;

import com.demoqa.pagemethods.WebtablesPageMethods;
import com.demoqa.pageobjects.WebtablesPageObject;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebtablesPageTest extends BaseTest{

    @Test

    public void addUpdateTest() {

        WebtablesPageObject webtablesPage = new WebtablesPageObject(driver);
        WebtablesPageMethods webtablesPageMethods = new WebtablesPageMethods(driver);
        SoftAssert softAssert = new SoftAssert();

        webtablesPage.getAddButton().click();
        webtablesPage.getFirstName().sendKeys(webtablesPage.getFistNameValue());
        webtablesPage.getLastName().sendKeys(webtablesPage.getLastNameValue());
        webtablesPage.getUserEmail().sendKeys(webtablesPage.getEmailValue());
        webtablesPage.getAge().sendKeys("23");
        webtablesPage.getSalary().sendKeys("11235");
        webtablesPage.getDepartment().sendKeys("QA");

        webtablesPage.getSubmitButton().click();

        webtablesPageMethods.validateListUpdate();

        webtablesPage.getEditButton().click();

        webtablesPage.getAge().clear();
        webtablesPage.getAge().sendKeys("0");

        String expectedAge = webtablesPage.getAge().getAttribute("value");

        webtablesPage.getSubmitButton().click();

        softAssert.assertEquals(webtablesPage.getAgeTableValue().getText(), expectedAge, "The value " + webtablesPage.getAge() + " is not updated to " + expectedAge + ". Actual value is" + webtablesPage.getAgeTableValue().getText());

        softAssert.assertAll();
    }
}
