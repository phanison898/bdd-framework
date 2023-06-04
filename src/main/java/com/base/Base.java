package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	public WebDriver getBrowser(String browserName) {
		WebDriver driver = null;

		switch (browserName.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			driver = new ChromeDriver();
			break;
		}

		return driver;
	}

	public WebDriver getDriver() {
		return driver.get();
	}

}
