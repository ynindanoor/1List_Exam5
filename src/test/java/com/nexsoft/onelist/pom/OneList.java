package com.nexsoft.onelist.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class OneList {
private AndroidDriver driver;	
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddList")
	public WebElement btnAddList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	public WebElement btnListTitle;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEditList")
	public WebElement btnOkAddList;

	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelEditList")
	public WebElement btnCancel;
	

	@AndroidFindBy(id = "com.lolo.io.onelist:id/moreOptionsCursor")
	public WebElement btnMore;

	@AndroidFindBy(id = "com.lolo.io.onelist:id/addItemEditText")
	public WebElement addItemList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validate")
	public WebElement btnOkAddItem;
	
	public OneList(AndroidDriver driver) {
		
		setup(driver);	
	}
	

	public void setup(AndroidDriver driver){
		this.driver = driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	public void OkSaveList() {
		btnOkAddList.click();
	}

	public void OkSaveItemList() {
		btnOkAddItem.click();
	}
	
	public void addList() {
		btnAddList.click();
	}
	
	public void CancelList() {
		btnCancel.click();
	}

}
