package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "")
    public WebElement username;
    @FindBy(xpath = "")
    public WebElement password;
    @FindBy(xpath = "")
    public WebElement login;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "username": return this.username;
            case "password": return this.password;
            case "login": return this.login;
        }
        return null;
    }


}
