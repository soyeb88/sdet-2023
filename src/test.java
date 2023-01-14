import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	static String url = "http://98.15.45.185:9090/"; 
	
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/soyebahmed/Desktop/IT-Sector/QA-2022/Java-QA/Project-1/resource/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}

}
