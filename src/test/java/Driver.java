import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static WebDriver get(){
        System.out.println("Bu satir sadece master da var");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        System.out.println("yeni line");
        return driver;
    }
}
