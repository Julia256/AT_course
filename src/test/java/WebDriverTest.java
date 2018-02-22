import org.junit.*;
import java.io.IOException;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.junit.Assert.*;


public class WebDriverTest {

    private static ChromeDriver driver;

    @BeforeClass
    public static void setupDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void ChromeDriverTest() throws Exception{
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellSampler");
      }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

}