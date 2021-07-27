package HandMCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart_02 {
	@Test
	void LoginFunctionality() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.hm.com/en_in/customer-service/shopping-at-hm/online-shopping.html");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[@class='menu__super-link']//span[contains(text(),'Kids')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//main[@id='main-content']//li[2]//ul[1]//li[6]//a[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[1]//article[1]//div[2]//h3[1]//a[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'picker-trigger js-picker-trigger small')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[normalize-space()='9']")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//button[contains(@class,'item button fluid button-big button-buy')]")).click();//add cart button is not working
		Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//span[@class='shoppingbag-item-count']")).click();
		Thread.sleep(2000);
	}
}
