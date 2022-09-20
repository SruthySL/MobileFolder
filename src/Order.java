import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



	public class Order {

	@Test(description="user can order by entering valid details in order page")
	public void demo() throws InterruptedException{
		// TODO Auto-generated method stub        
			System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://mobileworld.banyanpro.com/");
			LandingPage sup=new LandingPage(driver);
			sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
			driver.quit();
			
		}
	
	@Test(description="user cannot order by entering First Name below 3 characters ")
	public void demo1() throws InterruptedException{
			// TODO Auto-generated method stub        
			System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://mobileworld.banyanpro.com/");
			LandingPage sup=new LandingPage (driver);
			sup.Order("sr","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
			String actual="driver.getCurrentURL";
			String expected="https://mobileworld.banyanpro.com/order.html";
			Assert.assertEquals(actual, expected);
			driver.quit();
			
	}
		
	
	@Test(description="user cannot order by entering First Name above 20 characters")
	public void demo2() throws InterruptedException{
		// TODO Auto-generated method stub     
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup=new LandingPage (driver);
		sup.Order("Sruthylathikakumariss","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
		String actual="driver.getCurrentURL";
		String expected="https://mobileworld.banyanpro.com/order.html";
		Assert.assertEquals(actual, expected);
		driver.quit();
		}
	
	
	@Test(description="user cannot order by without entering First Name")
	public void demo3() throws InterruptedException{
		// TODO Auto-generated method stub     
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup=new LandingPage (driver);
		sup.Order(" ","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
		String actual="driver.getCurrentURL";
		String expected="https://mobileworld.banyanpro.com/order.html";
		Assert.assertEquals(actual, expected);
		driver.quit();
		}
	
	@Test(description="user cannot order by entering only with numericals in First Name")
	public void demo4() throws InterruptedException{
		// TODO Auto-generated method stub     
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup=new LandingPage (driver);
		sup.Order("12344567","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
		String actual="driver.getCurrentURL";
		String expected="https://mobileworld.banyanpro.com/order.html";
		Assert.assertEquals(actual, expected);
		driver.quit();
		}
	
	@Test(description="user cannot order by entering only with special characters in First Name")
	public void demo5() throws InterruptedException{
		// TODO Auto-generated method stub     
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup=new LandingPage (driver);
		sup.Order("@#!$%^*","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
		String actual="driver.getCurrentURL";
		String expected="https://mobileworld.banyanpro.com/order.html";
		Assert.assertEquals(actual, expected);
		driver.quit();
}
	
	@Test(description="user cannot order by entering combination of alphabets, numericals and special characters in First Name")
	public void demo6() throws InterruptedException{
		// TODO Auto-generated method stub     
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup=new LandingPage (driver);
		sup.Order("Sruthy@","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
		String actual="driver.getCurrentURL";
		String expected="https://mobileworld.banyanpro.com/order.html";
		Assert.assertEquals(actual, expected);
		driver.quit();
	}
	
	@Test(description="user cannot order by entering Last Name below 3 charcters")
	public void demo7() throws InterruptedException{
		// TODO Auto-generated method stub     
		System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com/");
		LandingPage sup=new LandingPage (driver);
		sup.Order("Sruthy","SL","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
		String actual="driver.getCurrentURL";
		String expected="https://mobileworld.banyanpro.com/order.html";
		Assert.assertEquals(actual, expected);
		driver.quit();
	}
	@Test(description="user cannot order by entering Last Name above 20 characters")
	public void demo8() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathikakumarigopakumar","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	     String expected="https://mobileworld.banyanpro.com/order.html";
	     Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by without entering Last Name")
	public void demo9() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy"," ","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	     String expected="https://mobileworld.banyanpro.com/order.html";
	     Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering only with numericals in Last Name")
	public void demo10() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","1234556","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	     String expected="https://mobileworld.banyanpro.com/order.html";
	     Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering only with special characters in Last Name")
	public void demo11() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","@#!$%^&*","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	     String expected="https://mobileworld.banyanpro.com/order.html";
	     Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering combination of alphabets, numericals and special characters in Last Name")
	public void demo12() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika@12","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	     String expected="https://mobileworld.banyanpro.com/order.html";
	     Assert.assertEquals(actual, expected);
	     driver.quit();
	}


	@Test(description="user cannot order by entering invalid email id")
	public void demo13() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abcgmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	     }

	@Test(description="user cannot order by without entering email id")
	public void demo14() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika"," ","Sruthy123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	}


	@Test(description="user cannot order by entering special characters in password")
	public void demo15() throws InterruptedException{
	// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy12@!#","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	     }
	
	@Test(description="user cannot order by entering password below 3 alphanumericals")
	public void demo16() throws InterruptedException{
	// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","S1","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering password above 10 alphanumericals")
	public void demo17() throws InterruptedException{
	// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthylathika123","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot signup by entering password only with alphabets")
	public void demo18() throws InterruptedException{
	// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot signup by entering password only with numericals")
	public void demo19() throws InterruptedException{
	// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","2345678","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot signup by entering without password")
	public void demo20() throws InterruptedException{
	// TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com"," ","1234567890","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	        String expected="https://mobileworld.banyanpro.com/order.html";
	        Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot register by entering 9 numericals in the mobile number")
	public void demo21() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","123456789","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}



	@Test(description="user cannot order by entering alphabets in the mobile number")
	public void demo22() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","123456789e","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}



	@Test(description="user cannot register by without entering mobile number")
	public void demo23() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123"," ","115","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering special characters in the address field1")
	public void demo24() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","!@##$$%%^","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}
	
	@Test(description="user cannot register by without entering address field1")
	public void demo25() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123"," 9876543210"," ","Shri Dhatrik Pg","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering special characters in the address field2")
	public void demo26() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","!@#$%^&*","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot register by without entering address field2")
	public void demo27() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123"," 9876543210","115"," ","Bangalore","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering special characters in the city text field")
	public void demo28() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","!@#$%^&*","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering invalid city name in the city text field")
	public void demo29() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","trivandrum","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}
	
	@Test(description="user cannot order by entering numericals in the city text field")
	public void demo30() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","12345678","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering without city name in the city text field")
	public void demo31() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg"," ","540065","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering alphabets in the zip code field")
	public void demo32() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","Trivandrum","mmkhgbji","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering special characters in the zip code field")
	public void demo33() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","bangalore","!@#$%^&*","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering without zip code in the zip code field")
	public void demo34() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","bangalore"," ","1");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}

	@Test(description="user cannot order by entering alphabets in number of times")
	public void demo35() throws InterruptedException{
	     // TODO Auto-generated method stub
	     System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	     WebDriver driver= new ChromeDriver();
	     driver.get("https://mobileworld.banyanpro.com/");
	     LandingPage sup=new LandingPage (driver);
	     sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","bangalore","540065","nmkhgfhj");
	     String actual="driver.getCurrentURL";
	         String expected="https://mobileworld.banyanpro.com/order.html";
	         Assert.assertEquals(actual, expected);
	     driver.quit();
	}
	     
	     @Test(description="user cannot order by entering special characters in number of times")
	     public void demo36() throws InterruptedException{
	         // TODO Auto-generated method stub
	         System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	         WebDriver driver= new ChromeDriver();
	         driver.get("https://mobileworld.banyanpro.com/");
	         LandingPage sup=new LandingPage (driver);
	         sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","bangalore","540065","!@#$%^%^");
	         String actual="driver.getCurrentURL";
	             String expected="https://mobileworld.banyanpro.com/order.html";
	             Assert.assertEquals(actual, expected);
	         driver.quit();
	     }
	
	     @Test(description="user cannot order by without entering in number of times")
	     public void demo37() throws InterruptedException{
	         // TODO Auto-generated method stub
	         System.setProperty("webdriver.chrome.driver", "C:/Users/sruthy.sl/Downloads/chromedriver_win32/chromedriver.exe");
	         WebDriver driver= new ChromeDriver();
	         driver.get("https://mobileworld.banyanpro.com/");
	         LandingPage sup=new LandingPage (driver);
	         sup.Order("Sruthy","Lathika","abc@gmail.com","Sruthy123","1234567890","115","Shri Dhatrik Pg","bangalore","540065"," ");
	         String actual="driver.getCurrentURL";
	             String expected="https://mobileworld.banyanpro.com/order.html";
	             Assert.assertEquals(actual, expected);
	         driver.quit();
	     } 
	     
	
	}



