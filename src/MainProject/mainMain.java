package MainProject;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class mainMain {
	@Test
	public static void Login() {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver main=new ChromeDriver();
		String url = "https://rahulshettyacademy.com/loginpagePractise/";
		main.get(url);
		main.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		main.findElement(By.id("password")).sendKeys("learning");
		
		main.findElement(By.xpath("//span[@class='checkmark']")).click();
	
		Select role=new Select(main.findElement(By.xpath("//select[@class='form-control']")));
		role.selectByValue("stud");
		main.findElement(By.name("terms")).click();
		main.findElement(By.id("signInBtn")).click();
		
		WebDriverWait ob=new WebDriverWait(main, Duration.ofSeconds(1));
		ob.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Shop Name')]")));
	
	}
    @Test
    public static void AddToCart() {
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver main=new ChromeDriver();
    	main.get("https://rahulshettyacademy.com/angularpractice/shop");
    	//adding first item to the cart
    	main.findElement(By.xpath("//body/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[1]/div[1]/div[2]/button[1]")).click();
    	//adding second item to the cart
    	main.findElement(By.xpath("//body/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[2]/div[1]/div[2]/button[1]")).click();
    	//adding third item to the cart
    	main.findElement(By.xpath("//body/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[3]/div[1]/div[2]/button[1]/i[1]")).click();
    	//adding fourth item to the cart
    	main.findElement(By.xpath("//body/app-root[1]/app-shop[1]/div[1]/div[1]/div[2]/app-card-list[1]/app-card[4]/div[1]/div[2]/button[1]")).click();
    	//clicking on checkout button
    	main.findElement(By.xpath("//body/app-root[1]/app-shop[1]/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
    	//removing first item from the cart
    	main.findElement(By.xpath("//tbody/tr[1]/td[5]/button[1]")).click();
    	//checkout button
        main.findElement(By.xpath("//tbody/tr[5]/td[5]/button[1]")).click();
        //enter the location
        main.findElement(By.xpath("//input[@id='country']")).sendKeys("Jhapa Damak");
        //clicking on terms and conditions
        main.findElement(By.xpath("//body/app-root[1]/app-shop[1]/div[1]/app-checkout[1]/div[1]/div[2]/label[1]")).click();
        //finally purchasing the given item
        main.findElement(By.xpath("//body/app-root[1]/app-shop[1]/div[1]/app-checkout[1]/div[1]/form[1]/input[1]")).click();
        
        WebDriverWait ot =new WebDriverWait(main, Duration.ofSeconds(10));
        ot.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/app-root[1]/app-shop[1]/div[1]/app-checkout[1]/div[2]/div[1]")));

 
    	
    }
    	
    }

