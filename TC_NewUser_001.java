package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_001 {
	WebDriver driver;
	
	TC_NewUser_001()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	
	void validate_home_page_logo()
	{
		driver.get("https://www2.hm.com/en_in/index.html");
		driver.findElement(By.xpath("//a[@class='menu__hm']")).click();
		if(driver.findElement(By.cssSelector(".menu__hm")).isDisplayed())
		{
			System.out.println("logo displayed successfull");
		}
		else
		{
			System.out.println("login displayed unsuccessfull");
		}
	}

	public static void main(String[] args) {
		
         
		TC_NewUser_001 TC_nu_001 = new TC_NewUser_001();
		TC_nu_001.validate_home_page_logo();
		
		
		
	}

}
