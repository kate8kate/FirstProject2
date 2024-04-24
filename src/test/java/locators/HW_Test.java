package locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW_Test {

    /*Создайте, пожалуйста, новый тестовый класс и найдите 3 элемента на странице*/
    WebDriver driver;
    @Test
    public void testLocators() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--lange=en");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        driver.navigate().to("https://demowebshop.tricentis.com/");

        WebElement elementByClass = driver.findElement(By.className("bar-notification"));
        System.out.println(elementByClass.getText());


        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("Books"));
        System.out.println(elementByPartialLinkText.getText());


        WebElement elementByID = driver.findElement(By.id("termsofservice"));
        System.out.println(elementByID.getAttribute("name"));

        driver.quit();
    }

}