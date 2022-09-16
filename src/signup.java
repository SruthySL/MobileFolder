import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup {
	@Test
	public void signUpTest() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup = new LandingPage(driver);
		sup.SignUp("Sruthy","S L","sruthysl@gmail.com","Sruthy123","11/19/2000","9447995670","This is mobile world");
		
		


	}

}
