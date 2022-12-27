package Scenario1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
				
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Purple, 128 GB)']")).click();
		Set<String> id = driver.getWindowHandles();
		for(String all:id)
		{
			driver.switchTo().window(all);
		}
		WebElement ele = driver.findElement(By.xpath("//span[.='APPLE iPhone 14 (Purple, 128 GB)']/../../../div[4]/div[1]/div[1]/div[1]"));
		
				String aprice = ele.getText();
				System.out.println(aprice);
				String aprice1 = aprice.replaceAll(",","");
				String aprice2 = aprice1.replaceAll("₹","");
				
				int afinalprice = Integer.parseInt(aprice2);
				
		System.out.println(afinalprice);
		
		
	}

}
