package com.nexsoft.onelist.definitions;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nexsoft.onelist.pom.OneList;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OneListDefinition {

	AndroidDriver driver;
	OneList oList;

	public String screenShot() {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String waktu = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		String namaFile = "D:\\TestScreenshoot\\Exam5\\" + waktu + ".png";
		File screenshot = new File(namaFile);
		try {
			FileUtils.copyFile(srcFile, screenshot);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return namaFile;
	}
	@Before
	public void init () throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appActivity", "com.lolo.io.onelist.MainActivity");
		capabilities.setCapability("appPackage", "com.lolo.io.onelist");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("platformVersion", "11.0");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
	
	@Given("User berada di halaman utama 1List")
	public void gotoMain() throws Throwable {
//		driver.findElement(By.id("com.lolo.io.onelist:id/fab")).click();
		
		System.out.println("User berada di halaman utama 1List");
	}

	@When("User menekan add List")
	public void addList() throws Throwable {
		oList=new OneList(driver);
		oList.addList();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println("User menekan add List");
	}
	
	@And("^User memasukkan listTitle(.*)$")
	public void inputListTitle(String listTitle) {
		System.out.println("User memasukkan list Title : "+listTitle);
		oList=new OneList(driver);
		oList.btnListTitle.sendKeys(listTitle);
		oList.OkSaveList();
	}
	
	@And("^User memasukkan listTitle2(.*)$")
	public void inputListTitle2(String listTitle2) {
		System.out.println("User memasukkan list Title : "+listTitle2);
		oList=new OneList(driver);
		oList.btnListTitle.sendKeys(listTitle2);
		oList.OkSaveList();
	}
	
	@And("^User memasukkan listTitle3(.*)$")
	public void inputListTitle3(String listTitle3) {
		System.out.println("User memasukkan list Title : "+listTitle3);
		oList=new OneList(driver);
		oList.btnListTitle.sendKeys(listTitle3);
		oList.OkSaveList();
	}
	
	@And("^User memasukkan listTitle4(.*)$")
	public void inputListTitle4(String listTitle4) {
		System.out.println("User memasukkan list Title : "+listTitle4);
		oList=new OneList(driver);
		oList.btnListTitle.sendKeys(listTitle4);
		oList.OkSaveList();
	}

	@And("^User memasukkan listTitle5(.*)$")
	public void inputListTitle5(String listTitle5) {
		System.out.println("User memasukkan list Title : "+listTitle5);
		oList=new OneList(driver);
		oList.btnListTitle.sendKeys(listTitle5);
		oList.OkSaveList();
	}
	
	@And("^User memasukkan isi list 1(.*)$")
	public void inputItemList1(String isiList1) {
		System.out.println("User memasukkan isi list 1 :"+isiList1);
		oList.addItemList.sendKeys(isiList1);
		oList.OkSaveItemList();
	}
	
	@And("^User memasukkan isi list 2(.*)$")
	public void inputItemList2(String isiList2) {
		System.out.println("User memasukkan isi list 2 :"+isiList2);
		oList.addItemList.sendKeys(isiList2);
		oList.OkSaveItemList();
	}
	
	@And("^User memasukkan isi list 3(.*)$")
	public void inputItemList3(String isiList3) {
		System.out.println("User memasukkan isi list 3 :"+isiList3);
		oList.addItemList.sendKeys(isiList3);
		oList.OkSaveItemList();
	}
	
	@And("^User memasukkan isi list 4(.*)$")
	public void inputItemList4(String isiList4) {
		System.out.println("User memasukkan isi list 4 :"+isiList4);
		oList.addItemList.sendKeys(isiList4);
		oList.OkSaveItemList();
	}
	
	@And("^User memasukkan isi list 5(.*)$")
	public void inputItemList5(String isiList5) {
		System.out.println("User memasukkan isi list 5 :"+isiList5);
		oList.addItemList.sendKeys(isiList5);
		oList.OkSaveItemList();
	}
	
	@And("^User memasukkan invalidTitle(.*)$")
	public void inputCancel(String listTitle) {
		System.out.println("User memasukkan list Title : "+listTitle);
		oList=new OneList(driver);
		oList.btnListTitle.sendKeys(listTitle);
	}
	
	@And("User menekan Cancel button")
	public void Cancel() throws Throwable {
		oList=new OneList(driver);
		oList.CancelList();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println("User menekan Cancel List");
	}
	
	@And("User menekan button OK")
	public void Empty() throws Throwable {
		oList=new OneList(driver);
		oList.OkSaveList();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println("User menekan Cancel List");
	}

	
	@Then("User mendapatkan List yang diinginkan")
	public void showList2() throws Throwable {
		System.out.println("User mendapatkan List yang diinginkan");
		String file = "<img src='file://" + screenShot() + "'height=\"450\" width=\"1017\"/>";
	}
	
	@Then("User kembali ke halaman utama")
	public void cancel() throws Throwable {
		System.out.println("User kembali ke halaman utama");
		String file = "<img src='file://" + screenShot() + "'height=\"450\" width=\"1017\"/>";
	}
	

}