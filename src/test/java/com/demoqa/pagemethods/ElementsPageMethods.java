package com.demoqa.pagemethods;

import com.demoqa.pageobjects.AbstractPageObject;
import com.demoqa.pageobjects.ElementsPageObject;
import com.demoqa.pageobjects.WebtablesPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class ElementsPageMethods extends AbstractPageObject {

    ElementsPageObject elementsPage = new ElementsPageObject(driver);

    public ElementsPageMethods(WebDriver driver) {
        super(driver);
    }

    /*public void openElementsUrl() {
        System.out.println("Opening page: " + elementsPage.getUrl());
        driver.get(elementsPage.getUrl());
        System.out.println("Page opened!");
    }*/

}
