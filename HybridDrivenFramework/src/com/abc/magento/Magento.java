package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Magento {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP ENVY\\Desktop\\Vemu\\HybridDrivenFramework\\src\\com\\abc\\utilities\\HybridDriven.properties");
        Properties p = new Properties();
		p.load(fis);
		
		String nurl = p.getProperty("url");
		String nmailid = p.getProperty("mailid");
		String npwd = p.getProperty("pwd");
		String nmyacct   = p.getProperty("myacct");
        String nusername = p.getProperty("username");
		String npassword = p.getProperty("password");
		String nlogin    = p.getProperty("login");
	    String nlogout   = p.getProperty("logout");
	    
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(nurl);
	    
	    driver.findElement(By.linkText(nmyacct)).click();
	    driver.findElement(By.id(nusername)).sendKeys(nmailid);
	    driver.findElement(By.id(npassword)).sendKeys(npwd);
	    driver.findElement(By.id(nlogin)).click();
	    driver.findElement(By.linkText(nlogout)).click();
	    
	    driver.close();
		
	}

}
