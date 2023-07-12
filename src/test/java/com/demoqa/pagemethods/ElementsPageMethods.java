package com.demoqa.pagemethods;

import com.demoqa.pageobjects.AbstractPageObject;
import com.demoqa.pageobjects.ElementsPageObject;
import org.openqa.selenium.WebDriver;

public class ElementsPageMethods extends ElementsPageObject {

    ElementsPageObject elementsPage = new ElementsPageObject(driver);

    public ElementsPageMethods(WebDriver driver) {
        super(driver);
    }

    public ElementsPageMethods openElementsPageUrl() {
        System.out.println("Opening page: " + elementsPage.getUrl());
        openUrl(elementsPage.getUrl());
        System.out.println("Page opened!");
        return this;
    }
}
