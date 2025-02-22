package Com.protrainingtech.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
	public static WebDriver driver;
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\happy\\protrainingtech\\automation\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
    }
}
