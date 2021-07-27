package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_case_002 {

	public static void main(String[] args) throws InterruptedException {
		// test case to check is Shopping bag is opening or not
			System.setProperty("webdriver.gecko.driver","C:\\Users\\deepak\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("https://www2.hm.com/en_in/index.html");
			driver.findElement(By.xpath("//a[@class='menu__bag goto-shopping-bag rollover-toggle']")).click();
			boolean check=driver.findElement(By.xpath("//a[normalize-space()='Shopping bag']")).isDisplayed();
			Thread.sleep(2000);
			if(check==true)
			{
				System.out.println("Shopping bag page is Displayed");
			}
			else
			{
				System.out.println("Shopping bag page is not Displayed");
			}



	}

}