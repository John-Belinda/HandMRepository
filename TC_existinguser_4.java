package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_existinguser_4 {
	
	WebDriver driver;
	
	TC_existinguser_4() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java Edu\\chromedriver.exe");
	}
	@Test
	
	//Validating without entering User Name
	
	
	void loginVerification() throws InterruptedException {
		
		driver = new ChromeDriver(); 
		driver.get("https://www2.hm.com/en_in/index.html");
		
		
		WebElement sigin_Button =driver.findElement(By.className("menu__myhm"));
		sigin_Button.click();
		
		//driver.findElement(By.id("modal-txt-signin-email")).clear();
		
		Thread.sleep(2000);
		WebElement Email_Box = driver.findElement(By.id("modal-txt-signin-email"));
		Email_Box.clear();
		Email_Box.sendKeys(""); 
		
		WebElement Pw_Box = driver.findElement(By.id("modal-txt-signin-password"));
		Pw_Box.sendKeys("Since@12"); 
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
		button.click();
		
		
		Thread.sleep(2000);
		WebElement emptyUserName = driver.findElement(By.id("modal-txt-signin-email-required-error"));
		String emptyUderNameErrorMessage= emptyUserName.getText();
		System.out.println(emptyUderNameErrorMessage);
		
		
		
		String expectedErrorMessage = "Enter email address";
		Assert.assertEquals(expectedErrorMessage, emptyUderNameErrorMessage);
		Thread.sleep(2000);

		
		driver.close();
		
		
	}

	

}





