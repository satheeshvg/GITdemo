package satz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.qaclickhome;
import resources.base;

public class textvalidation extends base {
	public static Logger log=LogManager.getLogger(navigationbar.class.getName());
	
	@Test
	public  void checktitle() throws IOException {
		// TODO Auto-generated method stub
		
	
		qaclickhome qa=new qaclickhome(driver);
		Assert.assertTrue(qa.hometext().getText().equalsIgnoreCase("FEATURED COURSES"));
		log.info("Validated title");
		System.out.println("one");
		System.out.println("two");


				
		}
	@AfterTest
	public void closing()
	{
		driver.close();
		driver=null;
		System.out.println("two");
	}
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=invoke();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	

}
