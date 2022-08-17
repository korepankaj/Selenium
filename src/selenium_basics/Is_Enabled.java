package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled 
{
    public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Velocity Technologies pvt ltd\\Automation Testing\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(10000);
		
		//driver.findElement(By.id("#signIn")).click();
		
        driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
        
        Thread.sleep(5000);
        
       WebElement otp = driver.findElement(By.xpath("//button[text()='Get OTP']"));
       
       boolean button = otp.isEnabled();
       System.out.println("OTP button enabled is "+button);   //false
       
       //System.out.println("Please enter valid mobile no then click on otp button");
       //driver.findElement(By.id("mobileNumber")).sendKeys("9763807421");
       
       //boolean button1 = otp.isEnabled();
       //System.out.println("OTP button enabled is  "+button1);   //true
       
       //otp.click();
       
       WebElement mobilenofield = driver.findElement(By.id("mobileNumber"));
       
       if(button)
       {
    	  otp.click();
    	  System.out.println("Clicked on otp button");
       }
       else
       {
    	   System.out.println("Please enter valid mobile no and then click on OTP button");
    	   mobilenofield.sendKeys("9763807421");
    	   //System.out.println("OTP button enabled is "+button1);
    	   
    	   System.out.println("OTP button enabled is "+otp.isEnabled());
    	 
       }
       
       otp.click();
       System.out.println("clicked on OTP button successful");
	}

}
