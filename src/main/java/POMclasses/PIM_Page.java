package POMclasses;

import org.example.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PIM_Page extends BaseClass {
    WebDriver driver;

    public PIM_Page(WebDriver driver) {

        this.driver = driver;
    }

    private By addbtn = By.xpath("//div[@class=\"orangehrm-paper-container\"]/div/Button[@type=\"button\"]");


    public void click_add_Button() {
        clickElement(addbtn);
    }

}
