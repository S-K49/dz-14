package com.demoqa.pagemethods;

import com.demoqa.pageelements.ElementsPageElements;
import org.openqa.selenium.WebDriver;

public class ElementsPageMethods extends ElementsPageElements {

    private String elementsPageUrl = "https://demoqa.com/elements";

    public ElementsPageMethods(WebDriver driver) {
        super(driver);
    }

    public ElementsPageMethods openElementsPageUrl() {
        System.out.println("Opening page: " + getUrl());
        openUrl(getUrl());
        System.out.println("Page opened!");
        return this;
    }

    public ElementsPageMethods clickButtonMenuItem() {
        getButtonMenuItem().click();
        return this;
    }

    public ElementsPageMethods pressClickMeButton() {
        getClickMeButton().click();
        return this;
    }

    public String getUrl() {
        return elementsPageUrl;
    }
    public String getDynamicClickMessageText() {
        return getDynamicClickMessage().getText();
    }
}
