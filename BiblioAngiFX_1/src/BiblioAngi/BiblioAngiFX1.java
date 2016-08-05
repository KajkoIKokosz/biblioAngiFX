package BiblioAngi;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGI
 */
public class BiblioAngiFX1 extends Application{
    Button btnBiblioWprow, btnBiblioPrzegl, btnWprowadz, btnPrzeglad;
    //Label lblBiblio, lblWprowadz, lblPrzeglad;
    GridPane gridBiblio, gridWprowadz, gridPrzeglad;
    Scene scBiblio, scWprowadz, scPrzeglad;
    Stage theStage;
    
    
    @Override
    public void start(Stage primaryStage) {
        theStage = primaryStage;
        
        btnBiblioWprow = new Button("BIBLIOTEKA");
        btnBiblioPrzegl = new Button("BIBLIOTEKA");
        btnWprowadz = new Button("Wprowadz dane");
        btnPrzeglad = new Button("Przeglądaj");
        
        btnBiblioWprow.setOnAction(e-> ButtonClicked(e));
        btnBiblioPrzegl.setOnAction(e-> ButtonClicked(e));
        btnWprowadz.setOnAction(e-> ButtonClicked(e));
        btnPrzeglad.setOnAction(e-> ButtonClicked(e));
        
        
        GridPane gridBiblio = new GridPane();
        gridBiblio.setAlignment(Pos.CENTER);
        gridBiblio.setHgap(10);
        gridBiblio.setVgap(10);
        gridBiblio.setPadding(new Insets(25, 25, 25, 25));
        gridBiblio.add(btnWprowadz,0,1);
        gridBiblio.add(btnPrzeglad,1,1);
        
        GridPane gridWprowadz = new GridPane();
        gridWprowadz.setAlignment(Pos.CENTER);
        gridWprowadz.setHgap(10);
        gridWprowadz.setVgap(10);
        gridWprowadz.setPadding(new Insets(25, 25, 25, 25));
        gridWprowadz.add(btnBiblioWprow,0,1);
        
        GridPane gridPrzeglad = new GridPane();
        gridPrzeglad.setAlignment(Pos.CENTER);
        gridPrzeglad.setHgap(10);
        gridPrzeglad.setVgap(10);
        gridPrzeglad.setPadding(new Insets(25, 25, 25, 25));
        gridPrzeglad.add(btnBiblioPrzegl,0,1);
        
        scWprowadz = new Scene(gridWprowadz, 400, 400);
        scPrzeglad = new Scene(gridPrzeglad, 400, 400);
        
        scBiblio = new Scene(gridBiblio, 400, 400);
        theStage.setScene(scBiblio);
        theStage.show();
    } //koniec startu
    
      public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource() == btnBiblioWprow)
            theStage.setScene(scBiblio);
        else if (e.getSource() == btnBiblioPrzegl)
            theStage.setScene(scBiblio);
        else if (e.getSource() == btnWprowadz)
            theStage.setScene(scWprowadz);
        else if (e.getSource() == btnPrzeglad)
            theStage.setScene(scPrzeglad);
    }
    
    
    
}
