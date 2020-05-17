package resources;

 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	
	
	public static WebDriver driver=null;
	public Properties prop;
	
	public  WebDriver invoke() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("G:\\seleniumlearning\\endtoend\\src\\main\\java\\resources\\file.properties");
		prop.load(fis);
		if(System.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "G:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
		
		}
		else if(System.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			 System.out.println("firefox");
		}
		else
		{
			System.out.println("IE");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void screenshot(String result) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("G:\\seleniumlearning\\"+result+"error.png"));
	}
	
}

