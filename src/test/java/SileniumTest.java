import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SileniumTest extends Utils1 {

    @Test
    public void firstTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        // click to the search placeholder
        WebElement searchInput =  driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchInput.click();

        // fill QA Tester value
        searchInput.sendKeys("QA Tester");


        // click on the magnifier
        WebElement magnifierElement = driver.findElement(By.xpath("//input[@id='searchButton']"));
        magnifierElement.click();
        // имтация нажатия энтер на клаве 
        // magnifierElement.sendKeys(Keys.ENTER);

        Thread.sleep(1000);

        // assert of values
        WebElement findHeading1 = driver.findElement(By.xpath("//h1[@id='firstHeading']"));
        String resultOfSearch = findHeading1.getText();
        Assert.assertEquals(resultOfSearch, "Search results");
        driver.quit();

        //   //input[@id='searchInput']
    }
}
