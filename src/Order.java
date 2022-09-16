import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Order {

	@Test
	public void order(){
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage ordr = new LandingPage(driver);
		
		ordr.Order("Sruthy","S L","sruthysl@gmail.com", "sruthy123", "8978675645","Sai shiva homes", "Nagawara","Bangalore", "5464789654", "1", "3");

	}

}