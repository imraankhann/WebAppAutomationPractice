package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	 static Logger log = Logger.getLogger(TestBase.class.getName());

	public static Properties Repository= new Properties();
	public File f;
	public FileInputStream fis;
	public WebDriver driver;
	
	public void init() throws IOException{

		loadPropertiesFile();
		log.info("Loaded browser and url from config property file.... ");
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty("url"));
	}
	
	public void loadPropertiesFile() throws IOException{

		 String filePath=System.getProperty("user.dir")+"/src/main/java/config/config.properties";

		f=new File(filePath);
		//Repository.load(fis);Properties properties = new Properties();
		try
		{
			Repository.load(new FileInputStream(filePath));
		}
		catch(IOException e)
		{

		}
		String url="";
		String browser="";

		int i = 0;
		for(String key : Repository.stringPropertyNames())
		{

			String value = Repository.getProperty(key);
			/*if(key.equalsIgnoreCase("browser"))
			{
				browser= value;
			}

			if(key.equalsIgnoreCase("url"))
			{
				url=value;
			}*/
			i++;
		}

		//selectBrowser(browser);
	}
	
	
	public WebDriver selectBrowser(String browser){
		log.info("Selected firefox browser... ");
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else if(browser.equalsIgnoreCase("chrome")){
				System.out.println("Chrome browser...");
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\com\\compname\\BrowserDrivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				return driver;
				
			}
		return null;
		
		}
	}


