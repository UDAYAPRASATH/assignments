package testForAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseDelete {

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
			
			WebElement dlt=driver.findElement(By.xpath("//a[@title='Delete']/div"));
			driver.executeScript("arguments[0].click();",dlt);
			
			driver.findElement(By.xpath("//button[@title='Delete']")).click();
			Thread.sleep(2000);
			//WebElement data=driver.findElement(By.xpath("//span[@role='status']"));
			
			
			WebElement Opportunity = driver.findElement(By.xpath("//a[text()='Salesforce Automation by Udayaprasath']"));
	        String verification = Opportunity.getText();
			if(verification.equals("Salesforce Automation by Udayaprasath")) {
				System.out.println("Opportunity is Found");
			}
			else {
				System.out.println("Opportunity is deleted");
			}
	}

}
