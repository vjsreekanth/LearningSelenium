package org.sreekanth.ex.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;



public class SeleniumTask13_10_24 {
    @Test
    public void seleniumTask13_10_24(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        Assert.assertEquals( driver.getTitle(), "CURA Healthcare Service");

        WebElement header = driver.findElement(By.tagName("h1"));
        Assert.assertEquals("CURA Healthcare Service", header.getText());
        System.out.println(header.getText());
        WebElement button = driver.findElement(By.id("btn-make-appointment"));
        Assert.assertEquals("Make Appointment", button.getText());
        System.out.println(button.getText());
       // Assert.assertTrue(driver.getPageSource().contains("CURA Healthcare Service"));
        driver.quit();

    }
}
