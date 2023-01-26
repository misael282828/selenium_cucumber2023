package StepDefinitions;



import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.IOException;

public class LoginDemo_POM {


        WebDriver driver =null;
        LoginPage login;

        @Given("browser is open")
        public void browser_is_open() {
            System.out.println(" === IO am inside LoginDemoSteps_POM ==== ");

            String direccionDriver = "C:/Users/HP/IdeaProjects/Cucumber_Selenio/src/main/resources/drivers/chromedriver.exe";
//    String projectPath = System.getProperty("user.dir");
//    System.out.println("project path is: "+ projectPath);
            // Write code here that turns the phrase above into concrete actions
            System.out.println("browser is open1 ");
            System.setProperty("webdriver.chrome.driver", direccionDriver);

            driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);

            driver.manage().window().maximize();


        }

        @And("user is on login page")
        public void user_is_on_login_page() {
            // navigate to https://example.testproject.io/web/

            driver.navigate().to("https://example.testproject.io/web/");


        }

        @When("^user enters (.*) and (.*)$")
        public void user_enters_username_and_password(String username, String password) throws InterruptedException {
            login = new LoginPage(driver);
            System.out.println("Hora de entrar los user name and pass");


            login.enterUserName(username);
            login.enterPassword(password);

            System.out.println("***********************");


//            driver.findElement(By.id("name")).sendKeys(username);
//            driver.findElement(By.id("password")).sendKeys(password);

            Thread.sleep(2000);
                //  Block of code to try





        }

        @And("user clicks on login")
        public void user_clicks_on_login() {
            login.clickLogin();
//            driver.findElement(By.id("login")).click();

        }

        @Then("user is navigated to the home page")
        public void user_is_navigated_to_the_home_page() throws InterruptedException {
            login.checkLogOutDisplayed();
            //driver.findElement(By.id("logout")).isDisplayed();

            Thread.sleep(2000);
            driver.close();
            driver.quit();

        }




}
