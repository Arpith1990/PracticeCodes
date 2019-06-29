import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Search extends Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		 driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys("mobile");
		  driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys(Keys.ENTER);

	}

}
