package pit.Bajaj;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;

public class Signout {
WebDriver driver;	
  @Test
  public void f() throws InterruptedException  {
	  Home ob=new Home(driver);
	  ob.Email();
	  ob.PsswordFieldsEnters();
	  Thread.sleep(6000);
	  ob.ForgotLinkClick();
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClickZ();
	  Thread.sleep(6000);
  }
  @Test
  public void TestVerificationMethod() throws InterruptedException { 
	  driver.navigate().back();
	  Thread.sleep(6000);
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  String Questions=id.QuestionofText();
	  SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
	  System.out.println("This is after assertion");
	  softit.assertAll();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonal\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		// TODO Auto-generated method stub
driver= new ChromeDriver();
driver.navigate().to("https://www.facebook.com");
			driver.manage().window().maximize();  
}
	  
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  }


