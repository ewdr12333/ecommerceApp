package com.opencartallication.Utillity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.opencartapplication.Testbase.TestBasePage;

public class UtillPage extends TestBasePage{
	
	
	public static void screenShot(String fname)
	{
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\Admin\\Desktop\\allrepo\\ecommerceApp\\opencartApp\\Screenshot\\"+fname+".png");
		try {
			FileHandler.copy(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String writedata(String sheet_nm,int row_nm,int cell_nm) throws IOException
	{
		String path="C:\\Users\\Admin\\Desktop\\allrepo\\ecommerceApp\\opencartApp\\Resource\\Testdata111.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFCell cell=wb.getSheet(sheet_nm).getRow(row_nm).getCell(cell_nm);
		DataFormatter df=new DataFormatter();
		String data1=df.formatCellValue(cell);
		return data1;
				
	}
	
	public static void readData(int sheet_nm,int row_nm,int cell_nm,String data) throws IOException
	{
		String path="C:\\Users\\Admin\\Desktop\\allrepo\\ecommerceApp\\opencartApp\\Resource\\Testdata111.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(sheet_nm);
		sheet.getRow(row_nm).createCell(cell_nm).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
	}
	
	public static void movetoHandle(WebElement element )
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
		
	}

}
