package signin_becomeamember;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_NewUser_02 {

	WebDriver driver;
	
	@BeforeMethod
	
	void check() {
		
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www2.hm.com/en_in/index.html");
	
	}
	
	
	@Test
	void alreadyexistuser_2()  {
	
                 
		//sign in button and become a member
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 WebElement si1 = driver.findElement(By.xpath("//div[@class=\"account parbase\"]"));
		 WebElement si2 = driver.findElement(By.xpath("//button[@class=\"button large\"]"));
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(si1).moveToElement(si2).click().perform();
		 
		 WebElement  bm = driver.findElement(By.xpath("//button[@class=\"button large secondary\"]"));
		bm.click();
		
		WebElement Email_Box = driver.findElement(By.id("modal-signin-email"));
		Email_Box.clear();
		Email_Box.sendKeys("johnbelindaanna@gmail.com"); 
		
		WebElement Pw_Box = driver.findElement(By.id("modal-signin-password"));
		//Pw_Box.click();
		Pw_Box.clear();
		Pw_Box.sendKeys("Belinda@333");
		

		driver.findElement(By.xpath("//div[@class=\"input-info js-validtips\"]")).click();
		
	
		driver.findElement(By.xpath("//input[@id=\"modal-signin-day\"]")).sendKeys("03");
		
		driver.findElement(By.xpath("//input[@id=\"modal-signin-month\"]")).sendKeys("09");
		
		driver.findElement(By.xpath("//input[@id=\"modal-signin-year\"]")).sendKeys("1996");
		
		
		 WebElement Tick_Box = driver.findElement(By.id("modal-create-account-fashion-news"));
         Tick_Box.click();
         
         WebElement Become_Member = driver.findElement(By.xpath("//button[@class=\"button large js-submit-join\"]"));
         Become_Member.click();
         
         
        // driver.findElement(By.id("modal-signin-email")).isDisplayed();
         
 		//String emailRedMessage= emailRed.getText();
 		//System.out.println(emailErrorMessage);
 		
 		  WebElement emailError = driver.findElement(By.xpath("//span[@class=\"validation-icon icon icon-invalid\"]"));
 	 		String emailErrorMessage= emailError.getText();
 	 		System.out.println("Already existing user");
 	 		
	}
 	 		
 	 		@AfterMethod
 	 		void tearDown() {
 	 		driver.close();
 	 		//driver.quit();
 	 		}
	
	/*}

	public static void main(String[] args) throws InterruptedException {
		
		TC_NewUser_02 signup2 = new TC_NewUser_02();
				
				signup2.alreadyexistuser_2();

			}

		*/
}
