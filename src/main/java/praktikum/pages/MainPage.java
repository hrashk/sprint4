package praktikum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import praktikum.EnvConfig;

import java.time.Duration;

public class MainPage {
    final WebDriver driver;

    private static final By goButton = By.cssSelector("[class*='Header_Button_']");
    protected static final By orderInput = By.xpath(".//input[contains(@class, 'Input_Input_')]");
    protected static final By statusButton = By.className("Header_Link__1TAG7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get(EnvConfig.BASE_URL);
        return this;
    }

    public TrackPage clickOnGo() {
        driver.findElement(goButton).click();
        return new TrackPage(driver);
    }

    public MainPage typeOrderNumber(String orderNumber) {
        driver.findElement(orderInput).sendKeys(orderNumber);
        return this;
    }

    public MainPage showStatus() {
        driver.findElement(statusButton).click();
        return this;
    }

    public void clickOnSomething() {
        driver.findElements(By.className("")).get(3).click();
    }
}
