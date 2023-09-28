package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        WebDriver driver=new EdgeDriver();
        	driver.get("https://demo.guru99.com/test/newtours/register.php");
        	driver.findElement(By.name("firstName")).sendKeys("komal");
        	driver.findElement(By.name("lastName")).sendKeys("saykar");
        	driver.findElement(By.name("phone")).sendKeys("344544");
        	driver.findElement(By.name("userName")).sendKeys("komal@gmail.com");
        	
        	
        
        
    }
}
