package com.demoqa.tests;

import com.demoqa.pageobjects.ElementsPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTest extends BaseTest {

    @Test

    public void elementsPageTest() {

        ElementsPageObject elementsPage = new ElementsPageObject(driver);

        elementsPage.getButtonMenuItem().click();
        elementsPage.getClickMeButton().click();
        System.out.println(elementsPage.getDynamicClickMessage().getText());

        Assert.assertTrue(elementsPage.getDynamicClickMessage().isDisplayed(), "Element is not displayed, check button click of " + elementsPage.getClickMeButton().getText());

    }
}