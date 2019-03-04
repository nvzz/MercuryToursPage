package myPackge1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Academy QE/Downloads/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Norma");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Vazquez");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8781233364");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("nvzz@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Mi casa");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Piedras Negras");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("96");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("NormaVzz05");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		if(driver.findElement(By.xpath("//*[contains(text(),'Dear Norma Vazquez')]")).isDisplayed()) {
			System.out.println("Element is displayed");
		} else {
			System.out.println("Element is not displayed");
		}
		
	}

}
