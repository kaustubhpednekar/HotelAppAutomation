package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHotelApp {
	WebDriver driver;

	@Before
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\kaustubh\\drivers\\chromedrive\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();		
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	@Test
	public void test() 
	{
		WebElement uname = driver.findElement(By.id("username"));
		uname.clear();
		uname.sendKeys("vasuvespag");
		driver.findElement(By.id("password")).sendKeys("vasu1234");
		
		driver.findElement(By.className("login_button")).click();
	}

}
