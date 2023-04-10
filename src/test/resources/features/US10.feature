@Us10
Feature: Lesson program olusturma(Pozitif test case)
#  1	Kullanıcı sayfaya gider
#  2	Kullanıcı uygulamaya Vice Dean olarak login olur
#  3	Kullanici Menu butonuna tiklar
#  4	Kullanici Lesson Management basligina tiklar
#  5	Kullanici Lesson Program basligini secer
#  6	Kullanici valid bir Ders secer
#  7	Kullanici valid bir Semester secer
#  8	Kullanici valid bir Gun secer
#  9	Kullanici valid bir baslama saati girer
#  10	Kullanici valid bir bitis saati girer
#  11	Kullanici submit butonuna tiklar
#  12	Kullanici bir basari mesaji alir

Background:
  Given kullanici homepage "https://www.managementonschools.com/" gider.
  And kullanici uygulamaya "Vice Dean" olarak login olur.
  And kullanici menu butonuna tiklar.
  And kullanici Lesson Management basligina  tiklar
  And kullanici Lesson Program secenegine tiklar..



@Pozitive_scenario
  Scenario: Program olusturma
    When   kullanici valid bir Ders adi secer
    And   kullanici valid bir Semester secer.
    And   kullanici valid bir Gun girer
    And   kullanici valid bir Baslama Saati girer
    And   kullanici valid bir Bitis Saati girer
    And   kullanici submit butonuna tiklar.
    And   kullanici basari mesajini dogrular
    Then  kullanici sayfayi kapatir..


  @NegativeScenario_01
  Scenario:
    When   kullanici valid bir Ders adi secer
    And   kullanici valid bir Semester secer.
    And   kullanici valid bir Gun girer
    And   kullanici baslama saatini bos birakir
    And   kullanici valid bir Bitis Saati girer
    And   kullanici submit butonuna tiklar.
    And   kullanici uyari mesajini dogrular.
    Then  kullanici sayfayi kapatir..

  @NegativeScenario_02
    Scenario:
    And  kullanici valid bir Ders adi secer
    And  kullanici valid bir Semester secer.
    And  kullanici valid bir Gun girer
    And  kullanici valid bir Baslama Saati girer
    And  kullanici bitis saatini bos birakir
    And  kullanici submit butonuna tiklar.
    And  kullanici uyari mesajini dogrular.
    Then kullanici sayfayi kapatir..

  @NegativeScenario_03
  Scenario:
        And  kullanici ders alanini bos birakir
        And  kullanici valid bir Semester secer.
        And  kullanici valid bir Gun girer
        And  kullanici valid bir Baslama Saati girer
        And  kullanici valid bir Bitis Saati girer
        And  kullanici submit butonuna tiklar.
        And  kullanici hata mesajini dogrular
        Then kullanici sayfayi kapatir..


  @NegativeScenario_04
  Scenario:
    And  kullanici valid bir Gun girer
    And  kullanici semester alanini bos birakir
    And  kullanici valid bir Gun girer
    And  kullanici valid bir Baslama Saati girer
    And  kullanici valid bir Bitis Saati girer
    And  kullanici submit butonuna tiklar.
    And  kullanici hata mesajini dogrular
    Then kullanici sayfayi kapatir..
