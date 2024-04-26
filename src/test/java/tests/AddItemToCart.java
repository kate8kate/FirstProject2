package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class AddItemToCart extends TestBase{


    @BeforeClass
    public void preconditions() {
        // TODO login
        // click on login btn by: //a[@href='/login']
        startToLoginBtn();
        // fill email by: //input[@name='Email']
        fillEmailOnLogin("kmnvljsn@mnvl.jhn");
        // fill password by: //input[@name='Password']
        fillPasswordOnLogin("Qwerty123!");
        // click login btn by: //button[@name='login']
        clickOnLoginBtn();

    }
    public void startToLoginBtn() {
        driver.findElement(By.xpath("//a[@href='/login']")).click();
    }

    public void clickOnLoginBtn() {
        driver.findElement(By.xpath("//*[@type='submit' and @class='button-1 login-button']")).click();
    }

    public void fillPasswordOnLogin(String Password) {
        WebElement inputPassword = driver.findElement(By
                .xpath("//input[@name='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys(Password);
    }

    public void fillEmailOnLogin(String Email) {
        WebElement inputEmail = driver.findElement(By
                .xpath("//input[@name='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys(Email);
    }

    @Test
    public void addItemToCart() {

        addItemToCartBtn();
        checkYourCartBtn();

        WebElement сartInfo = driver.findElement(
                By.xpath("//a[text()='14.1-inch Laptop' and @class='product-name']")
        );
        String actualRes = сartInfo.getText().trim();
        System.out.println(actualRes);

        Assert.assertEquals(actualRes, "14.1-inch Laptop");

    }
    public void addItemToCartBtn() {
        driver.findElements(By.xpath("//input[@value='Add to cart']"))
                .get(1).click();
    }
    public void checkYourCartBtn() {
        driver.findElement(By.xpath("//div[@class='footer']//a[@class='ico-cart']")).click();
    }


}
