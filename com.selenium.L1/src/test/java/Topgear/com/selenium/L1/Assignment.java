package Topgear.com.selenium.L1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utils.ExcelUtils;

public class Assignment {

	WebDriver driver = null;
	static ExcelUtils excel;
	static String projectPath = System.getProperty("user.dir");

	@BeforeMethod
	void setUpMethod() {

		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/Resources/chromedriver.exe");
		driver = new ChromeDriver();

	}


	@Test void test1() {

		excel = new ExcelUtils(projectPath + "/excel/testdata.xlsx", "Sheet1");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();

		System.out.println(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.id("input-email")).sendKeys(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.name("password")).sendKeys(ExcelUtils.getCellDataString (1, 1));

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click(); 

		try { 
			Thread.sleep(10000); 
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}



	@Test void test2() throws InterruptedException, IOException {

		excel = new ExcelUtils(projectPath + "/excel/testdata.xlsx", "Sheet1"); //
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();

		System.out.println(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.id("input-email")).sendKeys(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.name("password")).sendKeys(ExcelUtils.getCellDataString(1, 1));
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();  
		Thread.sleep(2000);
		driver.findElement(By.linkText("Phones & PDAs (3)")).click(); 
		Select drp=new Select(driver.findElement(By.id("input-sort")));
		drp.selectByVisibleText("Price (High > Low)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[2]/button[3]")).click();
		Thread.sleep(3000); //js.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[2]/button[3]")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[2]/button[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("product comparison")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody[1]/tr[1]/td[2]/a/strong")).click(); //File
		FileWriter f=new FileWriter("text.txt");
		BufferedWriter b=new BufferedWriter(f); 
		WebElement w=driver.findElement(By.xpath("//*[@id=\"tab-description\"]/ul/li[5]"));
		String s=w.getText(); 
		b.write(s); 
		f.close();
		System.out.println(s);
		driver.findElement(By.xpath("//*[@id=\'button-cart\']")).click();
		driver.findElement(By.linkText("shopping cart")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click(); 
		driver.findElement(By.linkText("Order History")).click();
		driver.findElement(By.linkText("Newsletter")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();

		try { 
			
			Thread.sleep(5000); 
		
		}
		catch (InterruptedException e) {
			e.printStackTrace(); } }


	@Test
	void test3() throws InterruptedException
	{
		excel = new ExcelUtils(projectPath + "/excel/testdata.xlsx", "Sheet1");
		//	JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		System.out.println(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.id("input-email")).sendKeys(ExcelUtils.getCellDataString(1, 0));
		driver.findElement(By.name("password")).sendKeys(ExcelUtils.getCellDataString(1, 1));
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Canon");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();


	}

	@AfterMethod
	void tearDownMethod() {
		driver.close();
		// driver.quit();
	}

}
