package com.lacoste.com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.lacoste.com.utils.DriverUtils;
import org.testng.Assert;

public class HomePage extends DriverUtils {
public HomePage() {
	HomePage.initDriver();
}

@FindBy(xpath="/html/body/div[3]/h1/a")
private WebElement logoImage;

@FindBy(xpath="//*[@id=\"main-menu\"]/div/div[2]/ul/li[3]/a")
private WebElement goToMyAccount;

public void verifyPage() {
	Assert.assertTrue(logoImage.isDisplayed());
}

public void goToMyAccount() {
	goToMyAccount.click();
}
}
