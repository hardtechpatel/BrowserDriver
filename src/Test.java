import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test
{
    protected static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver" , "src\\Drivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
        //open the website
        driver.get("http://demo.nopcommerce.com/");
        //click on register button
        driver.findElement(By.xpath("//a[@class = 'ico-register']")).click();
        //enter firstname
        driver.findElement(By.id("FirstName")).sendKeys("Venus");
        //enter lastname
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("patel");
        //enter email
        driver.findElement(By.name("Email")).sendKeys("testtest1@test.com");
        //enter password
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abcd1234");
        //enter confirm password
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("abcd1234");
        //click on register button
        driver.findElement(By.xpath("//input[@id='register-button']")).click();
        //driver.findElement(By.xpath("//input[@aria-label='Search store' and @placeholder =  'Search store']")).sendKeys("Apple");
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        //driver.close();
    }
}