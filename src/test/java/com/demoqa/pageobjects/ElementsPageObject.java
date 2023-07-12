package com.demoqa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPageObject extends AbstractPageObject {

    private String elementsPageUrl = "https://demoqa.com/elements";

    private By buttonsMenuItem = (By.id("item-4"));
    private By clickMeButton = (By.xpath("//div/button[(text()='Click Me')]"));

    private By dynamicClickMessage = (By.id("dynamicClickMessage"));

    private static final String CLICK_ME_MESSAGE = "You have done a dynamic click";

    public ElementsPageObject(WebDriver driver) {
        super(driver);
    }

    public ElementsPageObject getButtonMenuItem() {
        scrollToElement(driver.findElement(By.id("item-4")));
        getElement(By.id("item-4")).click();
        return this;
    }

    public ElementsPageObject getClickMeButton() {
        getElement(By.xpath("//div/button[(text()='Click Me')]")).click();
        return this;
    }

    public String getDynamicClickMessage() {
        return getElement(By.id("dynamicClickMessage")).getText();
    }

    public String getUrl() {
        return elementsPageUrl;
    }

    public String getMessage() {
        return CLICK_ME_MESSAGE;
    }
}
