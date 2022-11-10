package week2.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();  //set up Path
		ChromeDriver driver = new ChromeDriver(); //Create Obj
		driver.manage().window().maximize(); // Max window
		driver.get("http://leaftaps.com/opentaps/control/login"); // Url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("V");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Guru");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Prasath");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("guru@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());		
		
		
		
		
		

	}

}
