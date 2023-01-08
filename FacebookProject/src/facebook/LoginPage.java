package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\velocityclassnotes\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();
        WebElement userNameField=driver.findElement(By.xpath("//input[@id='email']"));
        userNameField.sendKeys("sandipwakade2022@gmail.com");
        WebElement passwordField=driver.findElement(By.xpath("//input[@id='pass']"));
        passwordField.sendKeys("Sandip@879636124008121995");
        WebElement logInButton=driver.findElement(By.xpath("//button[@id='loginbutton']"));
        logInButton.click();
        
	}

}
