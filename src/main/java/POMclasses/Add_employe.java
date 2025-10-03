package POMclasses;

import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_employe extends BaseClass {
    WebDriver driver;

    public Add_employe(WebDriver driver){

        this.driver = driver;
    }

    private By Fname= By.xpath("//input[@name=\"firstName\"]");
    private By Lname= By.xpath("//input[@name=\"lastname\"]");
    private By savebtn=By.xpath("//button[@type=\"submit\"]");

    public void EmployeDetails(String firstname,String Lastname) {
        enterInput(Fname,firstname);
        enterInput(Lname,Lastname);
        clickElement(savebtn);
    }






}
