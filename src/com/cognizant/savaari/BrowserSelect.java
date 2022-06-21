package com.cognizant.savaari;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelect {
	public static WebDriver driver;

	public void methodCall() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Driver Setup
		System.out.println("Select the Browser: 1.Chrome 2.Firefox 3.IE");
		int ch = Integer.parseInt(br.readLine());

		switch (ch) {

		case 1:
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\922462\\OneDrive - Cognizant\\Desktop\\Testing Imp\\Selenium Rahul shetty\\Eclipse workspace\\com.cognizant.savaari\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case 2:
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\922462\\OneDrive - Cognizant\\Desktop\\Testing Imp\\Selenium Rahul shetty\\Eclipse workspace\\com.cognizant.savaari\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case 3:
			System.setProperty("webdeiver.ie.driver",
					"C:\\Users\\922462\\OneDrive - Cognizant\\Desktop\\Testing Imp\\Selenium Rahul shetty\\Eclipse workspace\\com.cognizant.savaari\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("Please select from above browsers");
		}
	}

}
