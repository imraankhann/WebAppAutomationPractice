package utill;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class CommonUtil {
	static Logger log= Logger.getLogger(CommonUtil.class.getName());
	public static boolean implicitWait(long time){
		try {
			Driver.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			System.out.println("waited for "+time + " seconds implicitly" );
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean launchBrowser(String url){
		try {
			
			Driver.driver.get(url);
			Driver.driver.manage().window().maximize();
			log.info("Browser launched successfully.... ");

			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
