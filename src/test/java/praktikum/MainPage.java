package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    protected final By orderIdField = By.cssSelector(".Input_Input__1iN_Z");
    protected final By goButton = By.cssSelector(".Header_Button__28dPO");
    protected final By orderStatusButton = By.cssSelector(".Header_Link__1TAG7");

    private final WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public StatusPage clickOnGoButton() {
        driver.findElement(goButton).click();

        return new StatusPage(driver);
    }

    public void enterOrderId(String orderId) {
        driver.findElement(orderIdField).sendKeys(orderId);
    }

    public void waitForOrderField() {
        new WebDriverWait(driver, EnvConfig.EXPLICIT_TIMEOUT)
                .until(ExpectedConditions.visibilityOfElementLocated(orderIdField));
    }

    public void clickOnOrderStatus() {
        driver.findElement(orderStatusButton).click();
    }

    public void open() {
        driver.get(EnvConfig.BASE_URL);
    }
}
