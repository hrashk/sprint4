package praktikum;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import praktikum.pages.MainPage;
import praktikum.pages.StatusPage;

public class OrderTests {
    private final String INVALID_ORDER_NUMBER = "123";

    @Rule
    public DriverRule driverRule = new DriverRule();

    @Test
    public void invalidOrderNumber() {
        WebDriver driver = driverRule.getDriver();

        MainPage main = new MainPage(driver)
                .open()
                .clickOnOrderStatus()
                .enterOrderNumber(INVALID_ORDER_NUMBER);

        StatusPage status = main.clickOnGo();
        status.checkNotFound();
    }
}
