package automationLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAutomation {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().window().maximize();
	    driver.get("https://www.leafground.com/checkbox.xhtml");
	    
	    driver.findElement(By.xpath(" //div[@class='grid formgrid']//div[2]")).click();
	    driver.findElement(By.xpath(" (//div[@class='grid formgrid'])[2]//div[2]")).click();
	    
	    driver.findElement(By.xpath("(//div[@class='grid formgrid'])[3]//div[2]")).click();
	   driver.findElement(By.xpath("((//div[@class='grid formgrid'])[3]//div[2])[2]")).click();
	   
	   driver.findElement(By.xpath("(//div[@class='grid formgrid'])[4]//div[2]")).click();
	   
	   driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	   driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
	   WebElement element = driver.findElement(By.xpath("//input[@aria-label='Filter Input']"));
	  
	    element.sendKeys("paris");
	    
	    driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
	    driver.findElement(By.xpath("//a[@aria-label='Close']")).click();
        
	    
	}
 
}
