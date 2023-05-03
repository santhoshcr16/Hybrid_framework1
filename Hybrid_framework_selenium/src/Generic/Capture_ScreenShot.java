package Generic;

import java.io.File;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_ScreenShot
{
public static void getScreenShot(WebDriver driver)
{
	try {
		String path="./ScreenShot/";
		Date d = new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		TakesScreenshot tss= (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File(path+d2+".png");
		FileHandler.copy(src, dst);
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
