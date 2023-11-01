package com.oencartapplication.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="")
	private WebElement fname_txt;
	
	@FindBy(xpath="")
	private WebElement lname_txt;
	
	@FindBy(xpath="")
	private WebElement address_txt;
	
	@FindBy(xpath="")
	private WebElement email_txt;
	
	@FindBy(xpath="")
	private WebElement female_redio;
	
	@FindBy(xpath="")
	private WebElement cricket_chkbox;
	
	@FindBy(xpath="")
	private WebElement hockey_chkbox;
	
	@FindBy(xpath="")
	private WebElement lang_dropdown;
	
	@FindBy(xpath="")
	private WebElement skill_dropdown;
	
	@FindBy(xpath="")
	private WebElement country_drodown;
	
	@FindBy(xpath="")
	private WebElement year_drodown;
	
	@FindBy(xpath="")
	private WebElement month_drodown;
	
	@FindBy(xpath="")
	private WebElement day_drodown;
	
	@FindBy(xpath="")
	private WebElement password_txt;
	
	@FindBy(xpath="")
	private WebElement confirmpwd_txt;
	
	@FindBy(xpath="")
	private WebElement submit_btn;
	
	public void enterfname_txt()
	{
		
	}

	public void enterlname_txt()
	{
		
	}
	public void enteraddress_txt()
	{
		
	}
	public void enteremail_txt()
	{
		
	}
	public void enterphonenum_txt()
	{
		
	}
	public void selectfemale_redio()
	{
		
	}
	public void checkcricket_chkbox()
	{
		
	}
	public void checkhockey_chkbox()
	{
		
	}
	public void selectlang_dropdown()
	{
		
	}
	public void selectskill_dropdown()
	{
		
	}
	public void selectcountry_dropdown()
	{
		
	}
	public void selectyear_dropdown()
	{
		
	}
	public void selectmonth_dropdown()
	{
		
	}
	public void selectday_dropdown()
	{
		
	}
	public void enterpassword_txt()
	{
		
	}
	
	public void enterconfirmpass_txt()
	{
		
	}
	
	public void clicksubmit_btn()
	{
		
	}
	
}
