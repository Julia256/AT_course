import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CellSamplerPage {

    WebDriver driver;

    public CellSamplerPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCellSamplerArea() {
        return driver.findElement(By.xpath("//div[@class='GNHGC04CHJ' and text()='Cell Sampler']"));
    }

    public List<WebElement> getCheckBoxes() {
        return getCellSamplerArea().findElements(By.xpath("//input[type='checkbox']"));
    }

    public WebElement getFirdtEditField() {
        return getCellSamplerArea().findElement(By.xpath("//input[type='text']"));
    }
}
