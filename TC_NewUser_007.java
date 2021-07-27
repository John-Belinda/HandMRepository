package HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_007 {
	
	
		WebDriver driver;

		TC_NewUser_007()
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		void validate_storeloc()
		{
			driver.get("https://www2.hm.com/en_in/cart");
			driver.findElement(By.xpath("//a[@class='menu__sub-link'][normalize-space()='Find a store']")).click();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			if(driver.findElement(By.xpath("//a[@class='menu__sub-link'][normalize-space()='Find a store']")).isDisplayed())
			{
				System.out.println("store locator can locate the store ");
			}
			else
			{
				System.out.println("store locator cannot locate the store");
			}
		} //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC_NewUser_007 TC_nu_007 = new TC_NewUser_007();
		TC_nu_007.validate_storeloc();
		//driver.close();
	}

}
