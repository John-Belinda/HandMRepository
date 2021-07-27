package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_003 {

	
WebDriver driver;
	
	TC_NewUser_003()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
	void validate_item_fav()
	{
		driver.get("https://www2.hm.com/en_in/index.html");
		driver.findElement(By.xpath("//a[normalize-space()='Favourites']")).click();
		//driver.findElement(By.xpath("//span[normalize-space()='Favourites']")).click();
		/*if(driver.findElement(By.cssSelector("//a[normalize-space()='Favourites']")).isDisplayed())
		{
			System.out.println("items can be added to favourite");
		}
		else
		{
			System.out.println(" items canot be added to favourite");
		}*/
	} 


	public static void main(String[] args) {
		TC_NewUser_003 TC_nu_003 = new TC_NewUser_003();
		TC_nu_003.validate_item_fav();

	}

}
