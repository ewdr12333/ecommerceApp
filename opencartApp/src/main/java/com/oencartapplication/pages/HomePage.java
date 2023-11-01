package com.oencartapplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@id='btn2']")
	private WebElement regist_btn;
	
	
	public void clickregist_btn() {
		regist_btn.click();
		
	}

}
