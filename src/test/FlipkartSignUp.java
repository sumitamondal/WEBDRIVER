package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
        WebElement CreateAc = driver.findElement(By.xpath("//a[@class='_14Me7y']"));
		
		CreateAc.click();
		
		
		WebElement Continue = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		WebElement ExistingUser = driver.findElement(By.xpath("//a[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
				
		String Login = "Existing User";
		
	    
	    if(Login.equals("Continue")) {
	    	
	    	WebElement MobileNo = driver.findElement(By.xpath("//input[@maxlength='10']"));
			MobileNo.sendKeys("1234567890");
	    	Continue.click();
	    	
	    }else {
	    	ExistingUser.click();
	    	
	    	String LoginOpt = "Login";
		    WebElement RequestOTP = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
	    	
		    if(LoginOpt.equals("Login")) {
		    	
				   
	    	WebElement EmailId = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			
			WebElement Password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
			
			WebElement LoginButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		    EmailId.sendKeys("abc@xyz.com");
		    Password.sendKeys("abc@123");
		    LoginButton.click();
		    
		    }else {
		    	
		    	RequestOTP.click();
		    }
		    
		    	    	
			
		}
		
		
	}

}
