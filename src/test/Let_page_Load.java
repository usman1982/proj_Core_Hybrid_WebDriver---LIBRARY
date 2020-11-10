package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Let_page_Load {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Usman\\SELENIUM\\chromedriver_win32_2.41\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://flipcart.com");

		// time for the page to load
		// submit form

	        Object result = ((JavascriptExecutor) driver).executeScript(
	        		"function pageloadingtime()"+
	        				"{"+
	        				"return 'Page has completely loaded'"+
	        				"}"+
	        		"return (window.onload=pageloadingtime());");
        
        System.out.println(result);
		
	}

}
