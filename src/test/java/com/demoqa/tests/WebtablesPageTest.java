package com.demoqa.tests;

import com.demoqa.pagemethods.WebtablesPageMethods;
import com.demoqa.pageelements.WebtablesPageElements;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebtablesPageTest extends BaseTest{

    @Test

    public void addUpdateUserTest() {

        new WebtablesPageMethods(driver)
                .openWebtablesUrl()
                .clickAddButton()
                .addUser()
                .validateListUpdate()
                .editAgeField();
    }
}
