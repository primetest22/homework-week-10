package project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //driver object
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println("Title of the page: " + driver.getTitle());
        System.out.println("Current url: "+ driver.getCurrentUrl());
        System.out.println("Page source: " + driver.getPageSource());

        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Primetest@gmail.com");

        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("Prime Test");

        driver.close();

    }
}
