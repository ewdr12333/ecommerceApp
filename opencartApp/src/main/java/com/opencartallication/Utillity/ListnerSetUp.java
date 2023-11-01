package com.opencartallication.Utillity;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencartapplication.Testbase.TestBasePage;

public class ListnerSetUp extends TestBasePage implements ITestListener{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("TestCase Starte" +result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TestCase Passed" +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		UtillPage.screenShot(result.getName());
		System.out.println("TestCase Failed" +result.getName());
	}
	

	@Override
	public void onTestSkipped(ITestResult result) 
	{
	
		System.out.println("TestCase Skipped" +result.getName());
	}
	}

	


