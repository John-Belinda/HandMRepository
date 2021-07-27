package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_case_003{
	
	WebDriver driver;
	
	
	Test_case_003()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	
	
	
	}
	
	
	
	void validate_Username() throws InterruptedException
	{
	
		
		driver.get("https://www2.hm.com/en_in/index.html");//open url
		driver.findElement(By.xpath("//a[@class='menu__super-link']//span[contains(text(),'Kids')]")).click();//select catogory
		driver.findElement(By.xpath("//li[2]//ul[1]//li[1]//a[1]")).click();//sub-catagory
		Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='3-piece printed jersey set']")).click();//select product
        System.out.println("1");
       // driver.findElement(By.xpath("//span[@class='value']")).click();//click on size
        
	WebElement ele = driver.findElement(By.xpath("//button[contains(@class,'picker-trigger js-picker-trigger small')]"));
		
		Actions act = new Actions(driver);
		act.click(ele).perform();
        driver.findElement(By.xpath("//span[normalize-space()='6-7Y']")).click();//select size
        
        driver.findElement(By.cssSelector(".icon.icon-shopping-bag-white")).click();
        
	/*	boolean check=driver.findElement(By.xpath("//a[normalize-space()='Shopping bag']")).isDisplayed();
		Thread.sleep(2000);
		if(check==true)
		{
			System.out.println("Shopping bag page is Displayed");
		}
		else
		{
			System.out.println("Shopping bag page is not Displayed");
		}*/
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		try {
		Test_case_003  TC_e_03= new Test_case_003();
		TC_e_03.validate_Username();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}