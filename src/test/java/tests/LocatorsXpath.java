package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LocatorsXpath {
    WebDriver driver;

    @BeforeClass
    public void init() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lange=en");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        // implicit waiting's
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void testXpath() {
        /*
        /html/body//div[@class='column information']
        //div[@class='column information']
        //tagName [@attributeName= 'attributeValue']
        */
        WebElement topCarLink =
                driver.findElement(By.xpath("//li[@id='topcartlink']"));
        // any tag
        WebElement scriptElement1 =
                driver.findElement(By.xpath("//*[@type='text/javascript']"));
        WebElement scriptElement =
                driver.findElement(By.xpath("//script[@type='text/javascript']"));

        // by text
        WebElement byText = driver.findElement(
                By.xpath("//strong[text()='Community poll']")
        );
        // partial text: //strong[contains(text(),' poll')]
        WebElement byPartialText =
                driver.findElement(By.xpath("//h2[contains(text(),' Welcome to our ')]"));

        // contains - startWith - endsWith

        // with 2 attributes css: //div[@id='flyout-cart' and @class='flyout-cart']
        WebElement twoAttributesSearch = driver.findElement(
                By.xpath("//div[@id='flyout-cart' and @class='flyout-cart']")
        );
        WebElement twoAttributesSearchOr = driver.findElement(
                By.xpath("//div[@id='flyout-cart' or @class='flyout-cart']")
        );



    }
}
