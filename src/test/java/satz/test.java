package satz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.loginpage;
import pageobjects.qaclickhome;
import resources.base;



public class test extends base {
	public static Logger log=LogManager.getLogger(test.class.getName());
	
	@Test(dataProvider="getdata")
	public  void pagenavigation(String username,String password) throws IOException {
	
		driver=invoke();
		log.info("Driver got invoked");
		driver.get(prop.getProperty("url"));
		log.info("URL launched");
		qaclickhome qa=new qaclickhome(driver);
		qa.signin().click();
		loginpage lg=new loginpage(driver);
		lg.emailid().sendKeys(username);
		lg.password().sendKeys(password);
	
		lg.login().click();
		log.info("validated a data");
		driver.close();
		
	
		
		}
	
	@AfterTest
	public void closing()
	{
		
		driver=null;
	}
	
	
	
	
	
	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[2][2];
		data[0][0]="kjbhkhjb@khkhbg.com";
		data[0][1]="234";
		data[1][0]="dc@khkhbg.com";
		data[1][1]="22";
		
		return data;
	}
	

}
