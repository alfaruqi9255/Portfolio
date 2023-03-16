package org.alqi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class alqiTesting {
    @Test
    public void tcase1() throws InterruptedException {

        //1. Webdriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
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
        //click button
        BtnLogin.click();
        Thread.sleep(3000);

        //Dropdown Menu
        WebElement BtnDrop = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-burger-menu-btn")));
        //Click Dropdown
        BtnDrop.click();
        Thread.sleep(3000);

        //Logout
        WebElement BtnLogout = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
        //Click Logout
        BtnLogout.click();

        //4.Menutup Browser
        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void tcase2() throws InterruptedException{

        //1. Webdriver
       System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate web application
        driver.get("https://saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 3);

        //3. Maximize browser
        driver.manage().window().maximize();

        //Test Login
        //define username
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        //click username
        username.click();
        //input username
        username.sendKeys("standard_user");

        //define password
        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        //click password
        password.click();
        //input password
        password.sendKeys("secretsauce");

        //define button login
        WebElement BtnLogin = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button")));
        //click button
        BtnLogin.click();

        Thread.sleep(2000);

        WebElement notifError = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Epic sadface: Username and password do not match any user in this service')]")));
        assertTrue(notifError.isDisplayed());

        //4.Menutup Browser
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void tcase3() throws InterruptedException {

        //1. Webdriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate web application
        driver.get("https://saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 3);

        //3. Maximize browser
        driver.manage().window().maximize();

        //Test Login
        //define username
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
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
        //click button
        BtnLogin.click();

        Thread.sleep(2000);

        WebElement notifSuccess = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='app_logo']")));
        //assertTrue(notifSuccess.isDisplayed());

        if (!notifSuccess.isDisplayed()) {
            System.out.println("Element is not displayed");
        }
        else {
            System.out.println("Element is diplayed");
        }
        //4.Menutup Browser
        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void tcase4() throws InterruptedException {

        //1. Webdriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate web application
        driver.get("https://saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);

        //3. Maximize browser
        driver.manage().window().maximize();

        //Test Login
        //define username
        WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
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
        //click button
        BtnLogin.click();
        Thread.sleep(3000);

        WebElement notifSucces = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='app_logo']")));
        assertTrue(notifSucces.isDisplayed());
        Thread.sleep(3000);

        //Dropdown Menu
        WebElement BtnDrop = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-burger-menu-btn")));
        //Click Dropdown
        BtnDrop.click();
        Thread.sleep(3000);

        //Logout
        WebElement BtnLogout = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link")));
        //Click Logout
        BtnLogout.click();

        //4.Menutup Browser
        Thread.sleep(5000);
        driver.close();

    }

    @Test
    public void assertEquals() throws InterruptedException {

        //1. Webdriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate web application
        driver.get("https://saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);

        //3. Maximize browser
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        String actualTitle = driver.getTitle();
        String ExpectedTitle ="Swag Labs";
        Assert.assertEquals(ExpectedTitle, actualTitle);
    }
    @Test
    public void assertNotEquals() throws InterruptedException {

        //1. Webdriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Navigate web application
        driver.get("https://saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, 30);

        //3. Maximize browser
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        String actualTitle = driver.getTitle();
        String ExpectedTitle ="SwagLabs";
        Assert.assertNotEquals(ExpectedTitle, actualTitle);

        Thread.sleep(5000);
        driver.close();

    }
}
