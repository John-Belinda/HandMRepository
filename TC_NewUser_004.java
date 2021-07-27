package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_004 {
	
	WebDriver driver;

	TC_NewUser_004()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	void validate_signin()
	{
		driver.get("https://www2.hm.com/en_in/index.html");
		driver.findElement(By.xpath("//a[@class='menu__myhm'][normalize-space()='Sign in']")).click();
		if(driver.findElement(By.cssSelector(".menu__myhm[href='#']")).isDisplayed())
		{
			System.out.println("signin process is working fine");
		}
		else
		{
			System.out.println("sigin process is working fine");
		}
	}
	public static void main(String[] args) {
	
		TC_NewUser_004 TC_nu_004 = new TC_NewUser_004();
		TC_nu_004.validate_signin();
	}

}
