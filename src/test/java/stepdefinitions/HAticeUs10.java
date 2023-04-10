package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.ProjeUS10;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Random;

public class HAticeUs10 {
    ProjeUS10 vicedean;
    Faker faker;
    // int roomNumber= Faker.instance().number().numberBetween(1000,1000000);


    @And("kullanici uygulamaya {string} olarak login olur.")
    public void kullaniciUygulamayaOlarakLoginOlur(String arg0) {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        ReusableMethods.loginViceDean();
    }
    @And("kullanici menu butonuna tiklar.")
    public void kullaniciMenuButonunaTiklar() {
        vicedean=new ProjeUS10();
        ReusableMethods.waitFor(2);
        ReusableMethods.clickByJS(vicedean.menuButton);
    }
    @And("kullanici Lesson Management basligina  tiklar")
    public void kullaniciLessonManagementBasliginaTiklar() {
        vicedean=new ProjeUS10();
        ReusableMethods.waitFor(2);
       ReusableMethods.clickByJS(vicedean.LessonManagement);
    }
    @And("kullanici Lesson Program secenegine tiklar..")
    public void kullaniciLessonProgramSecenegineTiklar() {
        vicedean=new ProjeUS10();
        ReusableMethods.waitFor(2);
       ReusableMethods.clickByJS(vicedean.LessonProgram);
    }
    @And("kullanici valid bir Ders adi secer")
    public void kullaniciValidBirDersAdiSecer() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        vicedean.ChooseLesson.sendKeys("Statik",Keys.ENTER);
    }
    @And("kullanici valid bir Semester secer.")
    public void kullaniciValidBirSemesterSecer() {
        vicedean=new ProjeUS10();
        ReusableMethods.waitFor(2);
        Select select=new Select(vicedean.ChooseEducationTerm);
        select.selectByVisibleText("SPRING_SEMESTER");
    }
    @And("kullanici valid bir Gun girer")
    public void kullaniciValidBirGunGirer() {
        vicedean=new ProjeUS10();
        ReusableMethods.waitFor(2);
      //  new Faker((Random)vicedean.gun);
        Select select=new Select(vicedean.gun);
        select.selectByVisibleText("MONDAY");
    }
    @Given("kullanici valid bir Baslama Saati girer")
    public void kullaniciValidBirBaslamaSaatiGirer() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        vicedean.startTime.sendKeys("12:30");
    }
    @And("kullanici valid bir Bitis Saati girer")
    public void kullaniciValidBirBitisSaatiGirer() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        vicedean.stopTime.sendKeys("18:30");
    }
    @And("kullanici submit butonuna tiklar.")
    public void kullaniciSubmitButonunaTiklar() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
       ReusableMethods.clickByJS(vicedean.SubmitButton);

    }
    @Then("kullanici basari mesajini dogrular")
    public void kullaniciBasariMesajiniDogrular() throws IOException {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        ReusableMethods.getScreenshot("basari mesaji");
        Assert.assertTrue(vicedean.basariMesaji.getText().contains("Created Lesson Program"));
    }
    @Then("kullanici sayfayi kapatir..")
    public void kullaniciSayfayiKapatir() {
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }
    @Given("kullanici baslama saatini bos birakir")
    public void kullaniciBaslamaSaatiniBosBirakir() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        vicedean.startTime.sendKeys("");

    }
    @Then("kullanici uyari mesajini dogrular.")
    public void kullaniciUyariMesajiniDogrular() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        Assert.assertTrue(vicedean.startStopUyariMessage.isDisplayed());
    }
    @And("kullanici bitis saatini bos birakir")
    public void kullaniciBitisSaatiniBosBirakir() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        vicedean.stopTime.sendKeys("");
    }
    @And("kullanici ders alanini bos birakir")
    public void kullaniciDersAlaniniBosBirakir() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        vicedean.ChooseLesson.sendKeys("");
    }
    @And("kullanici semester alanini bos birakir")
    public void kullaniciSemesterAlaniniBosBirakir() {
        ReusableMethods.waitFor(2);
        vicedean=new ProjeUS10();
        vicedean.ChooseEducationTerm.sendKeys("");
    }
    @And("kullanici hata mesajini dogrular")
    public void kullaniciHataMesajiniDogrular() throws IOException {
        ReusableMethods.waitFor(2);
        ReusableMethods.getScreenshot("JsonPath Hatasi");
    }
}
