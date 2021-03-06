package com.hakan.hepsiburadaProje_2;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/*Hepsiburada sitesine login olarak bir urunu favorilere ekleme ve favoriler listesinde kontrol ederek tekrar favorilerden cikarma.
*/
public class loginPage {


    WebDriver webDriver;
    WebDriverWait webDriverWait;
    WebDriver driver;

    public loginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.driver = webDriver;
        this.webDriverWait = new WebDriverWait(webDriver, 30, 150);
    }

    public void login(String username, String password) {
        webDriver.get("https://www.hepsiburada.com/");
        webDriver.findElement(By.cssSelector(".insider-opt-in-notification-button.insider-opt-in-disallow-button")).click();
        WebElement mainLoginButton = webDriver.findElement(By.id("myAccount"));
        mainLoginButton.click();

        Actions actions = new Actions(webDriver);
        actions.moveToElement(mainLoginButton).build().perform();

        WebElement loginElement = webDriver.findElement(By.cssSelector("#login"));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(loginElement)).click();
        sleep(2);
        webDriver.findElement(By.id("email")).sendKeys(username);
        webDriver.findElement(By.id("password")).sendKeys(password);
        sleep(2);
        webDriver.findElement(By.cssSelector(".btn.full.btn-login-submit")).click();

        System.out.println("giris basarili");
    }

    public void addToFavourite(String text){

            WebElement searchAreaElement = webDriver.findElement(By.id("productSearch"));
            searchAreaElement.sendKeys(text);
            sleep(3);
            searchAreaElement.sendKeys(Keys.ENTER);
            sleep(3);
            webDriver.findElement(By.className("hb-pl-cn")).click();
            sleep(5);
            webDriver.findElement(By.className("favorite")).click();
            System.out.println("job done");

    }
    public void sleep(int second){
        try {
            Thread.sleep(second*1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    }
