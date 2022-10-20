package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
		WebElement ele  =driver.findElement(By.xpath("//label[text()='Female']"));
		if(ele.isSelected()) {
			System.out.println("pass ele is displayed");

}
		else {
		System.out.println("fail ele is not selected");
		ele.click();
		
	}}
}
