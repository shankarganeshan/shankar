package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		String driverpath = System.getProperty("webdriver.chrome.driver");
		System.out.print(driverpath);
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("shankarcom");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mynameshankar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rules@123");
		//WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Select dd = new Select(source);
		//dd.selectByVisibleText("Conference");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sam");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("peter");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("tester is testing this");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sam@yopmail.com");
		WebElement Province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select pp = new Select(Province);
		pp.selectByVisibleText("Alabama");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select mm = new Select(country);
		mm.selectByVisibleText("United States");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("NEWCompany");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).clear();
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Newsam");
		driver.findElement(By.className("smallSubmit")).click();
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		
		
		

}
}