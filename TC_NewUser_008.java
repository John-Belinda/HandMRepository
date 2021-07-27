package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_008 {
	WebDriver driver;

	TC_NewUser_008()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	void validate_shoppingbag()
	{
		driver.get("https://www2.hm.com/en_in/cart");
		driver.findElement(By.xpath("//span[@class='shoppingbag-item-count']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(driver.findElement(By.xpath("//span[@class='shoppingbag-item-count']")).isDisplayed())
		{
			System.out.println("abc ");
		}
		else
		{
			System.out.println("sdef");
		}
	} //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC_NewUser_008 TC_nu_008 = new TC_NewUser_008();
		TC_nu_008.validate_shoppingbag();
		
	}

}
