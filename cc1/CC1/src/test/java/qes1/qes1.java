package qes1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class qes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement Uname = driver.findElement(By.id("user-name"));
		Uname.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebElement Lbutton = driver.findElement(By.id("login-button"));
		Lbutton.click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String cart = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();       
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        String prod = "Sauce Labs Backpack";       
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();       
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Deepak");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("PM");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("638453");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();        
        System.out.println("Product Name: " 
        + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Price: " 
        + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
       
        
    } 
}