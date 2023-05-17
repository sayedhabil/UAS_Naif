import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


import java.net.MalformedURLException;

public class Test extends AppiumTest {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        
        String value = "0";

        driver.findElementById("com.example.volumebalok:id/edt_length").sendKeys("5");
        driver.findElementById("com.example.volumebalok:id/edt_width").sendKeys("2");
        driver.findElementById("com.example.volumebalok:id/edt_height").sendKeys("3");
        driver.findElementById("com.example.volumebalok:id/btn_calculate").click();
        
        
        
        for (int i = 1; i <= 2; i++) {
            driver.findElementById("com.example.volumebalok:id/edt_length").sendKeys(value);
            driver.findElementById("com.example.volumebalok:id/edt_width").sendKeys(value);
            driver.findElementById("com.example.volumebalok:id/edt_height").sendKeys(value);
            driver.findElementById("com.example.volumebalok:id/btn_calculate").click();
        }

    }
}