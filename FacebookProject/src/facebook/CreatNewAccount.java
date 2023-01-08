package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatNewAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\velocityclassnotes\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		createNewAccount.click();
		Thread.sleep(3000);
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("SANDIP");
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("WAKADE");
		WebElement emailOrMobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		emailOrMobile.sendKeys("sandipwakadeproject@gmail.com");
		Thread.sleep(2000);
		WebElement reEnteremailOrMobile=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		reEnteremailOrMobile.sendKeys("sandipwakadeproject@gmail.com");
		WebElement newPassword=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		newPassword.sendKeys("SandipWakadeProject");
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select d=new Select(day);
		d.selectByIndex(7);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select m=new Select(month);
		m.selectByValue("12");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select y=new Select(year);
		y.selectByVisibleText("1995"); 
		WebElement femaleButton=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		WebElement maleButton=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		WebElement customButton=driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		WebElement pronoun=driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		femaleButton.click();
		System.out.println("// *****IsDisplayed()*****//");               
		Boolean resultForFemaleIsDisplayed=pronoun.isDisplayed();
		if(resultForFemaleIsDisplayed==true)
		{
		System.out.println("Pronoun is displed for Female");
		}
		else
		{
			System.out.println("Pronoun is not displed for Female");
		}
		customButton.click();
		Boolean resultForCustom=pronoun.isDisplayed();
		if(resultForCustom==true)
		{
		System.out.println("Pronoun is displed for Custom");
		}
		else
		{
			System.out.println("Pronoun is not displed for Custom");
		}
		maleButton.click();
		System.out.println("// *****IsSelected()*****//");
		Boolean resultForCustomIsSelected=customButton.isSelected();
		if(resultForCustomIsSelected==true)
		{
			System.out.println("Custom Radio Button is Selected");
		}
		else
		{
			System.out.println("Custom Radio Button is not selected");
		}
		Boolean resultForMaleIsSelected=maleButton.isSelected();
		if(resultForMaleIsSelected==true)
		{
			System.out.println("Male Radio Button is Selected");
		}
		else
		{
			System.out.println("Male Radio Button is not selected");
		}
		System.out.println("// *****IsEnabled()*****//");
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement userId=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		WebElement password=driver.findElement(By.xpath("//input[@aria-label='Password']"));
		WebElement logIn=driver.findElement(By.xpath("//button[@type='submit']"));
		Boolean resultForLogInIsEnabled=logIn.isEnabled();
		if(resultForLogInIsEnabled==true)
		{
			System.out.println("LogIn Button is Enabled");
		}
		else
		{
			System.out.println("LogIn Button is Disabled");
		}
		userId.sendKeys("SandipWakade");
		password.sendKeys("SandipWakade@123");
		Boolean resultForLogInIsEnabled1=logIn.isEnabled();
		if(resultForLogInIsEnabled1==true)
		{
			System.out.println("LogIn Button after entering id and password is Enabled");
		}
		else
		{
			System.out.println("LogIn Button after entering id and password is Disabled");
		}
		driver.get("https://www.facebook.com/login/");
        WebElement userNameField=driver.findElement(By.xpath("//input[@id='email']"));
        WebElement passwordField=driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement logInButton=driver.findElement(By.xpath("//button[@id='loginbutton']"));
        String value=logInButton.getText();
        if(value.equals("Log in"))
        {
        System.out.println("Log In spelling is correct");	
        }
        else
        {
        	System.out.println("Log In spelling is incorrect");
        }
        String value1=userNameField.getAttribute("aria-label");
        if(value1.equals("Email address or phone number"))
        		{
        		System.out.println("UserId spelling is correct");
        		}
        else
        {
        	System.out.println("UserId spelling is wrong");
        }
		
		
	}

}
