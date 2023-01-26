package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public Driver(){
        useDriver();
    }

    public Driver(WebDriver driver, String direccionDriver) {
        this.driver = driver;
        this.direccionDriver = direccionDriver;
    }

    WebDriver driver;
     String direccionDriver = "C:/Users/HP/IdeaProjects/Cucumber_Selenio/src/main/resources/drivers/chromedriver.exe";


    public void useDriver() {
//    String projectPath = System.getProperty("user.dir");
//    System.out.println("project path is: "+ projectPath);

        System.setProperty("webdriver.chrome.driver", direccionDriver);

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
}
