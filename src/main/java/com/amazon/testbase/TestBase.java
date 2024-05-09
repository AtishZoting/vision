package com.amazon.testbase;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestBase {

	public static RemoteWebDriver driver;

	public static RemoteWebDriver getDriver() {
		return driver;
	}

	@Parameters("browser_name")
	@BeforeMethod
	public void browserOpen(String browserName) throws IOException {
		// driver = new FirefoxDriver();
		if (browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		driver.navigate().refresh();
	}

}
