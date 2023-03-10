@Homework4
Feature: Guru_Web_Tables
#
#1. http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
#2. Cucumber framework’de US1012_Guru_Web_Tables olusturun
#3. Scenario : TC_16_kullanici_liste_alabilmeli asagidaki testi yapin
#Given user web sayfasinda
#Then Company listesini consola yazdirir
#And DCB Bank'in listede oldugunu test eder

  Scenario: Homework4
    Given kullanici homepage "https://demo.guru99.com/test/web-table-element.php" gider
    Then Company listesini consola yazdirir
    And kullanici "DCB Bank" in listede oldugunu test eder
    And kullanici sayfayi kapatir
