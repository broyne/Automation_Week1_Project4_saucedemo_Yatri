package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    static String baseUrl = "https://www.saucedemo.com/";

    public static void main(String[] args) {
        //1.Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        //2.Open URL.
        driver.get(baseUrl);

        //Maximise the browser window
        driver.manage().window().maximize();

        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3. Print the title of the page.
        System.out.println("This is the main title of the page: " + driver.getTitle());

        //4. Print the current url.
        System.out.println("This is the Current Url: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("This is the page source: " + driver.getPageSource());

        //6.Enter the email to email field.
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");

        //7.Enter the password to password field.
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        //8.Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //9. Print the current url.
        System.out.println("This is the current URL: " + driver.getCurrentUrl());

        //10. Navigate to baseUrl
        driver.navigate().back();

        //11. Refresh the page.
        driver.navigate().refresh();

        //12. Close the browser.
        driver.quit();

    }
}