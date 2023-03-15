@Homework05
Feature:


#1. http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
#2. Cucumber framework’de US1012_Guru_Web_Tables altinda
#Scenario : TC_17_kullanici_sirket_Prev_Close_alabilmeli olusturun ve asagidaki testi
#yapin
#Given user web sayfasinda
#And “Istenen Sirket” Prev.Close degerini yazdirir

  Scenario: Homework05
    Given kullanici homepage "http://demo.guru99.com/test/web-table-element.php" gider
    Then kullanici "istenen sirket" prevclose degerini yazdiri