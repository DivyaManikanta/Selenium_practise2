package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G1 {
	public static void main(String[] args) {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.findElement(By.xpath("//span[text()='Downloads']")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("javascript:window.scrollBy(0,350)");

	driver.findElement(By.xpath("//p[text()='Ruby']/../p[4]")).click();
	
	//p[text()='Ruby']/../p[4]
	}

}
