package dropdown;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindingDemoLead {

	
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.findElement(By.id("username")).sendKeys("Democsr");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).click();
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
				driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("1");
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543211");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				String leadId = element.getText();
				Thread.sleep(1000);
				element.click();
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();		
				Thread.sleep(1000);
				WebElement e=driver.findElement(By.xpath("//div[text()='No records to display']"));
				String verify=e.getText();
				System.out.println(verify);
				
				if(verify.equals("No records to display"))
				{
					System.out.println("Lead is Deleted");
				}
				else
				{
					System.out.println("Lead is not deleted");
				}
			}
		}

