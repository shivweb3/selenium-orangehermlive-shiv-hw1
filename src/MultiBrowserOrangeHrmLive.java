import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserOrangeHrmLive {

    static String browser = "chrome";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //1) Setup of Browsers
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gheko.driver","drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            System.out.println("Enter Correct Web Browser.");
        }

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

        WebElement usernamefield = driver.findElement(By.name("username"));   //Found Email field
        usernamefield.sendKeys("Admin");          // writing email id to that field

        //7) Enter the password to password field

        WebElement passwordfield = driver.findElement(By.name("password"));   //Found Password field
        passwordfield.sendKeys("a1b2c3d4");          // writing email id to that field

        //8) Close the browser

        //driver.quit();

    }

}
