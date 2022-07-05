package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.sl.usermodel.Shadow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowRoot {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
        Driver.getDriver().get("https://letcode.in/shadow%22");
                Thread.sleep(500);

//        first approach to handle shadow dom

//        String str = "return document.querySelector("#open-shadow").shadowRoot.querySelector("#fname").value='hello'";
//
//        JavascriptExecutor js= (JavascriptExecutor) driver;
//        js.executeScript(str);

//        second approach to handle shadow dom
//        Shadow shadow=new Shadow(driver);
//        WebElement element=shadow.findElement("#fname");
//        element.sendKeys("merhaba");


    }

}
