package HandMCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart_01 {
	@Test
	void LoginFunctionality() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www2.hm.com/en_in/customer-service/shopping-at-hm/online-shopping.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='menu__super-link']//span[contains(text(),'Women')]")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//strong[normalize-space()='New Arrivals']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role='menuitem'][normalize-space()='Clothes']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Printed sweatshorts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//body/main[@role='main']/div[@class='product parbase']/div[@class='layout pdp-wrapper product-detail sticky-footer-wrapper js-reviews']/div[@class='module product-description sticky-wrapper']/div[@class='sub-content product-detail-info product-detail-meta inner sticky-on-scroll semi-sticky']/div[@class='inner']/div[@class='product-item-buttons']/div[@class='product-button-wrapper']/div[@class='picker small-picker item loaded']/button[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[4]//div[1]//button[1]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("")).click();//add car button not working
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='shoppingbag-item-count']")).click();
		Thread.sleep(2000);
	}
}
