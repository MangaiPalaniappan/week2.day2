package week2.day2.assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithImages {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.findElement(By.xpath("//label[ text()='Click on this image to go home page']/following-sibling::img")).click();
		driver.findElement(By.xpath("//h5[text() ='Image']")).click();
	WebElement Images	= driver.findElement(By.xpath("//label[text() ='Am I Broken Image?']/following-sibling::img"));
	String srcimage=	Images.getAttribute("src");
	URL url = new URL(srcimage);
	URLConnection openConnection = url.openConnection();
	HttpURLConnection httpurlconnection = (HttpURLConnection) openConnection;
	httpurlconnection.connect();
	if(httpurlconnection.getResponseCode()==200){
		System.out.println("Broken image" +srcimage);
	}
else{
	System.out.println("Broken image" +srcimage);
}
	
	driver.findElement(By.xpath("//label[ text()='Click me using Keyboard or Mouse']/following-sibling::img")).click();
	}

}
