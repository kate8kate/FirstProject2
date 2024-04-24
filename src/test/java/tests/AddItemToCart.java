package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class AddItemToCart extends TestBase{


    @BeforeClass
    public void preconditions() {
        // TODO login
        // click on login btn by: //a[@href='/login']
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        // fill email by: //input[@name='email']
        WebElement inputEmail = driver.findElement(By
                .xpath("//input[@name='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("kmnvljsn@mnvl.jhn");
        // fill password by: //input[@name='password']
        WebElement inputPassword = driver.findElement(By
                .xpath("//input[@name='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Qwerty123!");
        // click login btn by: //button[@name='login']
        driver.findElement(By.xpath("//*[@type='submit' and @class='button-1 login-button']")).click();

    }
    @Test
    public void addItemToCart() {

        // click on //*[@type ='button' and @class='button-2 product-box-add-to-cart-button']
        driver.findElement(By.xpath(
                "//*[@type ='button' and @class='button-2 product-box-add-to-cart-button']"));

    }
}
