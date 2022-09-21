import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn {
	
	 @Test(description="user can signin with valid username and password")
	    public void  signIn() {
	        System.setProperty("webdriver.chrome.driver","C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");
	        LandingPage ob= new LandingPage(driver);
	        ob.SignIn("Sruthy","Sruthy2000");
	        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/index.html");
	    }
	    
	    @Test(description="user cant signin by leaving username field empty")
	    public void  Signinvalid() {
	        System.setProperty("webdriver.chrome.driver","C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");
	        LandingPage ob= new LandingPage(driver);
	        ob.SignIn(" ","Sruthy2000");
	        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
	        }
	    
	    @Test(description="user cant signin by leaving both username and password field empty" )
	    public void  Signinemptyvalid() {
	        System.setProperty("webdriver.chrome.driver","C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");
	        LandingPage ob= new LandingPage(driver);
	        ob.SignIn(" "," ");
	        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
	        }
	    
	    @Test(description="user cant signin by entering less than 3 characters in username")
	    public void  Signinpominavalid() {
	        System.setProperty("webdriver.chrome.driver","C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");
	        LandingPage ob= new LandingPage(driver);
	        ob.SignIn("Sr","Sruthy2000 ");
	        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
	        }
	    
	    @Test(description="user cant signin by entering more than 20 characters in username")
	    public void  Signinusermoretwentyinavalid() {
	        System.setProperty("webdriver.chrome.driver","C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");
	        LandingPage ob= new LandingPage(driver);
	        ob.SignIn("Sruthylathikanandasl","Sruthy2000 ");
	        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
	        }
	    
	    
	    @Test(description="user cant signin by entering special characters in password")
	    public void  Signinpassspecialinavalid() {
	        System.setProperty("webdriver.chrome.driver","C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://mobileworld.banyanpro.com/");
	        LandingPage ob= new LandingPage(driver);
	        ob.SignIn("Sruthy","Sruthy!@");
	        Assert.assertEquals(driver.getCurrentUrl(),"https://mobileworld.banyanpro.com/sign.html");
	    }

}
