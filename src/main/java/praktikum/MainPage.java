package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private final WebDriver driver;

    By goButton = By.cssSelector(".Header_Button__28dPO");
    By orderStatus = By.className("Header_Link__1TAG7");
    By orderIdField = By.xpath("//input");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public StatusPage clickOnGoButton() {
        driver.findElement(goButton).click();
        return new StatusPage(driver);
    }

    public void enterOrderId(String orderId) {
        new WebDriverWait(driver, Duration.ofSeconds(EnvConfig.EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(goButton));

        driver.findElement(orderIdField).sendKeys(orderId);
    }

    public void clickOnOrderStatus() {
        driver.findElement(orderStatus).click();
    }

    public void open() {
        driver.get(EnvConfig.BASE_URL);
    }
}
