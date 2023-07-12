package com.demoqa.pageobjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AbstractPageObject {
    protected WebDriver driver;

    private final static int DURATION_TO_WAIT = 4;

    public AbstractPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public WebElement getElement(By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(DURATION_TO_WAIT)).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> getElements(By by) {
        return new WebDriverWait(driver, Duration.ofSeconds(DURATION_TO_WAIT)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void waitForVisibility(By by, int DURATION_TO_WAIT) {
        new WebDriverWait(driver, Duration.ofSeconds(DURATION_TO_WAIT)).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitForInvisibility(By by, int DURATION_TO_WAIT) {
        new WebDriverWait(driver, Duration.ofSeconds(DURATION_TO_WAIT)).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public WebElement scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        return element;
    }
}
