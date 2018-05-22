package com.hakan.hepsiburadaProje_2;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class pageSetUps {

    public WebDriver driver;

    @Before
    public void beforeCreateWebDriver() {

        System.setProperty("chromedriver","/home/erkanhan/IdeaProjects/selenium-web/chromedriver");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
