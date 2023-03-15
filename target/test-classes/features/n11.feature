@n11
Feature:
  # https://www.n11.com/ adresine gidilerek headerdan "Magazalar /Magazalari gor" secilir.
  # Tum magazalar butonuna tiklanir.A harfindeki tum magazalar bir excel csv veya txt dosaysina yazdirilir.


  Scenario: n11
    Given kullanici homepage "https://www.n11.com/magazalar" gider.
    When  kullanici "A" butonuna tiklar
    Then  cikan sonucu bir excel veya txt dosyasina yazdirilir.