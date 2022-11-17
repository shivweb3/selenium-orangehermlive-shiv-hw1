import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxOrangehrmLive {
    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gheko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // 2) Open Url
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //3) Print the title of the page
        System.out.println("Title of the page is " + driver.getTitle());

        //4) Print the current url
        System.out.println("Current Url is " + driver.getCurrentUrl());

        //5) Print the page source
        System.out.println("Page Source is " + driver.getPageSource());

        //6) Enter the email to email field
        WebElement userName1 = driver.findElement(By.name("username"));
        userName1.sendKeys("Admin");

        //7) Enter the password to password field

        WebElement passwordfield1 = driver.findElement(By.name("password"));   //Found Password field
        passwordfield1.sendKeys("a1b2c3d4");


        //8) Close the browser

        //driver.quit();
    }
}
