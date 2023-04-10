package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProjeUS10 {

    public ProjeUS10(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public WebElement SigIn;


    @FindBy(xpath = "//input[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton;

    @FindBy(xpath = "(//a[@class='nav-link'])[6]")
    public WebElement LessonManagement;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonProgram']")
    public WebElement LessonProgram;

    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement ChooseEducationTerm;

   @FindBy(xpath ="//input[@id='react-select-2-input']")
   public WebElement ChooseLesson;

    @FindBy(xpath = "//select[@id='day']")
    public WebElement gun;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTime;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTime;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement SubmitButton;

    @FindBy(xpath = "//div[text()='Created Lesson Program']")
    public WebElement basariMesaji;

    @FindBy(xpath ="//div[text()='Required']")
    public WebElement startStopUyariMessage;




}
