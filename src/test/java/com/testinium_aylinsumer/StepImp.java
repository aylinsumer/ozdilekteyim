package com.testinium_aylinsumer;
import com.thoughtworks.gauge.Step;


import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.openqa.selenium.By;

public class StepImp extends BaseTest {
    @Step("<time> saniye bekle")
    public void waitTime(int time) throws InterruptedException {
        Thread.sleep(1000 * time);
    }

    @Step("<Key> Id'li elemente tıkla")
    public void clickElementById(String Key){
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println(Key+" elementine tiklandi.");
    }

    @Step("<Key> CssSelector'lu elemente tıkla")
    public void clickElementByCssSelector(String Key){
        appiumDriver.findElement(By.cssSelector(Key)).click();
        System.out.println(Key+" elementine tiklandi.");
    }

    @Step("<Key> Xpath'li elemente tıkla.")
    public void clickElementByXpath(String Key){
        appiumDriver.findElement(By.xpath(Key)).click();
        System.out.println(Key+" elementine tiklandi.");
    }
    @Step("<Key> xpath'li elemente <keyword> değerini yaz")
    public void SendkeyElementByxpath(String Key,String keyword){
        appiumDriver.findElement(By.xpath(Key)).sendKeys(keyword);
        System.out.println(Key+" SendKey alanina gönderildi");
    }
    @Step("<Key> id'li elemente <keyword> değerini yaz")
    public void SendkeyElementByid(String Key,String keyword){
        appiumDriver.findElement(By.id(Key)).sendKeys(keyword);
        System.out.println(Key+" Elementine tıklandı");
    }
    @Step("<Key> kere scroll yap")
    public void ScrollThePage(int Key){
        do{
            TouchAction scroll = new TouchAction(appiumDriver);
            scroll.press(350, 2616).moveTo(350, 504).release().perform();
            Key--;
        }while (Key>0);
    }

    @Step("<Expected> AssertEquals with id element <Actual>")
    public void AssertEqualsWithId(String Expected, String Actual){
        String ActualText = appiumDriver.findElement(By.id(Actual)).getText();
        Assert.assertEquals("Test Passed", Expected, ActualText);
    }
    @Step("<Expected> AssertEquals with xpath element <Actual>")
    public void AssertEqualsWithXpath(String Expected, String Actual){
        String ActualText = appiumDriver.findElement(By.xpath(Actual)).getText();
        Assert.assertEquals("Test Passed", Expected, ActualText);
    }
    @Step("<Expected> AssertEquals with cssSelector element <Actual>")
    public void AssertEqualsWithCssSelector(String Expected, String Actual){
        String ActualText = appiumDriver.findElement(By.cssSelector(Actual)).getText();
        Assert.assertEquals("Test Passed", Expected, ActualText);
    }
    @Step("<Expected> AssertEquals with xpath elements <Actual>")
    public void AssertEqualsWithXpaths(String Expected, String Actual){
        String ActualText = appiumDriver.findElement(By.xpath(Actual)).getText();
        String ExpectedText = appiumDriver.findElement(By.xpath(Expected)).getText();
        Assert.assertEquals("Test Passed", ExpectedText, ActualText);
    }
}

