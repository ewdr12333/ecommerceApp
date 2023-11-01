package ApplicationTest;

import org.testng.annotations.Test;

import com.oencartapplication.pages.AlertPage;
import com.oencartapplication.pages.HomePage;
import com.opencartapplication.Testbase.TestBasePage;

public class RegisterTest extends TestBasePage {
	@Test
	public void validateregisterPage()
	{
		HomePage HomePage_obj=new HomePage(driver);
		HomePage_obj.clickregist_btn();
		AlertPage AlertPage_obj=new AlertPage(driver);
		AlertPage_obj.switchtoicon();
		AlertPage_obj.clickalrt_link();
		AlertPage_obj.clickdisplay_btn();
		
	}

}
