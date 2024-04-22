package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    static WebDriver driver;

    @BeforeSuite
    public static void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lange=en");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }
    @AfterSuite
    public static void tearDown() { driver.quit(); }
}
