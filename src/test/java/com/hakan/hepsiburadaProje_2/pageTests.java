package com.hakan.hepsiburadaProje_2;

import org.junit.Test;

public class pageTests extends pageSetUps{

    @Test
    public void favaouriteTest(){
        new loginPage(driver).login("asdas@das.com", "asdasasdas");
        new loginPage(driver).addToFavourite("iphone");

    }
}
