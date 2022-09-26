package fkpack;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon
{
	public static void main(String[] args) throws InterruptedException{
	//launch the browser	
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\FAIZAN\\Downloads\\geckodriver-v0.30.0-win32\\geckodriver.exe");
	 WebDriver d=new FirefoxDriver();
	 d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 //load the web page
	 d.get("https://www.amazon.in/");
	 //click on home sign in button
     d.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
     //enter the email or phone 
     d.findElement(By.name("email")).sendKeys("+917721838897");
     //click on continue button
     d.findElement(By.id("continue")).click();
     //enter the password
     d.findElement(By.id("ap_password")).sendKeys("Khan@112");
     //click on submit button
     d.findElement(By.id("signInSubmit")).click();
     //click on clothes option which is on home page
	 d.findElement(By.linkText("Clothing")).click();
	 //click on T-shrt and polo which is situated left site of page
	 d.findElement(By.linkText("T-Shirts & Polos")).click();
	 //select and click on t-shirt which you want i.e.Levi's Men t-shirt
	 d.findElement(By.linkText("Levi's Men T-Shirt")).click();
	 Thread.sleep(2000);
	//drop down
			Select dd=new Select(d.findElement(By.xpath("//select[@id='native_dropdown_selected_size_name']")));
			dd.selectByIndex(3);
			//Thread.sleep(1000);
     //click on add to cart
	 d.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
}
}