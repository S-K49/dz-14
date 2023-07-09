package com.demoqa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPageObject extends AbstractPageObject {

    private String elementsPageUrl = "https://demoqa.com/elements";

    private By buttonsMenuItem = (By.id("item-4"));
    private By clickMeButton = (By.xpath("//div/button[(text()='Click Me')]"));

    private By dynamicClickMessage = (By.id("dynamicClickMessage"));

    public ElementsPageObject(WebDriver driver) {
        super(driver);
        System.out.println("Opening page: " + getUrl());
        driver.get(getUrl());
        System.out.println("Page opened!");
    }

    public WebElement getButtonMenuItem() {
        return getElement(buttonsMenuItem);
    }

    public WebElement getClickMeButton() {
        return getElement(clickMeButton);
    }

    public WebElement getDynamicClickMessage() {
        return getElement(dynamicClickMessage);
    }

    public String getUrl() {
        return elementsPageUrl;
    }
}
