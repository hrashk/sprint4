package praktikum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.openqa.selenium.WebDriver;

public class SampleWebTest {
    @RegisterExtension
    private DriverExtension extension = new DriverExtension();

    @Test
    public void openMainPage() throws Exception {
        WebDriver driver = extension.getDriver();
        
        var mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.clickOnOrderStatus();

        String invalidOrderId = "aa332211";
        mainPage.enterOrderId(invalidOrderId);

        var statusPage = mainPage.clickOnGoButton();

        statusPage.checkNotFound();
    }
}
