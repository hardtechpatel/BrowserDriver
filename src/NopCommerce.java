import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NopCommerce {

    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "src\\Drivers\\chromedriver.exe");
        //open the browser
        driver = new ChromeDriver();
        //maximise the browser window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
        //open the website
        driver.get("http://demo.nopcommerce.com/");
        //click on login button
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();
        //enter the email
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("testtest1@test.com");
        //enter password
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("abcd1234");
        //click on login on button
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        //click on macbook page
        driver.findElement(By.xpath("//h2//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        //click on enter friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //enter friend email
        driver.findElement(By.xpath("//input[@id='FriendEmail']")).sendKeys("kunlaraval73@gmail.com");
        //enter your email
        driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).click();
        //enter persnol massage
        driver.findElement(By.xpath("//textarea[@placeholder='Enter personal message (optional).']")).sendKeys("please check this out");
        //click on send email
        driver.findElement(By.xpath("//input[@value=\"Send email\"]")).click();

        //driver.close();

    }
}
