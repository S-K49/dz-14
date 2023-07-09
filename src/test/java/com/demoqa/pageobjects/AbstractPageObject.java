package com.demoqa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

//    /**
//     * Wait for specific ExpectedCondition for the given amount of time in seconds
//     */
//    public void waitFor(ExpectedCondition<WebElement> condition, Duration timeOut) {
//        timeOut = timeOut != null ? timeOut : Duration.ofSeconds(30);
//        WebDriverWait wait = new WebDriverWait(driver, timeOut);
//        wait.until(condition);
//    }
//
//    protected void waitForVisibilityOfWebElement(By WebElement, Duration... timeOut) {
//        int attempts = 0;
//        while (attempts < 2) {
//            try {
//                waitFor(ExpectedConditions.visibilityOfElementLocated(WebElement),
//                        (timeOut.length > 0 ? timeOut[0] : null));
//                break;
//            } catch (StaleElementReferenceException e) {
//            }
//            attempts++;
//        }
//
//    }
}
