import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignIn {

	@Test
	public void signIn() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage ob = new LandingPage(driver);
		
		ob.SignIn("Sruthy","Sruthy123");

	}

}
