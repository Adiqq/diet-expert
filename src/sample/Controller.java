package sample;

import com.sun.javaws.exceptions.InvalidArgumentException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class Controller {
    public TextField liczbaKalorii;
    public Slider minBialka;
    public Slider maxBialka;
    public Slider minWegli;
    public Slider maxWegli;
    public Slider minTluszczu;
    public Slider maxTluszczu;
    public ChoiceBox rodzajDiety;
    public ChoiceBox liczbaPosilkow;

    public Controller() {
        Drools.init();
    }

    public void generateDiet(ActionEvent actionEvent) throws InvalidArgumentException, IOException {
        Ustawienia ust = new Ustawienia(
                Integer.parseInt(liczbaKalorii.getText()),
                (int)Math.round(minBialka.getValue()),
                (int)Math.round(maxBialka.getValue()),
                (int)Math.round(minWegli.getValue()),
                (int)Math.round(maxWegli.getValue()),
                (int)Math.round(minTluszczu.getValue()),
                (int)Math.round(maxTluszczu.getValue()),
                RodzajDiety.fromString(rodzajDiety.getValue().toString()),
                Integer.parseInt(liczbaPosilkow.getValue().toString())
        );
        System.out.println(ust);
        Applicant applicant = new Applicant( "Mr John Smith", 16 );
        assertTrue( applicant.isValid() );
        Drools.kSession.execute( applicant );
        assertFalse( applicant.isValid() );

        ArrayList<Posilek> posilki = new ArrayList<>();
        ArrayList<Produkt> produkty = new ArrayList<>();
        Produkt banan = new Produkt("Banan", 90,
                0.7, 18.2, 0.7,
                RodzajDiety.wszystkieDiety(), RodzajPosilku.wszystkiePosilki(),
                1., 2.);
        ProduktWazony truskawki = new ProduktWazony("Truskawki", 32,
                0.7, 8. , 0.3,
                RodzajDiety.wszystkieDiety(), RodzajPosilku.wszystkiePosilki(),
                1., 3., 100);
        produkty.add(banan);
        produkty.add(truskawki);
        Posilek sniadanie = new Posilek(RodzajPosilku.Sniadanie, produkty);
        posilki.add(sniadanie);
        Posilek obiad = new Posilek(RodzajPosilku.Obiad, produkty);
        posilki.add(obiad);
        Dieta dieta = new Dieta(posilki);
        Drools.dieta.push(dieta);


        Parent root = FXMLLoader.load(getClass().getResource("result.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Wynik");
        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }
}
