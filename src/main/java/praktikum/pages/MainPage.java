package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import praktikum.EnvConfig;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;
    private final By goButton = By.cssSelector("[class*=Header_Button__]");
    private final By orderField = By.cssSelector(".Input_Input__1iN_Z");
    private final By orderStatusField = By.className("Header_Link__1TAG7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public StatusPage clickOnGo() {
        driver.findElement(goButton).click();

        return new StatusPage(driver);
    }

    public MainPage enterOrderNumber(String orderNumber) {
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.DEFAULT_TIMEOUT))
                .until(ExpectedConditions.visibilityOfElementLocated(orderField));

        driver.findElement(orderField).sendKeys(orderNumber);

        return this;
    }

    public MainPage clickOnOrderStatus() {
        driver.findElement(orderStatusField).click();

        return this;
    }

    public MainPage open() {
        driver.get(EnvConfig.BASE_URL);

        return this;
    }
}
