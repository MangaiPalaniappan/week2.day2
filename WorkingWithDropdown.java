package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
	WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
    Select select1 = new Select(dropdown1);
    select1.selectByIndex(1);
    WebElement dropdown2	=driver.findElement(By.name("dropdown2"));
    Select select2 = new Select(dropdown2);
    select2.selectByVisibleText("Selenium");
    WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
    Select select3 = new Select(dropdown3);
    select3.selectByValue("1");
    
  WebElement dropdown4	=driver.findElement(By.className("dropdown"));
   Select select4 = new Select(dropdown4);
 List<WebElement> Options = select4.getOptions();
int NoOfOptions =  Options.size();
   System.out.println(NoOfOptions);
   
   driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/parent::select")).sendKeys("Selenium");
   
  WebElement dropdown5=driver.findElement(By.xpath("//option[text()='Select your programs']/parent::select"));
   Select select5 = new Select(dropdown5);
   select5.selectByVisibleText("Selenium");

	}

}
