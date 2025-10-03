package POMclasses;

import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    private By username=By.name("username");
    private By password=By.name("password");
    private By siginbtn=By.xpath("//button[@type=\"submit\"]");

    public void LoginTestingAcadamy(String user, String pwd){
        OpenUrl();
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(siginbtn);


    }

}
