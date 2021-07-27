package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_existinguser_1 {
	
	
	WebDriver driver;
	
	TC_existinguser_1() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java Edu\\chromedriver.exe");
	}
	@Test
	
	// correct Credentials 
	
	void loginVerification() throws InterruptedException {
		
		driver = new ChromeDriver(); 
		driver.get("https://www2.hm.com/en_in/index.html");
		
		
		WebElement sigin_Button =driver.findElement(By.className("menu__myhm"));
		sigin_Button.click();
		
		//driver.findElement(By.id("modal-txt-signin-email")).clear();
		
		Thread.sleep(2000);
		WebElement Email_Box = driver.findElement(By.id("modal-txt-signin-email"));
		Email_Box.clear();
		Email_Box.sendKeys("gokulakannanm98@gmail.com"); 
		
		WebElement Pw_Box = driver.findElement(By.id("modal-txt-signin-password"));
		Pw_Box.sendKeys("Since@123"); 
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
		button.click();
		
				
		Thread.sleep(2000);
		WebElement myAccount=driver.findElement(By.xpath("(//a[@data-signin-state='signedin'])[1]"));
		Actions action=new  Actions(driver);
		action.moveToElement(myAccount).build().perform();
		System.out.println("Success");
		WebElement Signout = driver.findElement(By.xpath("//a[text()='Sign out']"));
		Signout.click();
		
		
		driver.close();
		
		
	}


}





