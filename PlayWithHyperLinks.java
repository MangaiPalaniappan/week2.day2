package week2.day2.assignments;


import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithHyperLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//h5[text() ='HyperLink']")).click();
		 WebElement link1 =driver.findElement(By.partialLinkText("Find where am supposed "));
	String linkname  =	 link1.getAttribute("href");
	System.out.println(linkname);
	
 WebElement links= driver.findElement(By.linkText("Verify am I broken?"));
 String linkurl=links.getAttribute("href");

	
	URL url =new URL(linkurl);
	URLConnection openConnection = url.openConnection();
	HttpURLConnection httpurlconnection = (HttpURLConnection) openConnection;
	httpurlconnection.connect();
	if(httpurlconnection.getResponseCode()==200) {
		System.out.println(linkurl);
		
	}
	else {
		System.out.println("Broken link is"+ linkurl);
	}
	
	httpurlconnection.disconnect();
 List<WebElement> ToFindNOofLinks= driver.findElements(By.tagName("a"));
	System.out.println(ToFindNOofLinks.size());
	}
	
	

}
