package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ru.Пусть;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepDefs {
    protected WebDriver driver;

    @Before("@success")
    public void setupDriver() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @After("@success")
    public void stopDriver() throws Throwable {
        driver.close();
    }
    @Пусть("^загружена страница Cell Sampler$")
    public void загруженаСтраницаCellSampler() throws Throwable {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellSampler");
    }
}
