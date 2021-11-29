package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void titleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ybozhenko/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // navigate to URL
        driver.get("https://www.selenium.dev/");


        // click to the Documentation button
        WebElement documentationTextButton = driver.findElement(By.xpath("//nav/a[3]"));
        documentationTextButton.click();

        // type element in Search field
        Thread.sleep(1000);
        driver.findElement(By.id("search-by")).sendKeys("element");

        Thread.sleep(1000);
        //  click first result
        WebElement firstResult = driver.findElement(
                By.xpath("//div[@data-title='Web element']"));
        firstResult.click();


        // assert text "web element" on header
        WebElement pageTitleWE = driver.findElement(By.tagName("h1"));
        String pageTitle = pageTitleWE.getText();
        System.out.println(pageTitle);
        Assert.assertEquals(pageTitle, "Web element");


        Thread.sleep(3000);
        driver.quit();


    }
}
