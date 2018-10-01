package com.qainfotech.com.MobileTesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;

public class FirstAppiumAndroidTest {
	 WebDriver driver;
	 
	    @BeforeClass
	    public void setUp() throws MalformedURLException{
	        //Set up desired capabilities and pass the Android app-activity
	        //and app-package to Appium
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("BROWSEFirstAppiumAndroidTestR_NAME", "Android");
	        capabilities.setCapability("VERSION", "4.4.2");
	        capabilities.setCapability("deviceName","AVD for Nexus 4 by Google");
	        capabilities.setCapability("platformName","Android");
	 
	        // This package name of your app (you can get it from apk info app)
	        capabilities.setCapability("appPackage", "com.android2.calculator3");
	 
	        // This is Launcher activity of your app (you can get it from apk info app)
	        capabilities.setCapability("appActivity","com.xlythe.calculator.material.Calculator");
	 
	        //Create RemoteWebDriver instance and connect to the Appium server
	        //It will launch the Calculator App in Andrjoid Device using the configurations
	        //specified in Desired Capabilities
	        driver = new RemoteWebDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
	    }
	 
	    @Test
	    public void testCal() throws Exception {
	    	List<WebElement> plusButton=driver.findElements(By.className("android.widget.Button"));
	    	 System.out.println(plusButton.size());
	    	 for(int i=0;i<20;i++) {
	    		 System.out.println(plusButton.get(i));
	    	 }
	    	// TouchActions action = new TouchActions((PerformsTouchActions)driver);
	    	 Thread.sleep(2000);
	    	 WebElement ele = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.View[1]/android.widget.Button[1]"));
	    	// WebElement ele = driver.findElement(By.xpath("(//b[text()='android.widget.LinearLayout']/parent::span/parent::span/parent::span/following-sibling::ul//b[text()='android.widget.Button'])[1]"));
	    	 ele.click();
	    	 Thread.sleep(2000);
	    	 WebElement ele1 = driver.findElement(By.xpath("(//b[text()='android.widget.LinearLayout']/parent::span/parent::span/parent::span/following-sibling::ul//b[text()='android.widget.Button'])[1]"));
			    	
	    	 
	    	 //action.singleTap(ele);
	    	// action.perform();
	    	 
	    	 ele1.click();
	    	 //MobileElement notNow=driver.findElement(By.xpath("//a[@class='notnow']"));  
	    	  // TouchAction actions=new TouchAction((PerformsTouchActions) driver); 
	    	  // actions.tap((TapOptions) ele).perform(); 
	    	 //driver.findElement(By.xpath("//span[@class='ant-tree-node-content-wrapper ant-tree-node-content-wrapper-normal ant-tree-node-selected']//b")).click();
	    	// findElementByAndroidUIAutomator("new UiSelector().textContains('7')");
	    	 //driver.findElement(By.xpath("//*[text()='android.widget.EditText']")).sendKeys("4");
	    	 //elementName.get(0).sendKeys("3");
	    	 System.out.println(); 	 
	   //System.out.println(driver.findElement(By.xpath("//*[@id=\"selectedElementContainer\"]/div/div[2]/div/div[4]/div/div/div/div/div/div/table/tbody/tr[2]/td[2]")).isDisplayed());
	        //locate the Text on the calculator by using By.name()
	    //	System.out.println(driver.findElement(By.xpath("//*[text()=\"text\"]/following-sibling::td[text()='7']")).isDisplayed());
//	        WebElement seven=driver.findElement(By.xpath("//td[contains(text(),'7')]"));
//	        seven.click();
	        System.out.println("its me?");
//	        WebElement plus=driver.findElement(By.xpath(""));
//	        plus.click();
//	        WebElement eight=driver.findElement(By.xpath("//tr//td[contains(text(),'8')]"));
//	        eight.click();
//	        WebElement equalTo=driver.findElement(By.xpath("//*[@id=\"sourceContainer\"]/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li[2]/ul/li[2]/ul/li[1]/ul/li[12]/span[2]/span/span/b"));
//	        equalTo.click();
//	        //locate the edit box of the calculator by using By.tagName()
//	        WebElement results=driver.findElement(By.xpath("//*[@id=\"sourceContainer\"]/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li[1]/ul/li[2]/ul/li[4]/span[2]/span/span/b"));
//	        //Check the calculated value on the edit box
//	        assert results.getText().toString().equals("15"):"Actual value is : "
//	                +results.getText()+" did not match with expected value: 15";
	    }
	 
	    @AfterClass
	    public void teardown(){
	        //close the app
	        driver.quit();
	    }
}
