package praktikum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.WebDriver;
import praktikum.pages.MainPage;
import praktikum.pages.StatusPage;

public class ScooterTest {
    @RegisterExtension
    public DriverRule factory = new DriverRule();

    private String INVALID_ORDER_ID = "123";

    @Test
    public void invalidOrder() throws Exception {
        WebDriver driver = factory.getDriver();
        var mainPain = new MainPage(driver);

        mainPain.open();

        mainPain.clickOnStatus();
        mainPain.enterOrderId(INVALID_ORDER_ID);

        StatusPage statusPage = mainPain.clickOnGo();
        statusPage.checkErrorMessage();
    }
}
