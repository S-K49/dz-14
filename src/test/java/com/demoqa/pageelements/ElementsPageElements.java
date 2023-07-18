package com.demoqa.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPageElements extends AbstractPageObject {

    public ElementsPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonMenuItem() {
        scrollToElement(driver.findElement(By.id("item-4")));
        return getElement(By.id("item-4"));
    }

    public WebElement getClickMeButton() {
        return getElement(By.xpath("//div/button[(text()='Click Me')]"));
    }

    public WebElement getDynamicClickMessage() {
        return getElement(By.id("dynamicClickMessage"));
    }
}
