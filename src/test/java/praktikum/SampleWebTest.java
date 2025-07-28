package praktikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleWebTest {
    private WebDriver driver;

    @BeforeEach
    public void startUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void openMainPage() throws Exception {
        driver.get("https://qa-scooter.praktikum-services.ru/");

        Thread.sleep(10_000);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
