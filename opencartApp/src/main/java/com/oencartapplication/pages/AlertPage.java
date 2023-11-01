package com.oencartapplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencartallication.Utillity.UtillPage;

public class AlertPage {
	
	public AlertPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'SwitchTo')]")
	private WebElement switchto_click;
	
	@FindBy(xpath="//a[contains(text(),'Alerts')]")
	private WebElement alert_click;
	
	@FindBy(xpath="")
	private WebElement display_btn;
	
	public void switchtoicon()
	{
		UtillPage.movetoHandle(switchto_click);
	}
	
	public void clickalrt_link()
	{
		alert_click.click();
	}

	public void clickdisplay_btn()
	{
		display_btn.click();
	}
}
