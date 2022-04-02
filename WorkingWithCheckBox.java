package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[@class='example']/input[1]")).click();
	    driver.findElement(By.xpath("//div[@class='example']/input[3]")).click();
	    driver.findElement(By.xpath("//div[@class='example']/input[4]")).click();

	    driver.findElement(By.xpath("//div[@class='example']/input[5]")).click();
	WebElement checkbox2 =  driver.findElement(By.xpath("//label[text() ='Confirm Selenium is checked']/following-sibling::input"));
Boolean checkbox2selected	= checkbox2.isSelected();
System.out.println(checkbox2selected);
WebElement checkbox3 =driver.findElement(By.xpath("//label[text() ='DeSelect only checked']/following-sibling::input[@type ='checkbox']"));
if(checkbox3.isSelected()) {
	checkbox3.click();
}
WebElement checkbox4 =driver.findElement(By.xpath("//label[text() ='DeSelect only checked']/following-sibling::input[2]"));
if(checkbox4.isSelected()) {
	checkbox4.click();
}

	    

List<WebElement> checkboxes =  driver.findElements(By.xpath("//label[text() ='Select all below checkboxes ']/following-sibling::input[@type ='checkbox']"));
	int size=checkboxes.size();
	System.out.println(size);
	for(int i=0;i<=size-1;i++) {
		
	checkboxes.get(i).click();
	    }
		

	}

}
