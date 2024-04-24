package locators;

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

public class LocatorsCss {

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
    public void testCSS() {
    // by id By.id("#topcartlink")
//        WebElement byId = driver.findElement(By.cssSelector("#topcartlink"));
//
//        // by class By.className("header-logo")
//        WebElement byClass = driver.findElement(By.cssSelector(".header-logo"));
//
//        // Attribute: in DOM::    attributeName="attributeValue"
//        // "[attributeName="attributeValue"]"
//        WebElement byAttrNameAndValue = driver.findElement(
//                By.cssSelector("[type='text/javascript']"));
//
//        WebElement byAttrName = driver.findElement(
//                By.cssSelector("[type]"));
//
//        WebElement byAttrNameAndPartyValue = driver.findElement(
//                By.cssSelector("[type*='t/javas']"));
//
//        WebElement byAttrNameAndStartsWithValue = driver.findElement(
//                By.cssSelector("[type^='text/ja']"));
//
//        WebElement byAttrNameAndEndsWithValue = driver.findElement(
//                By.cssSelector("[type$='cript']"));
//
//        // by tag
//
//        WebElement byTag = driver.findElement(By.cssSelector("div"));
//
//        // by tag and class
//        // <tagName class "classValue"> Text </tagName>
//        // tagName.classValue
//
//        WebElement byTagAndClassValue = driver.findElement(By.cssSelector("div.header"));
//
//        WebElement byTagIdValueAndClassValue =
//                driver.findElement(By.cssSelector("div#flyout-cart.flyout-cart"));
//
//        WebElement byTagIdAndAttribute =
//                driver.findElement(By.cssSelector("input#small-searchterms[type='text']"));

//-----------------------HOMEWORK--------------------------------------------
        WebElement byId1 = driver.findElement(By.cssSelector("#dialog-notifications-success"));
        WebElement byClass1 = driver.findElement(By.cssSelector(".top-menu"));
        WebElement byAttrName1 = driver.findElement(By.cssSelector("[title]"));
        WebElement byAttrName2 = driver.findElement(By.cssSelector("[style]"));
        WebElement byTagAndClassValue1 = driver.findElement(By.cssSelector("div.listbox"));
        WebElement byTag1 = driver.findElement(By.cssSelector("script"));
        WebElement byAttrNameAndPartyValue1 = driver.findElement(
                  By.cssSelector("[title*='Show details']"));
        WebElement byAttrNameAndEndsWithValue1 = driver.findElement(
                  By.cssSelector("[type$='xt']"));
        WebElement byAttrNameAndStartsWithValue1 = driver.findElement(
                  By.cssSelector("[style^='display: no']"));
        WebElement byTagIdValueAndClassValue1 =
                  driver.findElement(By.cssSelector("div#newsletter-subscribe-block.newsletter-subscribe-block"));

    }
}
