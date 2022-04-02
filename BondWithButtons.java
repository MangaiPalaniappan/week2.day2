package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.findElement(By.xpath("//h5[text() = 'Button']")).click();
	WebElement getpos =	driver.findElement(By.id("position"));
Point namexy=	getpos.getLocation();
int height = namexy.getX();
int width = namexy.getY();
System.out.println("the position of the buttons height -"+height + "width -" +width);

WebElement color =driver.findElement(By.id("color"));
String whatcolor =color.getCssValue("background-color");
System.out.println(whatcolor);
WebElement findsize=driver.findElement(By.id("size"));
int height1 =findsize.getSize().getHeight();
int width2 = findsize.getSize().getWidth();
System.out.println("the position of the buttons height -"+height1+  " width -" +width2);


	}

}
