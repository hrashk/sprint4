package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;
    protected final By goButton = By.cssSelector(".Header_Button__28dPO");
    protected final By orderIdInput = By.cssSelector(".Input_Input__1iN_Z");
    protected final By orderStatus = By.className("Header_Link__1TAG7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMainPage() {
        driver.get(EnvConfig.BASE_URL);
    }

    public StatusPage clickOnGoButton() {
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(goButton));
        driver.findElement(goButton).click();

        return new StatusPage(driver);
    }

    public void typeOrderId(String orderId) {
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(orderIdInput));
        driver.findElement(orderIdInput).sendKeys(orderId);
    }

    public void clickOnOrderStatus() {
        driver.findElement(orderStatus).click();
    }

}
