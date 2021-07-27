package cart;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_case_001 {
//is shopping bag displayed
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\deepak\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www2.hm.com/en_in/index.html");
		boolean check=driver.findElement(By.xpath("//a[@class='menu__bag goto-shopping-bag rollover-toggle']")).isDisplayed();
		if(check==true)
		{
			System.out.println("Shopping bag is Displayed");
		}
		else
		{
			System.out.println("Shopping bag is not Displayed");
		}
	}

}