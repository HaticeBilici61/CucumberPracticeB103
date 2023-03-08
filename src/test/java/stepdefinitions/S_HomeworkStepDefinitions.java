package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.S_Homework_BlueRental;
import utilities.Driver;

public class S_HomeworkStepDefinitions {

S_Homework_BlueRental seleniumHomeWork_blueRental;
    @Given("kullanici homepage {string} gider")
    public void kullanici_homepage_gider(String string) {
        seleniumHomeWork_blueRental=new S_Homework_BlueRental();
        Driver.getDriver().get(string);

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

}


