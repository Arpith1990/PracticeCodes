import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();// Using Chrome driver
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//  Wait for browser launch
		driver.get("https://www.flipkart.com/");// hitting the URL
		// Login
		driver.findElement(By.linkText("Login & Signup")).click();
		driver.findElement(By.className("_2zrpKA")).sendKeys("username");
		driver.findElement(By.className("_2zrpKA _3v41xv")).sendKeys("password");
		driver.findElement(By.className("_2AkmmA _1LctnI _7UHT_c")).submit();
		//Search
		 driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys("redmi");
		  driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys(Keys.ENTER);
		  
		 // Select
		  driver.findElement(By.id("_2yccxO D0YrLF"));
		  driver.getTitle();
		
		  
		  
		  
		  

		
	}

}
