import cucumber.api.CucumberOptions;
import cucumber.api.java.ru.Пусть;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features"
//        //glue = "ru.savkk.test",
        //tags = "@all"
//        //dryRun = false,
//        //strict = false,
//        //snippets = SnippetType.UNDERSCORE,
////        name = "^Успешное|Успешная.*"
)

public class StepsTest {

    static WebDriver driver;


    @Test
    public void setupDriverTest() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/chromedriver");
        driver = new ChromeDriver(DesiredCapabilities.chrome());
    }

    @Пусть("^открыта страница \"(.*)\"$")
    public void openMainPage(String site) {
        driver.get(site);
    }

    @Test
    public void openMainPage2() {
        driver.get("http://www.gwtproject.org/");
    }




    @AfterClass
    public static void closeDriver() {
        driver.quit();
    }
}