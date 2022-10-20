package scrollbar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.infosys.com/careers/exclusive-programs/restart-careers-infosys.html");
		WebElement el=driver.findElement(By.xpath("//img[@alt='Nitika Yadav'][1]"));
		Point l=el.getLocation();
		int x=l.getX();
		int y=l.getY();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(" + x + "," + y + ")");
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();",el);
		
		
		
	}

}
