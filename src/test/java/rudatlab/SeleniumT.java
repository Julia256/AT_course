package rudatlab;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SeleniumT {
    static WebDriver driver;
    @BeforeClass
    public static void setupDriver() throws IOException {
        //System.out.println();
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/rudatlab/resourses/chromedriver");
        driver = new ChromeDriver(DesiredCapabilities.chrome());

    }

    @Test
    public void testtest() throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellSampler");
        Thread.sleep(5000);
        driver.
                findElement(By.xpath("//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div[3]/div/div[3]/div/div[2]/div/div/table/tbody/tr[1]/td[1]/div/input")).click();
        Thread.sleep(5000);
        driver.
                findElement(By.xpath("//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div[3]/div/div[3]/div/div[2]/div/div/table/tbody/tr[2]/td[1]/div/input")).click();
        Thread.sleep(5000);
        driver.
                findElement(By.xpath("//*[@id=\"gwt-debug-contentPanel\"]/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div[3]/div/div[3]/div/div[2]/div/div/table/tbody/tr[6]/td[1]/div/input")).click();
        Thread.sleep(5000);
    }

    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }

}
