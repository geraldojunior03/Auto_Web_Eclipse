package core;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	private static WebDriver driver;
	public static String caminhoDownload = null;

	private DriverFactory() {
	}

	public static WebDriver getDriver() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
//		dc.setCapability("ignoreZoomSetting", true);

		if (driver == null) {
			switch (BaseTest.Browser) {
			case "FIREFOX":

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
								+ File.separator + "resources" + File.separator + "Driver" + File.separator
								+ "geckodriver.exe");
				FirefoxOptions optionsFox = new FirefoxOptions();
				optionsFox.addArguments("--lang=" + "pt-br");

				FirefoxProfile profile = new FirefoxProfile();

				profile.setPreference("browser.download.dir", caminhoDownload);
				profile.setPreference("browser.download.useDownloadDir", true);
				profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
						"application/pdf,application/x-pdf,application/octet-stream,application/vnd.ms-excel,text/html,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
				profile.setPreference("pdfjs.disabled", true);
				profile.setPreference("browser.download.folderList", 2);
				profile.setPreference("browser.download.manager.showWhenStarting", false);
				profile.setPreference("browser.download.panel.shown", false);

				optionsFox.setProfile(profile);

//				optionsFox.addArguments("--width=2048");
//				optionsFox.addArguments("--height=1024");
//				optionsFox.addArguments("--start-maximized");
//				optionsFox.addArguments("--start-fullscreen");
//				d = new FirefoxDriver(dc);

				driver = new FirefoxDriver(optionsFox);
				break;

			case "CHROME":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
								+ File.separator + "resources" + File.separator + "Driver" + File.separator
								+ "chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--lang=" + "pt-br");

				HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
				chromePrefs.put("download.default_directory", caminhoDownload);
				options.setExperimentalOption("prefs", chromePrefs);

				driver = new ChromeDriver(options);
				break;

			case "IE":
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
								+ File.separator + "resources" + File.separator + "Driver" + File.separator
								+ "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			}

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("document.body.style.zoom = '80%'");

		return driver;

	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
			BaseTest.contadorPassos = 1;
		}
	}

	public static Actions driverActions() {
		Actions action = new Actions(driver);

		return action;

	}

	public static WebDriver getDriverPopup() {
		if (driver == null) {
			switch (Propriedades.browser) {
			case FIREFOX:
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
								+ File.separator + "resources" + File.separator + "Driver" + File.separator
								+ "geckodriver.exe");
				driver = new FirefoxDriver();
				break;

			case CHROME:
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
								+ File.separator + "resources" + File.separator + "Driver" + File.separator
								+ "chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--lang=" + "pt-br");
				driver = new ChromeDriver(options);
				break;

			case IE:
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
								+ File.separator + "resources" + File.separator + "Driver" + File.separator
								+ "IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;
			}

		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		return driver;

	}

//	public static void zoomOut() {
//		WebElement zoomPage = driver.findElement(By.tagName("html"));
//		zoomPage.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
//	}

}
