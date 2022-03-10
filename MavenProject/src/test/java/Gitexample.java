import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitexample {
	
			public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://itera-qa.azurewebsites.net/home/automation");
			driver.manage().window().maximize();
			driver.findElement(By.id("name")).sendKeys("Tanvi");
			driver.findElement(By.id("phone")).sendKeys("123456");
			driver.findElement(By.id("email")).sendKeys("tanvi@gmail.com");
			driver.findElement(By.id("password")).sendKeys("tanvi123");
			Thread.sleep(3000);
			driver.findElement(By.name("submit")).click();
			
			driver.close();



		}

	}



