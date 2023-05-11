package seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontant {

	public static void main(String[] args) {
		
	    WebDriver driver= new FirefoxDriver();
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/p[3]/input")).click();
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/a/img")).click();

	//driver.findElement(By.partialLinkText("CRM/SFA")).click();
	//driver.findElement(By.id("Create Lead")).click();
	driver.findElement(By.xpath("//a[text()=\"Contacts\"]")).click();
	driver.findElement(By.xpath("//a[text()=\"Create Contact\"]")).click();
	WebElement firstname = driver.findElement((By.id("firstNameField")));
	firstname.sendKeys("Shiva");
	WebElement Lastname = driver.findElement((By.id("lastNameField")));
	Lastname.sendKeys("Shiva");
	WebElement firstnamelocal = driver.findElement((By.id("createContactForm_firstNameLocal")));
	firstnamelocal.sendKeys("Shiva1");
	WebElement Lastnamelocal = driver.findElement((By.id("createContactForm_lastNameLocal")));
	Lastnamelocal.sendKeys("Shiva2");
	WebElement Department = driver.findElement((By.id("createContactForm_departmentName")));
	Department.sendKeys("Mechanical");
	WebElement Description = driver.findElement((By.id("createContactForm_description")));
	Description.sendKeys("Im new to testleaf");
	WebElement Email = driver.findElement((By.id("createContactForm_primaryEmail")));
	Email.sendKeys("Im@cc.com");
	WebElement State = driver.findElement((By.xpath("(//select[@id=\"createContactForm_generalStateProvinceGeoId\"])/option[39]")));
	State.click();	
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.xpath("//a[text()=\"Edit\"]")).click();
    WebElement cl = driver.findElement(By.id("updateContactForm_description"));
    cl.click();
    cl.clear();
  driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("hEY HI");
	driver.findElement(By.name("submitButton")).click();
	String title = driver.getTitle();
    System.out.println(title);
    

    
    
    
	
	}

}
