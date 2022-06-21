package com.cognizant.savaari;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	// WebElements

	@FindBy(xpath = "//input[@id='fromCityList']")
	WebElement FromCity;

	@FindBy(xpath = "//input[@placeholder='Start typing city - e.g. Mysore']")
	WebElement ToCity;

	//@FindBy(xpath = "//*[@id='approot']/mat-sidenav-container/mat-sidenav-content/app-home/div[1]/div[2]/div[2]/app-outstation/div/div/div/label[2]")
	//WebElement OneWay;

	//@FindBy(xpath = "//input[contains(@class,'ng-tns-c75-7 form-control p-inputtext p-component ng-star-inserted')]")
	//WebElement PickUpTxt;

	//@FindBy(xpath = "//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[3]/div[1]/div/p-calendar[1]/span/div/div/div/div[2]/table/tbody/tr[5]/td[7]/span")
	//WebElement PickUpDate;

	@FindBy(xpath = "//*[@id='pickUpTime']")
	WebElement PickUpTime;

	@FindBy(xpath = "//button[@class='book-button btn']")
	WebElement SelectCar;

	@FindBy(xpath = "//span[@class='ng-star-inserted'][contains(.,'Ertiga')]")
	WebElement CarName;

	@FindBy(xpath = "//img[@height='49']")
	WebElement SavaariLogo;

	public PageObject() {
		new BrowserSelect();
		PageFactory.initElements(BrowserSelect.driver, this);
	}

}
