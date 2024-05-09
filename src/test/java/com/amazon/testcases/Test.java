package com.amazon.testcases;

import org.openqa.selenium.By;

import com.amazon.testbase.TestBase;

public class Test extends TestBase {

	@org.testng.annotations.Test
	public void m2() {
		String title = driver.getTitle();
		System.out.println("Title is : " + title);
		
//		driver.findElement(By.cssSelector("div#nav-xshop-container>div>a:nth-child(3)")).click();
//		driver.executeScript("window.scrollBy(0,500)");
	}

}
