package sample;

import com.sun.javafx.scene.control.skin.TableHeaderRow;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import sample.Dieta;
import sample.Drools;
import sample.Posilek;

public class ResultController {
    public VBox vbox;

    public void initialize(){
        Dieta dieta = Drools.dieta.pop();
        for(Posilek p : dieta.getPosilki()){
            Label label = new Label(p.getNazwa().toString());
            TableView table = new TableView();
            table.setFixedCellSize(24);
            TableColumn nazwa = new TableColumn("Nazwa");
            nazwa.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
            TableColumn kalorie = new TableColumn("Kalorie");
            kalorie.setCellValueFactory(new PropertyValueFactory<>("kalorie"));
            TableColumn bialko = new TableColumn("Białko");
            bialko.setCellValueFactory(new PropertyValueFactory<>("bialko"));
            TableColumn weglowodany = new TableColumn("Węglowodany");
            weglowodany.setCellValueFactory(new PropertyValueFactory<>("weglowodany"));
            TableColumn tluszcz = new TableColumn("Tłuszcze");
            tluszcz.setCellValueFactory(new PropertyValueFactory<>("tluszcz"));
            TableColumn ilosc = new TableColumn("Ilość");
            ilosc.setCellValueFactory(new PropertyValueFactory<>("ilosc"));
            table.getColumns().addAll(nazwa, kalorie, bialko, weglowodany,tluszcz,ilosc);

            for (Produkt produkt : p.getProdukty()){
                table.getItems().add(produkt);
            }
            int rowCount = p.getProdukty().size() + 1;
            TableHeaderRow headerRow = (TableHeaderRow) table.lookup("TableHeaderRow");
            double tableHeight = (rowCount * table.getFixedCellSize())
                    // add the insets or we'll be short by a few pixels
                    + table.getInsets().getTop() + table.getInsets().getBottom()
                    // header row has its own (different) height
                    + (headerRow == null ? 0 : headerRow.getHeight())
                    ;
            tableHeight += 2;

            table.setMinHeight(tableHeight);
            table.setMaxHeight(tableHeight);
            table.setPrefHeight(tableHeight);


            vbox.getChildren().addAll(label, table);
        }
    }
}
