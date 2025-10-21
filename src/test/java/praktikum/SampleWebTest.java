package praktikum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class SampleWebTest {
    @RegisterExtension
    private DriverExtension extension = new DriverExtension();

    @Test
    public void openMainPage() throws Exception {
        var driver = extension.getDriver();
        var mainPage = new MainPage(driver);

        mainPage.openMainPage();

        mainPage.clickOnStatus();

        mainPage.enterOrderNo();

        var statusPage = mainPage.clickOnGoButton();
        statusPage.checkErrorMessage();
    }
}
