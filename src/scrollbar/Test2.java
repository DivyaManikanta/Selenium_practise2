package scrollbar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/postman/postman_authorization.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,6000)");
		
	js.executeScript("window.scrollBy(0,-6600)");
		
	}

}
