package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkWithEditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("mangaisree03@gmail.com");
		driver.findElement(By.xpath("//label[text() ='Append a text and press keyboard tab']/following-sibling::input")).sendKeys("Text");
         WebElement Text1=   driver.findElement(By.xpath("//input[@name ='username']"));
        System.out.println(Text1.getAttribute("value"));
        driver.findElement(By.xpath("//label[text() = 'Clear the text']/following-sibling::input")).clear();
      
       WebElement displayed= driver.findElement(By.xpath("//label[contains(text() ,' disabled')]/following-sibling::input"));
        boolean enabled = displayed.isEnabled();
        System.out.println(enabled);
         
		
	}

}
