package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class N11Page {

    public N11Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//    @FindBy(xpath = "//span[text()='A']")
//    public WebElement Abutton ;

    @FindBy(xpath ="//div[@class='letters']//span[1]")
    public WebElement Abutton;


    @FindBy(xpath = "(//div[@class='sellerListHolder'])[4]//li//a")
    public List<WebElement> magazalar;


    }

