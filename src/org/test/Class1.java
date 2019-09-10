package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Home-PC\\eclipse-workspace\\JavaProject1\\drivers\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/");
     
}
}