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

    private final static String EDIT_AGE_VALUE = "0";

    private By addButton = (By.id("addNewRecordButton"));

    private By firstName = (By.id("firstName"));

    private By lastName = (By.id("lastName"));

    private By userEmail = (By.id("userEmail"));

    private By age = (By.id("age"));

    private By salary = (By.id("salary"));

    private By department = (By.id("department"));

    private By submitButton = (By.id("submit"));

    private By listElement = (By.xpath("//div[@role='rowgroup']"));

    private By modalWindow = (By.className(".modal-content"));
    public WebtablesPageObject(WebDriver driver) {
        super(driver);
    }

    public String getWebtablesUrl() {
        return webtablesPageUrl;
    }

    public WebtablesPageObject getAddButton() {
        getElement(By.id("addNewRecordButton")).click();
        return this;
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

    public WebtablesPageObject getSubmitButton() {
        getElement(By.id("submit")).click();
        return this;
    }

    public List<WebElement> getListElements() {
        return getElements(listElement);
    }

    public WebtablesPageObject getEditButton() {
        getElement(By.id("edit-record-4")).click();
        return this;
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

    public WebElement getAgeTableValue(){
        return getElement(By.xpath("//div[contains(text(),'"+getEmailValue()+"')]/preceding-sibling::div[1]"));
    }

    public WebElement getModalWindow() {
        return getElement(modalWindow);
    }

    public String getEditAgeValue() {
        return EDIT_AGE_VALUE;
    }
}
