package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver = new ChromeDriver();
     driver.get("https://en-gb.facebook.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
     driver.findElement(By.xpath("//div[@class ='_5dbb']/input")).sendKeys("XXX");
     driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("YYY");
     driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("123456789");
     driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("myself@345");
     
     WebElement webelem1 =   driver.findElement(By.xpath("//*[@id='day']"));
     Select day = new Select(webelem1);
     day.selectByVisibleText("25");
     
    WebElement webelem2 = driver.findElement(By.xpath("//*[@id='month']"));
    Select month = new Select(webelem2);
    month.selectByValue("5");
    WebElement webelem3 = driver.findElement(By.xpath("//*[@id='year']"));
    Select year = new Select(webelem3);
    year.selectByVisibleText("1993");
    
    driver.findElement(By.xpath("//label[@class ='_58mt']")).click();
     
	}

}
