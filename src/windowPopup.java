import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Indian
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		  System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.31.0-win32\\geckodriver.exe");
 	  WebDriver driver = new FirefoxDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com");
		driver.findElement(By.linkText("Basic Auth")).click();
		System.out.println(driver.getTitle());
		
	}

}
