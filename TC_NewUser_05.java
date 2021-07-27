package signin_becomeamember;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_NewUser_05 {
	WebDriver driver;
	
	TC_NewUser_05(){
		System.setProperty("webdriver.chrome.driver",  "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("https://www2.hm.com/en_in/index.html");
	}
	void enteremailid_5() {
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
		Email_Box.sendKeys(""); 
		
		
		WebElement Pw_Box = driver.findElement(By.id("modal-signin-password"));
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
	     
	     WebElement enteremail = driver.findElement(By.id("modal-signin-email-required-error"));
	     String enteremailMessage = enteremail.getText();
	     System.out.print(enteremailMessage);
	     
	}
	public static void main(String args[]) {
		TC_NewUser_05  enteremailid = new TC_NewUser_05 ();
		enteremailid.enteremailid_5();
		}
	}


