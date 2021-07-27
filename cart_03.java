package HandMCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart_03 {
	@Test
	void LoginFunctionality() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.hm.com/en_in/customer-service/shopping-at-hm/online-shopping.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='menu__super-link']//span[contains(text(),'Baby')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//ul[@aria-expanded='true']//a[@class='menu__sub-link'][normalize-space()='Baby Exclusive']")).click();
		Thread.sleep(2000);


}
}
