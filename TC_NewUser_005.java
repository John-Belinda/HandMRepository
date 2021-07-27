package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_005 {
	WebDriver driver;

	TC_NewUser_005()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	void validate_custorev()
	{
		driver.get("https://www2.hm.com/en_in/cart");
		driver.findElement(By.xpath("//a[@class='menu__sub-link'][normalize-space()='Customer Service']")).click();
		
		if(driver.findElement(By.xpath("//a[@class='menu__sub-link'][normalize-space()='Customer Service']")).isDisplayed())
		{
			System.out.println("customer service option is responsive");
		}
		else
		{
			System.out.println("customer service option is not responsive");
		}
	} 

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC_NewUser_005 TC_nu_005 = new TC_NewUser_005();
		TC_nu_005.validate_custorev();
		}

}
