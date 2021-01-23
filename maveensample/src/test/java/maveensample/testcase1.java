package maveensample;





import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class testcase1  {

@BeforeTest

	public void setup() throws MalformedURLException  {
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("deviceName","emulator-5554" );
	cap.setCapability("platformName","Android");
	cap.setCapability("app","com.innovapptive.mworkorder");
	cap.setCapability("automationName","UiAutomator2");
	URL url= new URL("https://127.0.0.1.4723/wd/hub");
	AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url,cap);
	
	
	
	}
	@AfterTest
 
	public void close() {
		
		System.out.println("emulator is opened");
	}
	
	public static void main(String[] args) throws MalformedURLException {
	
	testcase1  obj= new testcase1 ();
	obj.close();
	obj.setup();
	}
}
