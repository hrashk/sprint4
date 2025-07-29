package praktikum;

import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

public class SampleWebTest {
    @RegisterExtension
    private DriverExtension extension = new DriverExtension();

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    public void openMainPage() throws Exception {
        WebDriver driver = extension.getDriver();

        var mainPage = new MainPage(driver);
        mainPage.openMainPage();
        mainPage.clickOnOrderStatus();

        String invalidId = "a123";
        mainPage.typeOrderId(invalidId);

        StatusPage statusPage = mainPage.clickOnGoButton();
        statusPage.checkNotFoundMessage();
    }
}
