package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKMMilesEsame {

	public double convertKMMiles() {
		String ccq = "55";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\adria\\Universita\\ISPW\\PROGETTO\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.metric-conversions.org/it/lunghezza/tabella-da-miglia-terrestri-a-chilometri.htm");
		
		driver.findElement(By.xpath("//*[@id=\"startval\"]")).sendKeys(ccq);
		WebElement s1 = driver.findElement(By.xpath("//*[@id=\"innerConversionTable\"]/div[2]/table/tbody/tr[1]/td[2]"));
		WebElement s2 = driver.findElement(By.xpath("//*[@id=\"innerConversionTable\"]/div[3]/table/tbody/tr[1]/td[2]"));

		String f1[] = s1.getText().split("k");
		String f2[] = s2.getText().split("k");
	
		
		double d1 = Double.parseDouble(f1[0]);
		double d2 = Double.parseDouble(f2[0]);
		
		double r1 = (20/d1)*60;
		double r2 = (20/d2)*60;
		
		double r3 = r1-r2;
		return r3;
	}
	
}
