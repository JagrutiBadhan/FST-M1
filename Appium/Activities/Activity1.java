package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("platformName","android");
        cap.setCapability("appium:automationName","UiAutomator2");
        cap.setCapability("appium:deviceId","a958ce14");
        cap.setCapability("appPackage","com.android.bbkcalculator");
        cap.setCapability("appActivity",".Calculator");

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, cap);
    }

    @Test
    public void multiply(){
        // Using resource-id
        driver.findElementById("digit9").click();

        driver.findElementById("mul").click();
        // Using XPath
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"5\"]").click();

        // Perform Calculation
        driver.findElementById("equal").click();

        // Display Result
        String result = driver.findElement(MobileBy.id("input_edit")).getText();
        System.out.println("Result: "+result);

        // Assertion
        Assert.assertEquals(result, "45");
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }





}
