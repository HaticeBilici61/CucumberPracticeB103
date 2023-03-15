package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ExcelUtils;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class S_HomeworkExcelStepDefinition {

    ExcelUtils excelUtils;
    String path = "src/test/resources/testdata/ulkeler.xlsx";
    String sayfa = "Sayfa1";


    @Given("kullanici {int} inci satirdaki {int} inci hucreye gider ve yazdirir")
    public void kullaniciInciSatirdakiInciHucreyeGiderVeYazdirir(int arg0, int arg1)throws IOException {
        excelUtils = new ExcelUtils(path, sayfa);
        String cell = excelUtils.getCellData(arg0, arg1);
        System.out.println(cell);

    }

    @Then("baskenti {string} olan ulke ismini yazdiralim")
    public void baskenti_olan_ulke_ismini_yazdiralim(String string) {
        List<Map<String, String>> datalar = excelUtils.getDataList();
        for (Map<String, String> w : datalar) {
            if (w.containsValue(string)) {
                System.out.println(w);
            }
        }
    }

    @Then("kullanici ulke sayisini yazdirir")
    public void kullanici_ulke_sayisini_yazdirir() {
        System.out.println("Kullanilan ulkesayisi :" + (excelUtils.rowCount() - 1));
   }

   @Then("kullanici fiziki olarak kullanilan satir sayisini bulur")
   public void kullanici_fiziki_olarak_kullanilan_satir_sayisini_bulur() {
       System.out.println("satir :" + excelUtils.rowPsıcalCount());

   }
    @Then("kullanici baskenti {string} olan ulkenin tum bilgilerini yazdirir")
    public void kullanici_baskenti_olan_ulkenin_tum_bilgilerini_yazdirir(String string) {


        }
    @Then("kullanici kullanilan toplam satir ve sutun sayisini yazdirir")
    public void kullanici_kullanilan_toplam_satir_ve_sutun_sayisini_yazdirir() {
        System.out.println("satir :" +excelUtils.rowCount());
        System.out.println("sutun :" +excelUtils.columnCount());
    }

    }

