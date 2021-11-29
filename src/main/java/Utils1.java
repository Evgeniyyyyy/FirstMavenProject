import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Utils1 {
    @BeforeTest
    public void setUp(){
        System.out.println("The Testing Start");
        driverSetUp();
    }

    @AfterTest
    public void reportReady(){
        System.out.println("Report is ready to be shared");
    }

    public static void driverSetUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/ybozhenko/Downloads/chromedriver.exe");

    }
}
