package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatusPage {
    protected final By notFoundImage = By.xpath("//img[@alt='Not found']");

    private final WebDriver driver;

    public StatusPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkNotFoundImage() {
        new WebDriverWait(driver, EnvConfig.EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.visibilityOfElementLocated(notFoundImage));

        assertTrue(driver.findElement(notFoundImage).isDisplayed());
    }
}
