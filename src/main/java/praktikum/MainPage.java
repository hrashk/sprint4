package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private final WebDriver driver;
    private final By statusField = By.className("Header_Link__1TAG7");
    By goButton = By.cssSelector(".Header_Button__28dPO");
    By orderNoField = By.xpath("//input[contains(@class,'Input_Input__1iN_Z')]");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public StatusPage clickOnGoButton() {
        new WebDriverWait(driver, EnvConfig.EXPLICIT_WAIT)
                .until(ExpectedConditions.visibilityOfElementLocated(goButton));
        driver.findElement(goButton).click();
        return new StatusPage(driver);
    }

    public void enterOrderNo() {
        driver.findElement(orderNoField).sendKeys("asdf");
    }

    public void clickOnStatus() {
        driver.findElement(statusField).click();
    }

    public void openMainPage() {
        driver.get(EnvConfig.BASE_URL);
    }
}
