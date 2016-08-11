/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioAngi;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author AnGi
 */
public class DodajBiblio {
    private Label lbDodajDzieln = new Label("Dodaj dzielnice");
    private Label lbDodajUlice = new Label("DodajUlice"); //należy wprowadzić ulice z numerem domu
    private TextField txtFldDodajDzieln = new TextField("...");
    private TextField txtFldDodajUlice = new TextField("...");
    private GridPanePattern gridDodajDzieln = new GridPanePattern(); //dziedziczy po GridPane
    private Scene scDodajBiblio;
    
    public DodajBiblio(){
        gridDodajDzieln.add(lbDodajDzieln, 0, 0);
        gridDodajDzieln.add(lbDodajUlice, 1, 0);
        gridDodajDzieln.add(txtFldDodajDzieln, 0, 1);
        gridDodajDzieln.add(txtFldDodajUlice, 1, 1);
        scDodajBiblio = new Scene(gridDodajDzieln);
    } // koniec konstruktora
    
    public Scene getScene(){
        return scDodajBiblio;
    }
    
    
    
    
    
} // koniec klasyo
