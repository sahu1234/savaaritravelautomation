package com.cognizant.savaari;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilites.screenshot;


public class TestNG_Trigger extends Data_Input {
	  screenshot sc = new screenshot();
	
	
	 @BeforeClass
	 public void f1() throws Exception
	 {
	  browser();
	 }
	 @Test
	 public void q1() throws Exception
	 {
	  citySelect();
	 }
	 @Test
	 public void q2() throws Exception
	 {

	 TripSelectDetails();
	 }
	 @Test
	 public void q3() throws Exception {
	 CarDetails();
	 }

	 @Test
	 public void q4() throws Exception
	 { 
	 Thread.sleep(2000);
	 sc.takeScreenshot("Result 1"); 
	 CarInfo();
	 sc.takeScreenshot("Input"); 
	 }

	 @AfterClass
	 public void q5() throws Exception
	{
	 close();
	}

	

}
