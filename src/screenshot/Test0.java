package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
    	//typcasting
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	 
    	 //access
    	 File ram=ts.getScreenshotAs(OutputType.FILE);
    	 
    	 //S3 specification
    	 File dest=new File("./photo/p1.png");
    	 
    	 //copy
    	 FileUtils.copyFile(ram,dest);
    	 
    	 driver.close();
		
	}

}
