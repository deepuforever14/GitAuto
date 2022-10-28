import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		//Indian
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
=======
	//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
>>>>>>> 150b45ce644cccd76faf789f8b51f2bbd05f2910
		//WebDriver driver = new ChromeDriver();
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.31.0-win32\\geckodriver.exe");
 	  WebDriver driver = new FirefoxDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com");
		driver.findElement(By.linkText("Basic Auth")).click();
		System.out.println(driver.getTitle());
<<<<<<< HEAD
		
=======
		driver.close();
>>>>>>> 150b45ce644cccd76faf789f8b51f2bbd05f2910
	}

}
