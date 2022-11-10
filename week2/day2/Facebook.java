package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Guru");
		driver.findElement(By.name("lastname")).sendKeys("Prasath");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("guru@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation')]")).sendKeys("guru@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd')]")).sendKeys("password");
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select b_date = new Select(Day);
		b_date.selectByValue("19");
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select b_month = new Select(Month);
		b_month.selectByValue("5");
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select b_year = new Select(Year);
		b_year.selectByValue("1997");
		driver.findElement(By.xpath("//input[@value='2']")).click();

	}

}
