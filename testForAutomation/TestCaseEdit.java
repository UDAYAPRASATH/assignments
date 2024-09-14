package testForAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestCaseEdit {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vinothkumar@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SeleniumChallenge@24");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		    driver.findElement(By.xpath("//div[@class='slds-r5']")).click();
			driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			WebElement element =driver.findElement(By.xpath("//span[text()='Opportunities']"));
			driver.executeScript("arguments[0].click();",element);
			
			driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("Salesforce Automation by Udayaprasath");
			Thread.sleep(5000);
			WebElement down=driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']//a[@role='button']"));
			driver.executeScript("arguments[0].click();",down);
			Thread.sleep(1000);
			
			WebElement edit=driver.findElement(By.xpath("//a[@title='Edit']/div"));
			driver.executeScript("arguments[0].click();",edit);
			WebElement date=driver.findElement(By.xpath("//input[@name='CloseDate']"));
			date.clear();
			date.sendKeys("15/09/2024");
			driver.findElement(By.xpath("//button[@aria-label='Stage']")).click();
			driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();
			WebElement Progress=driver.findElement(By.xpath("//button[@aria-label='Delivery/Installation Status']"));
			driver.executeScript("arguments[0].click();",Progress);
			driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='In progress']")).click();
			WebElement b=driver.findElement(By.xpath("//textarea[@part='textarea']"));
			b.clear();
			b.sendKeys("SalesForce");
			driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
			 
		   WebElement a=driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
		   
		   String verify=a.getText();
		   
		  if(verify.contains("Perception Analysis"))
		  {
			  System.out.println("Stage is verified");
		  }
		  else
		  {
			  System.out.println("Stage is not verified");
		  }

	}

}
