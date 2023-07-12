package com.demoqa.pagemethods;

import com.demoqa.pageobjects.AbstractPageObject;
import com.demoqa.pageobjects.WebtablesPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class WebtablesPageMethods extends WebtablesPageObject {

    WebtablesPageObject webtablesPage = new WebtablesPageObject(driver);
    SoftAssert softAssert = new SoftAssert();

    public WebtablesPageMethods(WebDriver driver) {
        super(driver);
    }

    public WebtablesPageMethods openWebtablesUrl() {
        System.out.println("Opening page: " + webtablesPage.getWebtablesUrl());
        openUrl(webtablesPage.getWebtablesUrl());
        System.out.println("Page opened!");
        return this;
    }

    public WebtablesPageMethods validateListUpdate() {

        for (int i = 0; i < webtablesPage.getListElements().size(); i++) {
            System.out.println(webtablesPage.getListElements().size());
            WebElement newRecord = webtablesPage.getListElements().get(i);

            softAssert.assertTrue(webtablesPage.getListElements().get(i).getText().contains(webtablesPage.getEmailValue()));

            break;
        }
        return this;
    }

    public WebtablesPageMethods editAgeField() {
        webtablesPage.getEditButton().getAge().clear();
        webtablesPage.getAge().sendKeys(webtablesPage.getEditAgeValue());
        webtablesPage.getSubmitButton();

        return this;
    }

    public WebtablesPageMethods enterUserData() {
        webtablesPage.getAddButton().getFirstName().sendKeys(webtablesPage.getFistNameValue());
        webtablesPage.getLastName().sendKeys(webtablesPage.getLastNameValue());
        webtablesPage.getUserEmail().sendKeys(webtablesPage.getEmailValue());
        webtablesPage.getAge().sendKeys("23");
        webtablesPage.getSalary().sendKeys("11235");
        webtablesPage.getDepartment().sendKeys("QA");
        webtablesPage.getSubmitButton();
        return this;
    }
}

