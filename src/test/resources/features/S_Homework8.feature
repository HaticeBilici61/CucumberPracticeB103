@Excel_automation
Feature: Excel_Ulkeler
#Soru 8
#1) Yeni bir class olusturalim D34_readExcel
#2) Baskentler excelini framework’e ekleyelim ve excelle ilgili islemleri yaparak
#dosyayi kullanilabilir hale getirelim
#- 1.satirdaki 2.hucreye gidelim ve yazdiralim
#- baskenti Jakarta olan ulke ismini yazdiralim
#- Ulke sayisini bulalim
#- Fiziki olarak kullanilan satir sayisini bulun
#- baskenti Jakarta olan ulkenin tum bilgilerini yazdiralim
#- Satir ve sutun bilgisi ile hucre yazdiralim

  Scenario: Ulkeler
     Given "1" . satirdaki "2".hucreye gidelim ve yazdiralim
     Then  baskenti "Jakarta" olan ulke ismini yazdiralim
     And   kullanici ulke sayisini yazdirir
     And   kullanici fiziki olarak kullanilan satir sayisini bulur
     And   kullanici baskenti "Jakarta " olan ulkenin tum bilgilerini yazdirir
     Then  kullanici kullanilan toplam satir ve sutun sayisini yazdirir