import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeOrangehrmLive {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 2) Open Url
        driver.get(baseUrl);

        //Added Wait Duration
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //3) Print the title of the page
        System.out.println("Title of the page is " + driver.getTitle());

        //4) Print the current url
        System.out.println("Current Url is " + driver.getCurrentUrl());

        //5) Print the page source
        System.out.println("Page Source is " + driver.getPageSource());

        //6) Enter the email to email field

        WebElement usernamefield = driver.findElement(By.name("username"));   //Found Email field
        usernamefield.sendKeys("Shiv");          // writing email id to that field

        //7) Enter the password to password field

        WebElement passwordfield = driver.findElement(By.name("password"));   //Found Password field
        passwordfield.sendKeys("Patel");          // writing email id to that field

        //8) Close the browser

        //driver.quit();
    }


}
