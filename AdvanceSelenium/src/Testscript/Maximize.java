package Testscript;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Maximize {
	@Test
	public void test() throws AWTException, InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./selenium/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
	Dimension d = new Dimension(200,300);
	driver.manage().window().setSize(d);
	
	
	
		
		

		
		
	}

	
	
	
	
}
