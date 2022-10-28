import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fileupload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		//chromePrefs.put("profile.default_content_settings.popups", 0);
		//chromePrefs.put("download.default_directory", downloadFilepath);
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sodapdf.com/txt-to-pdf/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector(".btn-choose")).click();
		Runtime.getRuntime().exec("D:\\AutoIT\\Autoit-selenium.exe");
		// WebDriverWait wait = new WebDriverWait(driver,10);
        File f=new File("C:\\Users\\dilip\\Downloads\\sodapdf-converted.pdf");
        if(f.exists())
        {
        	System.out.println("file found");
        	driver.close();
        }
	}

}
