/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author MACIEK
 */
public class JavaFXApplication12 extends Application {
    Button wprowadz = new Button();
    Button przeglad = new Button();
    GridPane grid = new GridPane();
    Scene biblioSc = new Scene(grid, 300, 250);
    Scene wprowadzSc = new Scene(grid,300, 250);
    Stage theStage = null;
    
    
    @Override
    public void start(Stage primaryStage) {
       
        if(theStage != null){primaryStage = theStage;}
        
        Text tytul1 = new Text("BIBLIOTEKA");
        wprowadz.setText("Wprowadź zasoby");
        wprowadz.setOnAction(e-> ButtonClicked(e));
        
        
        przeglad.setText("Przeglądaj"); 
        przeglad.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                System.out.println("Wciśnięto szukaj");
            }
        });
        
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        // grid.setGridLinesVisible(true);
        grid.add(tytul1,1,0);
        grid.add(wprowadz,1,1);
        grid.add(przeglad,1,2);
       
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(biblioSc);
        primaryStage.show();
    } // koniec startu
    
    
     public void ButtonClicked(ActionEvent e)
    {
        if (e.getSource()== wprowadz)
            theStage.setScene(wprowadzSc);
        else
            theStage.setScene(biblioSc);
    }
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
