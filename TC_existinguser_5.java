package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_existinguser_5 {
	
	WebDriver driver;
	
	TC_existinguser_5() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Java Edu\\chromedriver.exe");
	}
	
	@Test
	
	//tested with out entering  password
	
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
		Pw_Box.sendKeys(""); 
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
		button.click();
		Thread.sleep(2000);
		
		
		WebElement emptyPW = driver.findElement(By.id("modal-txt-signin-password-required-error"));
		String emptyPWErrorMessage= emptyPW.getText();
		System.out.println(emptyPWErrorMessage);
		
		
		String expectedErrorMessage = "Please enter a password.";
		Assert.assertEquals(expectedErrorMessage, emptyPWErrorMessage);
		
	
		driver.quit();
		
		
		
	}

	

}





