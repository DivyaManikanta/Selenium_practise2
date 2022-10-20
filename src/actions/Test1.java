package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//WebElement b1=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement b2=driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement b3=driver.findElement(By.id("trash"));
		
		Thread.sleep(6000);
		Actions a= new Actions(driver);
		//a.dragAndDrop(b1, b3);
		a.dragAndDrop(b2, b3);
		
		
		
	}

}
