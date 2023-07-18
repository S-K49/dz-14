package com.demoqa.pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebtablesPageElements extends AbstractPageObject{

    public WebtablesPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddButton() {
        return getElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstName() {
        return getElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return getElement(By.id("lastName"));
    }

    public WebElement getUserEmail() {
        return getElement(By.id("userEmail"));
    }

    public WebElement getAge() {
        return getElement(By.id("age"));
    }

    public WebElement getSalary() {
        return getElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return getElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return getElement(By.id("submit"));
    }

    public List<WebElement> getListElements() {
        return getElements(By.xpath("//div[@role='rowgroup']"));
    }

    public WebElement getEditButton() {
        return getElement(By.id("edit-record-4"));
    }

    public WebElement getAgeTableValue(String value){
        return getElement(By.xpath("//div[contains(text(),'"+value+"')]/preceding-sibling::div[1]"));
    }

    public WebElement getModalWindow() {
        return getElement(By.className(".modal-content"));
    }
}
