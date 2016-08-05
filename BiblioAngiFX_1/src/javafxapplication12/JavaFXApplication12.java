package javafxapplication12;




import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Angi
 */
public class JavaFXApplication12 extends Application {
   
   
    
    Button btnBiblio, btnWprowadz, btnPrzeglad;
    Label lblBiblio, lblWprowadz, lblPrzeglad;
    FlowPane paneBiblio, paneWprowadz, panePrzeglad;
    Scene scBiblio, scWprowadz, scPrzeglad;
    Stage theStage;
    
    
    @Override
    public void start(Stage primaryStage) {
        theStage = primaryStage;
        //can now use the stage in other methods
       
        //make things to put on panes
        btnWprowadz = new Button("Wprowadz");
        btnPrzeglad = new Button("Przeglądaj");
        
        btnPrzeglad.setOnAction(e-> ButtonClicked(e));
        btnWprowadz.setOnAction(e-> ButtonClicked(e));
        btnPrzeglad.setOnAction(e-> ButtonClicked(e));

        lblWprowadz = new Label("Scene 1");
        lblPrzeglad = new Label("Scene 2");
            
        
        //make 2 Panes
        paneBiblio = new FlowPane();
        paneWprowadz = new FlowPane();
        panePrzeglad = new FlowPane();
        paneBiblio.setVgap(10);
        paneWprowadz.setVgap(10);
        panePrzeglad.setVgap(10);
        
        //set background color of each Pane
        paneBiblio.setStyle("-fx-background-color: tan;-fx-padding: 10px;");
        paneWprowadz.setStyle("-fx-background-color: red; -fx-padding: 10px;");
        panePrzeglad.setStyle("-fx-background-color:  red; -fx-padding: 10px;");
        
        //add everything to panes
        paneBiblio.getChildren().addAll(lblBiblio, btnWprowadz, btnPrzeglad);
        paneWprowadz.getChildren().addAll(lblWprowadz, btnBiblio);
        panePrzeglad.getChildren().addAll(lblPrzeglad, btnBiblio);
        
        //make 3 scenes from 2 panes
        scBiblio = new Scene(paneBiblio, 400, 400);
        scWprowadz = new Scene(paneWprowadz, 400, 400);
        scPrzeglad = new Scene(panePrzeglad, 400, 400); 
        
        primaryStage.setTitle("Bbiblio Angi");
        primaryStage.setScene(scBiblio);
        primaryStage.show();
    
        
    } // koniec startu
    
 
  
     public void ButtonClicked(ActionEvent e){
        if (e.getSource()== btnBiblio)
            theStage.setScene(scBiblio);
        else if
           (e.getSource()== btnWprowadz)    
            theStage.setScene(scWprowadz);
          
        else if
            (e.getSource()== btnPrzeglad)    
            theStage.setScene(scPrzeglad);
    }
    
} // koniec klasy
