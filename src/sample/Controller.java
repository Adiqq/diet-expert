package sample;

import com.sun.javaws.exceptions.InvalidArgumentException;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

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

    public void generateDiet(ActionEvent actionEvent) throws InvalidArgumentException {
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
    }
}
