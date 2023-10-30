package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import praktikum.EnvConfig;

import java.time.Duration;

public class TrackPage {
    final WebDriver driver;

    private static final By noImage = By.cssSelector("[alt='Not found']");

    public TrackPage(WebDriver driver) {
        this.driver = driver;
    }

    public TrackPage waitForNoStatus() {
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.DEFAULT_TIMEOUT))
                .until(ExpectedConditions.visibilityOfElementLocated(noImage));
        return this;
    }
}
