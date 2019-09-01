import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {


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
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //enter the username
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        //enter password
        driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("admin123");
        //click on login
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //click on welcome admin button
        driver.findElement(By.xpath(" //a[@class='panelTrigger']")).click();
        //click on log out button
        driver.findElement(By.xpath(" //a[@href='/index.php/auth/logout']")).click();
        //driver.close();
    }

}
