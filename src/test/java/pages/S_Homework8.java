package pages;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class S_Homework8 {
    /*
     Scenario: Ulkeler
     Given 1 inci satirdaki 2 inci hucreye gidelim ve yazdiralim
     Then  baskenti "Ankara" olan ulke ismini yazdiralim
     And   kullanici ulke sayisini yazdirir
     And   kullanici fiziki olarak kullanilan satir sayisini bulur
     And   kullanici baskenti "Ankara " olan ulkenin tum bilgilerini yazdirir
     Then  kullanici kullanilan toplam satir ve sutun sayisini yazdirir

     */

    @Test
    public void ExcelTest() throws IOException {
        String path="src/test/resources/testdata/Capitals.xlsx";
        FileInputStream fileinputstream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileinputstream);
        Sheet sheet1=workbook.getSheet("Sheet1");

        //1 inci satirdaki 2 inci hucreye gidelim ve yazdiralim
        Cell cell2= sheet1.getRow(1).getCell(1);
        System.out.println(cell2);

        //baskenti "Ankara" olan ulke ismini yazdiralim
        String ulke= sheet1.getRow(4).getCell(0).toString();
        System.out.println(ulke);

      //  kullanici kullanilan toplam satir ve sutun sayisini yazdirir
        int toplamSatirSayisi= sheet1.getLastRowNum()+1 ;
        System.out.println(toplamSatirSayisi);

        // kullanici fiziki olarak kullanilan satir sayisini bulur
        int kullanilanToplamSatirSayisi=sheet1.getPhysicalNumberOfRows();
        System.out.println(kullanilanToplamSatirSayisi);

        //  kullanici baskenti "Ankara " olan ulkenin tum bilgilerini yazdirir
       String bilgiler= sheet1.getRow(4).getCell(0)+sheet1.getRow(4).getCell(1).toString();

        System.out.println(bilgiler);


       }


    }

