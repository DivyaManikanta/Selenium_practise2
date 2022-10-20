package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0 {
	public static void main(String []args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement block1 = driver.findElement(By.id("box3"));
		WebElement block2 = driver.findElement(By.id("box106"));
		
		Thread.sleep(6000);
		Actions a=new Actions(driver);
		a.dragAndDrop(block1, block2).perform();
		
	}

}
