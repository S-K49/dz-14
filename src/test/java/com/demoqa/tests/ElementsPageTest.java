package com.demoqa.tests;

import com.demoqa.pagemethods.ElementsPageMethods;
import com.demoqa.pageelements.ElementsPageElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsPageTest extends BaseTest {
    private static final String CLICK_ME_MESSAGE = "You have done a dynamic click";

    @Test

    public void elementsPageTest() {

        String actualMessage = new ElementsPageMethods(driver)
                .openElementsPageUrl()
                .clickButtonMenuItem()
                .pressClickMeButton()
                .getDynamicClickMessageText();

        System.out.println(new ElementsPageMethods(driver).getDynamicClickMessageText());

        Assert.assertEquals(actualMessage, CLICK_ME_MESSAGE, "Element is not displayed, check button click of " + new ElementsPageMethods(driver).pressClickMeButton());

    }
}