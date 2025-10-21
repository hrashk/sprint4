package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatusPage {
    private final WebDriver driver;

    public StatusPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkErrorMessage() {
        By notFoundImg = By.cssSelector("[alt='Not found']");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(notFoundImg));
        assertTrue(driver.findElement(notFoundImg).isDisplayed());
    }
}
