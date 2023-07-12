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
        SoftAssert softAssert = new SoftAssert();

        new WebtablesPageMethods(driver)
                .openWebtablesUrl()
                .enterUserData()
                .validateListUpdate()
                .editAgeField();

        softAssert.assertEquals(webtablesPage.getAgeTableValue().getText(), webtablesPage.getEditAgeValue(), "The value " + webtablesPage.getAge() + " is not updated to " + webtablesPage.getEditAgeValue() + ". Actual value is" + webtablesPage.getAgeTableValue().getText());

        softAssert.assertAll();
    }
}
