package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/o");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele=driver.findElement(By.id("email"));
		Dimension s= ele.getSize();
		int h=s.getHeight();
		System.out.println("height is"+h);
		int w=s.getWidth();
		System.out.println("width is"+w);
		
		driver.close();
		
		
		
	}

}
