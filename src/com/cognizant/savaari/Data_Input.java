package com.cognizant.savaari;

import com.cognizant.savaari.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Data_Input extends BrowserSelect {
	// browserSelection
	public void browser() throws Exception {
		BrowserSelect ob = new BrowserSelect();
		ob.methodCall();

		driver.get("https://www.savaari.com/");
		driver.manage().window().maximize();

	}

	// citySelectFromandTo
	public void citySelect() throws InterruptedException {

		new PageObject().FromCity.sendKeys("Coimbatore");
		Thread.sleep(1000);
		new PageObject().FromCity.sendKeys(Keys.ENTER);
		new PageObject().ToCity.sendKeys("Chennai, Tamil Nadu");
		Thread.sleep(1000);
		new PageObject().FromCity.sendKeys(Keys.ENTER);
	}

	// TripDetails
	public void TripSelectDetails() throws InterruptedException {
		//new PageObject().OneWay.click();
		new PageObject().ToCity.sendKeys("Chennai, Tamil Nadu");
		Thread.sleep(1000);
		new PageObject().ToCity.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		//new PageObject().PickUpTxt.click();
		//new PageObject().PickUpDate.click();

		Select time = new Select(new PageObject().PickUpTime);
		time.selectByIndex(4);

	}

	// CarButtonClick
	public void CarDetails() throws InterruptedException {
		new PageObject().SelectCar.click();

	}

	// CarInfo
	public void CarInfo() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(new PageObject().CarName));
		String[] carname = new PageObject().CarName.getText().split("\n");
		System.out.println("Name of the Second Car is:" + carname[0]);
		new PageObject().SavaariLogo.click();

	}

	// BrowserTeardown
	public void close() {

		driver.quit();
	}

}
