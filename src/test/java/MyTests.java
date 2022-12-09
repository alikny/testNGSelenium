import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class MyTests {


    WebDriver driver = Driver.get();
    String url = "http://www.seleniumframework.com/Practiceform/";


    @Test
    void test() throws InterruptedException {
        Page page = new Page();
        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");
        PropertyConfigurator.configure(prop);

        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String text = driver.findElement(By.xpath("//*[.='Find me I have nothing in me!!']")).getText();
        System.out.println("text = " + text);
        Thread.sleep(5000);


    }

    @AfterMethod
    void after() {
        driver.quit();
    }
}
