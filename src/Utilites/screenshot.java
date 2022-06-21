package Utilites;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cognizant.savaari.*;




public class screenshot extends BrowserSelect  {
	
	FileInput fi = new FileInput();
	// Take screen shot and saving it in the desired position
	public void takeScreenshot(String filename) throws IOException {

		// Take screen shot and saving it in the desired position
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(fi.getData("screenshot_path") + filename + ".png"));

	}

}
