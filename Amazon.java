package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//Manage Timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Using findElements here to retrieve multiple elements and add to a list
		List<WebElement> allPrice =driver.findElements(By.className("a-price-whole"));
		System.out.println(allPrice.size());
		
		//Creating empty arraylist
		List<Integer> pricevalue = new ArrayList<Integer>();
		for(int i=0; i<allPrice.size();i++)
		{
			System.out.println(allPrice.get(i).getText());
			String priceStr = allPrice.get(i).getText().replace(",","");
			int price = Integer.parseInt(priceStr);
			pricevalue.add(price);
		}
		Collections.sort(pricevalue);
		System.out.println(pricevalue.get(0));
		//System.out.println(pricevalue.get(size()-1));
	}

}
