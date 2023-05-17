//import java.net.URL;
//import java.net.MalformedURLException;
////import java.io.File;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.remote.AutomationName;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//
//public class AppiumTest {
//
//	public static void main(String[] args) throws MalformedURLException {
//		// TODO Auto-generated method stub
//		
//		//define basic test requirements such as device name, app/apk location
//		DesiredCapabilities cap= new DesiredCapabilities();
//
////		File appDir = new File("src");
////
////		File app = new File(appDir,"app-debug.apk"); 
//		
//		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
//
//		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 30");
//
//		cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\sayed\\eclipse-workspace\\UAS_KPL\\src\\app-debug.apk");
//
//		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
// 
//		cap.setCapability (MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
//		
//		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/"), cap);
//
//		//AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//		
//		
//	}
//
//}


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest {

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        // TODO Auto-generated method stub

        DesiredCapabilities cap= new DesiredCapabilities();

        File appDir = new File("src/");

        File app = new File(appDir, "app-debug.apk");

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3_API_30");

        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/"), cap);

        return driver;
    }

}
