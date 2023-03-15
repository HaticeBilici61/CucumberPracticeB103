package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.S_Homework5;
import utilities.Driver;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class S_Homework05StepDefinitions {
    S_Homework5 homework5=new S_Homework5();

    @Then("kullanici {string} prevclose degerini yazdiri")
    public void kullanici_prevclose_degerini_yazdiri(String string) {
        S_Homework5 sHomework5=new S_Homework5();

     List<String> text     =   sHomework5.company.stream().map(t->t.getText()).collect(Collectors.toList());
     List<String> prevClose=   sHomework5.company.stream().map(t->t.getText()).collect(Collectors.toList());
        HashMap<String,String> deger=new HashMap<>();

        for (int i=0 ; i< text.size() ;i++){
            deger.put(text.get(i),prevClose.get(i) );
                if (text.get(i).equals(string)){
                    System.out.println(prevClose.get(i));
                }
            }
        System.out.println("deger :" +deger);
        }
    }


