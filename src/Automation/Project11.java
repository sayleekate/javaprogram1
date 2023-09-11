package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kate\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("admin")).sendKeys("admin123");
		WebElement userName=driver.findElement(By.xpath("//div/input[@name='txtUsername']"));
		userName.sendKeys("Admin");
		WebElement pass = driver.findElement(By.xpath("//div/input[@name='txtPassword']"));
		pass.sendKeys("admin123");
		WebElement login = driver.findElement(By.xpath("//div/input[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("saylee");
		driver.findElement(By.name("MiddleName")).sendKeys("N");
		driver.findElement(By.name("LastName")).sendKeys("kate");
		driver.findElement(By.xpath("//a[@href=/web/index.php/Myinfo/viewMyDetails"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div"));
		driver.findElement(By.name("firstName")).sendKeys("saylee");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]"));
		driver.findElement(By.name("firstName")).sendKeys("xyz1");
		driver.findElement(By.xpath("//*[@id=app]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[3]"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[4]/div[1]"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[5]/div[1]"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[6]/div[1]"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[7]"));
	}
}
