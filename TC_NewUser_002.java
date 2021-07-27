package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_002 {
	WebDriver driver;
	
	TC_NewUser_002()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	void validate_search()
	{
		driver.get("https://www2.hm.com/en_in/index.html");
		driver.findElement(By.xpath("//button[@class='menu__search_submit']")).click();
		driver.findElement(By.xpath("//input[@id='main-search']")).click();
		if(driver.findElement(By.cssSelector("button[class='menu__search_submit']")).isDisplayed())
		{
			System.out.println("search button is working fine");
		}
		else
		{
			System.out.println("search button is working fine");
		}
	} 


	public static void main(String[] args) {
		TC_NewUser_002 TC_nu_002 = new TC_NewUser_002();
		TC_nu_002.validate_search();
		
		

	} 

}
