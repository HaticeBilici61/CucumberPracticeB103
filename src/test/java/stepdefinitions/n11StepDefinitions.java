package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.N11Page;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;


public class n11StepDefinitions {
    N11Page n11Page;
    ExcelUtils excelUtils ;

    @Given("kullanici homepage {string} gider.")
    public void kullaniciHomepageGider(String string) {
        n11Page = new N11Page();
        Driver.getDriver().get(string);
        // Driver.getDriver().switchTo().frame(n11Page.iframe);
    }


    @When("kullanici {string} butonuna tiklar")
    public void kullaniciButonunaTiklar(String string) throws InterruptedException {
        ReusableMethods.clickByJS(n11Page.Abutton);


    }

    @Then("cikan sonucu bir excel veya txt dosyasina yazdirilir.")
    public void cikanSonucuBirExcelVeyaTxtDosyasinaYazdirilir() {
        n11Page=new N11Page();
       //ReusableMethods.getElementsText(//div[@class='sellerListHolder'])[4]//li//a);

        List<WebElement> Geschafte= n11Page.magazalar;
        List<String> mgzIsimleri = new ArrayList<>();
        for (WebElement w : Geschafte) {
            mgzIsimleri.add(w.getText());
            System.out.println(mgzIsimleri);



    }
}}