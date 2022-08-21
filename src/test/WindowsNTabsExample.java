package test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsNTabsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		String Parentwin =driver.getWindowHandle();
		System.out.println("The window before clicking the tab is " + Parentwin);
				
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click();
		
		System.out.println("The window after clicking the tab is ");
	    Set<String> Allwins=driver.getWindowHandles();
	     
	   for(String win : Allwins) {
		   System.out.println(win);
		   
		   if(!win.equals(Parentwin)) {
			   driver.switchTo().window(win);
			   
		   }
	   }
		
	   WebElement childHeader = driver.findElement(By.id("sampleHeading"));
       System.out.println(childHeader.getText());
       
       driver.switchTo().window(Parentwin);
       WebElement WinBtn = driver.findElement(By.id("windowButton"));
             WinBtn.click();
       
      driver.quit();
       
//       driver.switchTo().window(Parentwin);
//       WebElement MsgWinBtn = driver.findElement(By.id("messageWindowButton"));
//            MsgWinBtn.click();
//              System.out.println(MsgWinBtn.getText());
	}

}
