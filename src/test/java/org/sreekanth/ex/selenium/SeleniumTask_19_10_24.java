package org.sreekanth.ex.selenium;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTask_19_10_24 {
    @Description("Verify that- Your Account Has Been Created!")
    @Test
    public void testopencartregistration(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments(("--start-maximized"));
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/register");


      // Assert.assertEquals(driver.getCurrentUrl()," https://awesomeqa.com/ui/index.php?route=account/register");

        WebElement firstnameinputbox = driver.findElement(By.id("input-firstname"));

        firstnameinputbox.sendKeys("sreek");
        WebElement lastnameinputbox = driver.findElement(By.id("input-lastname"));
        lastnameinputbox.sendKeys("jaga");
        WebElement emailinputbox = driver.findElement(By.id("input-email"));
        emailinputbox.sendKeys("any123@gmail.com");
        WebElement telephoneinputbox = driver.findElement(By.id("input-telephone"));
        telephoneinputbox.sendKeys("2556615544");
        WebElement passwordinputbox = driver.findElement(By.id("input-password"));
        passwordinputbox.sendKeys("turn12345678");
        WebElement passwordconfirminputbox = driver.findElement(By.id("input-confirm"));
        passwordconfirminputbox.sendKeys("turn12345678");
        WebElement subscriberadiobuttonno = driver.findElements(By.name("newsletter")).get(1);
        subscriberadiobuttonno.click();
        WebElement agreecheckbox = driver.findElement(By.name("agree"));
        agreecheckbox.click();
        WebElement submitbutton = driver.findElement(By.className("btn-primary"));
        submitbutton.click();
        // After 3 seconds error comes
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       Assert.assertEquals(driver.getTitle(),"Your Account Has Been Created!");

        driver.quit();









    }



}
