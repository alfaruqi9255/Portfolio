package org.alqi;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwagLabs {

    @Test
    public void tcase1() throws InterruptedException {

        //1. Webdriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate web application
        driver.get("https://saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);

        //3. Maximize browser
        driver.manage().window().maximize();

        //Test Login
        //define username
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='user-name']")));
        //click username
        username.click();
        //input username
        username.sendKeys("standard_user");

        //define password
        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        //click password
        password.click();
        //input password
        password.sendKeys("secret_sauce");

        //define button login
        WebElement BtnLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));
        //click Button
        BtnLogin.click();
        Thread.sleep(3000);

        //Add To Cart
        //Click Add To Cart
        WebElement BtnAdd = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-sauce-labs-backpack")));
        //Click Button
        BtnAdd.click();
        Thread.sleep(3000);

        //Cart
        //Click Cart
        WebElement Cart = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='shopping_cart_link']")));
        //Click Button
        Cart.click();
        Thread.sleep(3000);

        //Checkout
        //Click Checkout
        WebElement BtnCheck = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkout")));
        BtnCheck.click();
        Thread.sleep(3000);

        //Form Confirm Order
        //Input Firstname
        WebElement FirstName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name")));
        //Click Firstname
        FirstName.click();
        //input Firstname
        FirstName.sendKeys("shaq");

        //Input Lastname
        WebElement LastName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("last-name")));
        //Click Lastname
        LastName.click();
        //input Lastname
        LastName.sendKeys("al");

        //Input Zip Code
        WebElement Zipcode = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("postal-code")));
        //Click Zip Code
        Zipcode.click();
        //input Zip Code
        Zipcode.sendKeys("43587");

        //Click Continue
        WebElement BtnCtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("continue")));
        BtnCtn.click();
        Thread.sleep(3000);

        //Click Finish
        WebElement BtnFinish = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));
        BtnFinish.click();

        //4.Menutup Browser
        Thread.sleep(5000);
        driver.close();



    }
}