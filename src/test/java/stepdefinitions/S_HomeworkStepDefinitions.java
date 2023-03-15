package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.S_Homework1;
import pages.S_Homework4;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class S_HomeworkStepDefinitions {

S_Homework1 seleniumHomeWork_blueRental;
S_Homework4 s_homework4;



    @Given("kullanici homepage {string} gider")
    public void kullanici_homepage_gider(String string) throws InterruptedException {
        Thread.sleep(2000);
        seleniumHomeWork_blueRental=new S_Homework1();
        s_homework4=new S_Homework4();
        Driver.getDriver().get(string);
       try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
       }

        Driver.getDriver().switchTo().frame(s_homework4.iframe);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        s_homework4.cookie.click();
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("kullanici loginlinke tiklar")
    public void kullanici_loginlinke_tiklar() {
       seleniumHomeWork_blueRental.loginGiris.click();
    }

    @When("kullanici adini {string} girer")
    public void kullanici_adini_girer(String string) {
       seleniumHomeWork_blueRental.email.sendKeys(string);
    }

    @When("kullanici sifreyi {string} girer")
    public void kullanici_sifreyi_girer(String string) {
       seleniumHomeWork_blueRental.password.sendKeys(string);
    }

    @When("kullanici loginbutonuna basar")
    public void kullanici_loginbutonuna_basar() {
       seleniumHomeWork_blueRental.loginButton.click();
    }

    @Then("kullanici login oldugunu {string} ile dogrular")
    public void kullanici_login_oldugunu_ile_dogrular(String string) {
        Assert.assertTrue(seleniumHomeWork_blueRental.dogrulamaButonu.isDisplayed());
    }

    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Then("kullanici hata mesaji aldigini dogrular")
    public void kullanici_hata_mesaji_aldigini_dogrular() {
        Assert.assertTrue(seleniumHomeWork_blueRental.hataMesaji.isDisplayed());

    }

    @Then("Company listesini consola yazdirir")
    public void companyListesiniConsolaYazdirir() {
        s_homework4=new S_Homework4();
        for (WebElement w : s_homework4.company){
            System.out.println(w.getText());
        }

    }

    @And("kullanici {string} in listede oldugunu test eder")
    public void kullaniciInListedeOldugunuTestEder(String string) {
        s_homework4=new S_Homework4();
        List<String> arananIsim=new ArrayList<>();
        for (WebElement w : s_homework4.company){
            arananIsim.add(w.getText());
        }
      //  Assert.assertTrue(arananIsim.contains(string));
        Assert.assertTrue (s_homework4.company.stream().map(t->t.getText()).collect(Collectors.toList()).contains(string));




    }
}


