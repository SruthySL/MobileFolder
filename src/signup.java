import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;


		public class SignUp {
			@Test(description="user can register by entering valid details in signup page")
	    public void demo() throws InterruptedException{
			// TODO Auto-generated method stub        
		    System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://mobileworld.banyanpro.com/");
			LandingPage sup=new LandingPage (driver);
			sup.SignUp("Sruthy","S L","sruthy@gmail.com","sruthy123","11/19/2000","9447995670","hi");
			driver.quit();
		}
		
		
		@Test(description="user cant register by entering invalid username")
		public void demo1() throws InterruptedException{
			 // TODO Auto-generated method stub           
			 System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
			 WebDriver driver= new ChromeDriver();
			 driver.get("https://mobileworld.banyanpro.com/");
			 LandingPage sup=new LandingPage (driver);
			 sup.SignUp("Sruhy","S L ","sruthy@gmail.com","sruthy123","11/19/2000","9447995670","Hello");
			 String actual="driver.getCurrentURL";
			 String expected="https://mobileworld.banyanpro.com/signup.html";
			 Assert.assertEquals(actual, expected);
			 driver.quit();
		 }


		
		@Test(description="user cant register by entering invalid email id")
		public void demo2() throws InterruptedException{
			 // TODO Auto-generated method stub        
			 System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
			 WebDriver driver= new ChromeDriver();
			 driver.get("https://mobileworld.banyanpro.com/");
			 LandingPage sup=new LandingPage (driver);
			 sup.SignUp("Sruthy","S L","sruthygmail","sruthy123","11/19/2000","9447995670","Hi");
			 String actual="driver.getCurrentURL";
			 String expected="https://mobileworld.banyanpro.com/signup.html";
			 Assert.assertEquals(actual, expected);
			 driver.quit();
			 }
		
		@Test(description="user cant signup by entering special characters in password")
		public void demo3() throws InterruptedException{
			// TODO Auto-generated method stub        
			System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://mobileworld.banyanpro.com/");
			LandingPage sup=new LandingPage (driver);
			sup.SignUp("Sruthy","S L","sruthy@gmail.com","sruthy!@12","11/19/2000","9447995670","Hi");
			String actual="driver.getCurrentURL";
			String expected="https://mobileworld.banyanpro.com/signup.html";
			Assert.assertEquals(actual, expected);
			driver.quit();
		}
		
		@Test(description="user cant register by entering invalid date of birth")
		public void demo4() throws InterruptedException{
			// TODO Auto-generated method stub    
			System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://mobileworld.banyanpro.com/");
			LandingPage sup=new LandingPage (driver);
			sup.SignUp("Sruthy","S L","sruthy@gmail.com","sruthy123","09/08/2022","9447995670","Hi");
			String actual="driver.getCurrentURL";
			String expected="https://mobileworld.banyanpro.com/signup.html";
			Assert.assertEquals(actual, expected);
			driver.quit();
		}}

