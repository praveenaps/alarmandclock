package alarm.clock;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class Alarm {
	

    public static WindowsDriver AlarmClockSession=null;
	
	public static void initialization() throws Exception
	{
	
        DesiredCapabilities appCapabilities = new DesiredCapabilities();
        appCapabilities.setCapability("app", "Microsoft.WindowsAlarms_8wekyb3d8bbwe!App");
        AlarmClockSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), appCapabilities);
       
     }
	
	public static void Addalarm() throws InterruptedException
	{
		Thread.sleep(2000);
		AlarmClockSession.findElementByName("Alarm").click();
		
		Thread.sleep(4000);
		AlarmClockSession.findElementByName("Add an alarm").click();
		
		AlarmClockSession.findElementByAccessibilityId("HourPicker").sendKeys("04");
	
		AlarmClockSession.findElementByAccessibilityId("MinutePicker").sendKeys("3");
	
		AlarmClockSession.findElementByName("Alarm name").clear();
		AlarmClockSession.findElementByName("Alarm name").sendKeys("test");

		AlarmClockSession.findElementByAccessibilityId("RepeatCheckBox").click();

		AlarmClockSession.findElementByName("Tuesday").click();
	
		AlarmClockSession.findElementByName("Save").click();
		Thread.sleep(4000);
		AlarmClockSession.findElementByAccessibilityId("EditAlarmsButton").click();
		System.out.println("test");
		

			AlarmClockSession.findElementByAccessibilityId("DeleteButton").click();

	
		
	}
}
