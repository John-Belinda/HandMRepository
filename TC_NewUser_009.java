package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
  
public class TC_NewUser_009 {
	
WebDriver driver;
	
	TC_NewUser_009()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	void validate_member_ship()
	{
		driver.get("https://www2.hm.com/en_in/index.html");
		driver.findElement(By.xpath("//a[normalize-space()='Plus members get free shipping']")).click();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC_NewUser_009 TC_nu_009 = new TC_NewUser_009();
		TC_nu_009.validate_member_ship();
		
	}

}
