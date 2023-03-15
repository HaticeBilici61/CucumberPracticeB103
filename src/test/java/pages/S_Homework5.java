package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class S_Homework5 {

    public S_Homework5(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//table[@class='dataTable']//tr//td[1]")
    public List<WebElement> company;

    @FindBy(xpath="//button[@id='save']")
    public WebElement cookie;

    @FindBy(xpath ="//*[@id='gdpr-consent-notice']")
    public WebElement iframe;

    @FindBy(xpath = "//table[@class='dataTable']//tbody//tr//td[4]")
    public List<WebElement> prev_Close;
}
