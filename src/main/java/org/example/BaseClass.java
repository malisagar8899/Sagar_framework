package org.example;

import static org.example.DriverManager.getDriver;

public class BaseClass {

    public void OpenUrl(){
        getDriver().get(utils.readKey("url"));
    }

}
