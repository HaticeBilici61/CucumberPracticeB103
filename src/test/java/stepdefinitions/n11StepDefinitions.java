package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.N11Page;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
    public void cikanSonucuBirExcelVeyaTxtDosyasinaYazdirilir() throws InterruptedException, IOException {
        n11Page = new N11Page();
        //ReusableMethods.getElementsText(//div[@class='sellerListHolder'])[4]//li//a);

        List<WebElement>company = n11Page.magazalar;
        List<String> mgzIsimleri = new ArrayList<>();
        for (WebElement w :company) {
            mgzIsimleri.add(w.getText());
            System.out.println(mgzIsimleri);

     //cikan sonuclari excel e yazdirdik
            String path = "src/test/resources/testdata/ulkeler.xlsx";
            String sayfa="Sheet1";
            ExcelUtils excelUtils = new ExcelUtils(path, sayfa);
            List<String> sirketler = ReusableMethods.getElementsText(company);
            System.out.println("sirketler :" + sirketler);

            for (int i = 0; i < 11; i++) {

                excelUtils.setCellData(sirketler.get(i),i+1,3 );



//sevim hoca cozum
//            N11Page n11Page = new N11Page();
//            // n11Page.magazalar.stream().forEach(t-> System.out.println(t.getText()));
//            String path="src/test/resources/testdata/saticilar.xlsx";
//            Thread.sleep(5000);
//            List<String> stores = ReusableMethods.getElementsText(n11Page.magazalar);
//            System.out.println("stores.size() = " + stores.size());
//
//
//            Workbook workbook = WorkbookFactory.create(new FileInputStream(path));
//            Sheet sheet = workbook.getSheet("saticilar");
//            Row row = sheet.createRow(0);
//            Cell cell = row.createCell(0);
//            cell.setCellValue("-Stores-");
//
//
//            for (int i = 0; i <10; i++) {
//                row = sheet.createRow(i+1);
//                cell = row.createCell(0);
//                cell.setCellValue(stores.get(i));
//
//            }
//            workbook.write(new FileOutputStream(path));
//        }
//

        }
    }}}