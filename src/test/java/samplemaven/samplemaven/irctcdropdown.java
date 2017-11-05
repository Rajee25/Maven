package samplemaven.samplemaven;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.Select;

	public class irctcdropdown {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String expected = "User Id is Available..Please go ahead with the Registration Process...";
			
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
			
			driver.findElement(By.xpath(".//*[@id='userRegistrationForm:userName']")).sendKeys("sadha643");
			
			driver.findElement(By.xpath(".//*[@id='userRegistrationForm:checkavail']")).click();
			
			String actual =driver.findElement(By.xpath(".//*[@id='userRegistrationForm:useravail']")).getText();
			
			if(expected.equalsIgnoreCase(actual))
				System.out.println(actual + "content matches");
			else 
				System.out.println(expected + "content doesn't matches");
			
			driver.findElement(By.xpath(".//*[@id='userRegistrationForm:password']")).sendKeys("sadhasivam");
			
			driver.findElement(By.xpath(".//*[@id='userRegistrationForm:confpasword']")).sendKeys("sadhasivam");
			
			
			WebElement ele = driver.findElement(By.xpath(".//*[@id='userRegistrationForm:securityQ']"));
			
			Select sel = new Select(ele);
			
			sel.selectByIndex(3);
			
			driver.findElement(By.xpath(".//*[@id='userRegistrationForm:securityAnswer']")).sendKeys("Rajini");
			
			WebElement ele2 = driver.findElement(By.xpath(".//*[@id='userRegistrationForm:prelan']"));
			
			Select sel2 = new Select(ele2);
			
			sel2.selectByValue("en");
			
		}

	}


}
