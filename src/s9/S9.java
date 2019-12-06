package s9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\S1\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();

		a.get("https://www.irctc.co.in/nget/train-search");

		WebElement b = a.findElement(By.className("ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
		b.sendKeys("Madurai");

		WebElement c = a.findElement(By.className("ng-tns-c14-6 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted"));
		c.sendKeys("Chennai");

	}
	

}
