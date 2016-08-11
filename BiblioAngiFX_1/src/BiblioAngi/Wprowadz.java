/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioAngi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author AnGI
 */
public class Wprowadz {
       
    GridPane gridWprowadz = new GridPanePattern();
    Button btnWprowBiblioteka = new Button("Powrót");
    Button btnWprowBiblio = new Button("Biblioteki");
    Button btnWprowCzytelnik = new Button("Czytelinicy");
    Button btnWprowKsiazki = new Button("Książki");
    Label lbWprowWprow = new Label("WPROWADŹ:");
    Scene scWprowadz = new Scene (gridWprowadz, 400, 400);

    public Wprowadz(){
        gridWprowadz.add(btnWprowBiblio,1,1);
        gridWprowadz.add(btnWprowCzytelnik,2,1);
        gridWprowadz.add(btnWprowKsiazki,3,1);
        gridWprowadz.add(btnWprowBiblioteka,4,4);
        gridWprowadz.add(lbWprowWprow,1,0);
    } // koniec konstruktora
    
    public Scene getScene(){
        return scWprowadz;
    }
    
    public void ButtonClicked(ActionEvent e){
        if (e.getSource() == btnWprowBiblioteka){
            BiblioAngiFX1.theStage.setScene(BiblioAngiFX1.scBiblio);
            BiblioAngiFX1.stop();
            
        }
        else if (e.getSource() == btnWprowBiblio){
            Wprowadz wprow = new Wprowadz();
            BiblioAngiFX1.theStage.setScene(wprow.getScene());}
    }
    
   
}
