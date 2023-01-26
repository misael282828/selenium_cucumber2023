package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;

    private By userName = By.id("name");
    private By userPassword = By.id("password");
    private By btn_login = By.id("login");
    private By btn_logout = By.id("logout");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    public void enterUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void enterPassword(String pass){
        driver.findElement(userPassword).sendKeys(pass);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void checkLogOutDisplayed(){
        driver.findElement(btn_logout).isDisplayed();
    }

    public void validationLogin(String username,String pass ){
        driver.findElement(userName).sendKeys(username);
        driver.findElement(userPassword).sendKeys(pass);
        driver.findElement(btn_login).click();
    }
}
