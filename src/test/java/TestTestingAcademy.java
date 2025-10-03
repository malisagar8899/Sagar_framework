import POMclasses.LoginPage;
import POMclasses.PIM_Page;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.example.BaseClass;
import org.example.DriverManager;
import org.example.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestTestingAcademy extends BasToAllTest {
//WebDriver driver;
//By username=By.name("username");
@Owner("SAGAR")
@Description("Testing acadamy opening")
    @Test
public void TestingAcademyLogInCheck(){
    LoginPage LoginPageTest=new LoginPage((DriverManager.getDriver()));
    utils.waitImplicitWait(DriverManager.getDriver(), 10);
    LoginPageTest.LoginTestingAcadamy(utils.readKey("username"),utils.readKey("password"));
    PIM_Page add=new PIM_Page(DriverManager.getDriver());
    add.click_add_Button();




}


}
