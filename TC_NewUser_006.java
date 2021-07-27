package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_NewUser_006 {
	WebDriver driver;

	TC_NewUser_006()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	void validate_newslttr()
	{
		driver.get("https://www2.hm.com/en_in/cart");
		driver.findElement(By.xpath("//a[normalize-space()='Newsletter']")).click();
		
		if(driver.findElement(By.xpath("//a[normalize-space()='Newsletter']")).isDisplayed())
		{
			System.out.println("news letters option working fine  ");
		}
		else
		{
			System.out.println("news letters option is not working fine  ");
		}
	} 

	public static void main(String[] args) {
		TC_NewUser_006 TC_nu_006 = new TC_NewUser_006();
		TC_nu_006.validate_newslttr();

	

}
}
