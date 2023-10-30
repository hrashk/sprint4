package praktikum;

import org.junit.Rule;
import org.junit.Test;
import praktikum.pages.MainPage;
import praktikum.pages.TrackPage;

public class ScooterTest {

    private static final String INVALID_ORDER_NUMBER = "123";
    @Rule
    public DriverRule driverRule = new DriverRule();

    @Test
    public void invalidOrderNumber() {
        MainPage mainPage = new MainPage(driverRule.getDriver());

        mainPage.open()
                .showStatus()
                .typeOrderNumber(INVALID_ORDER_NUMBER);

        TrackPage trackPage = mainPage.clickOnGo();
        trackPage.waitForNoStatus();
    }
}
