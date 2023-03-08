@ilkfeature
Feature: Amazon Search

  @gp1
  Scenario: TC01_amazon_selenium_arama
      Given amazon sayfasina gidilir
      Then amazon sayfasinda selenium aratilir
      And  sayfa kapatilir

  Scenario: TC01_amazon_iphone_arama
    Given kullanici amazona gider
    When kullanici iphone için arama yapar
    Then sayfa basliginin iphone icerdigini test eder
    And  sayfa kapatilir

  Scenario: TC03_amazon_java_arama
    Given kullanici amazona gider
    When kullanici java için arama yapar
    Then sayfa basliginin java icerdigini test eder
    And  sayfa kapatilir