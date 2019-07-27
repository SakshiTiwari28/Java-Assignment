package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\TRG\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.gmail.com");
CommonAction.ElementAction(driver,"username","textbox")
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kavitabmangesh@gmail.com");
//driver.findElement(By.xpath("//input[@class='RveJvd snByac']")).click();
WebDriverWait wait=new WebDriverWait(driver, 20); 
driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}

}
