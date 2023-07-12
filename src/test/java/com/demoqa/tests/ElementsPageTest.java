package com.demoqa.tests;

import com.demoqa.pagemethods.ElementsPageMethods;
import com.demoqa.pageobjects.ElementsPageObject;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTest extends BaseTest {

    @Test

    public void elementsPageTest() {

        ElementsPageObject elementsPage = new ElementsPageObject(driver);

        new ElementsPageMethods(driver).openElementsPageUrl();

        String actualMessage = elementsPage
                .getButtonMenuItem()
                .getClickMeButton()
                .getDynamicClickMessage();

        System.out.println(elementsPage.getDynamicClickMessage());

        Assert.assertEquals(actualMessage, elementsPage.getMessage(), "Element is not displayed, check button click of " + elementsPage.getClickMeButton());

    }
}