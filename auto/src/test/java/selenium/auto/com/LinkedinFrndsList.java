package selenium.auto.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class LinkedinFrndsList {
	
	WebDriver driver= new FirefoxDriver();
	
	@Test
	public void linkedinLogin(){	
		
		//maximise the window.
		driver.manage().window().maximize();
		
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//open the linkedin url
		driver.get("http://linkedin.com");
		
		//identify email edit box and type username
		driver.findElement(By.id("login-email")).sendKeys("rajeevkommana1990@gmail.com");
		
		//identify password editbox and tyep password.
		driver.findElement(By.id("login-password")).sendKeys("rajeevhere");
		
		//click on sign in button
		driver.findElement(By.id("login-submit")).click();
		
		//verify the login page
		new WebDriverWait(driver, 20).until(ExpectedConditions.titleContains("LinkedIn"));
		
		//click on my netwrok tab
		driver.findElement(By.id("mynetwork-tab-icon")).click();
		
		//click on connections link
		driver.findElement(By.xpath("//a[@data-control-name='connections']")).click();
		
		//get friendlist count.
		String s=driver.findElement(By.xpath("//ul[@class='mn-connections__list ember-view']/div/h2")).getText();
		
		System.out.println("no. of friends list connections is:"+s);
		
	}
  
}
