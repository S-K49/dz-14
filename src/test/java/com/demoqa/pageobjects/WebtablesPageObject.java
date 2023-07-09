package com.demoqa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebtablesPageObject extends AbstractPageObject{

    private String webtablesPageUrl = "https://demoqa.com/webtables";

    private final static String FIRST_NAME = "Lucy";

    private final static String LAST_NAME = "Black";

    private final static String EMAIL = "lucy.black.123@test.com.ua";

    private By addButton = (By.id("addNewRecordButton"));

    private By firstName = (By.id("firstName"));

    private By lastName = (By.id("lastName"));

    private By userEmail = (By.id("userEmail"));

    private By age = (By.id("age"));

    private By salary = (By.id("salary"));

    private By department = (By.id("department"));

    private By submitButton = (By.id("submit"));

    private By listElement = (By.xpath("//div[@id='app']/div[@class='body-height']//div[@role='grid']/div[@class='rt-tbody']/div/div[@role='row']/div[4]"));

    private By editButton = (By.id("edit-record-4"));

    private By ageTableValue = (By.xpath("//div/div[4][contains(text(), 'lucy.black')]/preceding-sibling::div[1]"));

    private By modalWindow = (By.className(".modal-content"));
    public WebtablesPageObject(WebDriver driver) {
        super(driver);
        System.out.println("Opening page: " + getWebtablesUrl());
        driver.get(getWebtablesUrl());
        System.out.println("Page opened!");
    }

    public String getWebtablesUrl() {
        return webtablesPageUrl;
    }

    public WebElement getAddButton() {
        return getElement(addButton);
    }

    public WebElement getFirstName() {
        return getElement(firstName);
    }

    public WebElement getLastName() {
        return getElement(lastName);
    }

    public WebElement getUserEmail() {
        return getElement(userEmail);
    }

    public WebElement getAge() {
        return getElement(age);
    }

    public WebElement getSalary() {
        return getElement(salary);
    }

    public WebElement getDepartment() {
        return getElement(department);
    }

    public WebElement getSubmitButton() {
        return getElement(submitButton);
    }

    public List<WebElement> getListElements() {
        return getElements(listElement);
    }

    public WebElement getEditButton() {
        return getElement(editButton);
    }

    public String getFistNameValue() {
        return FIRST_NAME;
    }

    public String getLastNameValue() {
        return LAST_NAME;
    }

    public String getEmailValue() {
        return EMAIL;
    }

    public WebElement getAgeTableValue() {
        return getElement(ageTableValue);
    }

    public WebElement getModalWindow() {
        return getElement(modalWindow);
    }
}
