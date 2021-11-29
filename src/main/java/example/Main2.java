package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:/Users/ybozhenko/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        Thread.sleep(5000);

        WebElement input = driver.findElement(By.id("inputWrapper"));
        input.sendKeys("123\n");
        driver.quit();

        //*[@id="input"]
        //By.className ("gLFyf")
// /html/body/ntp-app//div/ntp-realbox//div/input
        // /html/body/ntp-app//div/ntp-realbox//div
        //*[@id="input"]

    }
}
