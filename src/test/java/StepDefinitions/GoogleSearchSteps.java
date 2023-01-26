//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.json.JsonOutput;
//
//import java.sql.Time;
//import java.util.concurrent.TimeUnit;
//
//public class GoogleSearchSteps {
//
//    WebDriver driver =null;
//
//    String direccionDriver = "C:/Users/HP/IdeaProjects/Cucumber_Selenio/src/main/resources/drivers/chromedriver.exe";
//
//
//    @Given("browser is open")
//    public void browser_is_open() {
////    String projectPath = System.getProperty("user.dir");
////    System.out.println("project path is: "+ projectPath);
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("browser is open1 ");
//        System.setProperty("webdriver.chrome.driver", direccionDriver);
//
//        driver = new ChromeDriver();
////        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
////        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//
//        driver.manage().window().maximize();
//
//    }
//
//    @Given("user is on google search page")
//    public void user_is_on_google_search_page() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("browser is open2");
//    driver.navigate().to("https://google.com");
//    }
//
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("browser is open3");
//        driver.findElement(By.name("q")).sendKeys("platanos");
//
//    }
//
//    @When("hits enter")
//    public void hits_enter() {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("browser is open4");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//    }
//
//    @Then("user is navigated to search result")
//    public void user_is_navigated_to_search_result() throws InterruptedException {
//        // Write code here that turns the phrase above into concrete actions
//        System.out.println("browser is open5");
//        driver.getPageSource().contains("Platanos");
//        Thread.sleep(2000);
//        driver.close();
//        driver.quit();
//
//    }
//
//}
