package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase{
    @AfterMethod
    public void methodPostCondition() {
        driver.findElement(
                        By.xpath("//div[contains(@class,'navbar-logged')]//button"))
                .click();
        driver.navigate().to("https://demowebshop.tricentis.com/");
    }
    @Test
    public void positiveRegistrationTest() {
        // click on register button by //a[@href='/register']
        driver.findElement(By.xpath("//a[@href='/register']")).click();

        // input FirstName by: //input[@name='FirstName']
        WebElement inputFirstname = driver.findElement(By.xpath(
                "//input[@name='FirstName']"));
        // input LastName by: //input[@name='FirstName']
        WebElement inputLastname = driver.findElement(By.xpath(
                "//input[@name='LastName']"));
        // input e-mail by: //input[@name='Email']
        WebElement inputEmail = driver.findElement(By.xpath(
                "//input[@name='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("jfnwig@jngut3.nvh");

        // input password by: //input[@name='Password']
        WebElement inputPassword = driver.findElement(By.xpath(
                "//input[@name='Password']"));
        inputPassword.click();
        inputPassword.clear();
        inputPassword.sendKeys("Qwerty123!");
        // confirm password by: //input[@name='ConfirmPassword']
        WebElement confirmPassword = driver.findElement(By.xpath(
                "//input[@name='ConfirmPassword']"));
        confirmPassword.click();
        confirmPassword.clear();
        confirmPassword.sendKeys("Qwerty123!");
        // click on register button by:  //input[@name='register-button']
        driver.findElement(By.xpath("//input[@name='register-button']")).click();
    }
}
