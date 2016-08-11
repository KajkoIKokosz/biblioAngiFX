package BiblioAngi;


import static BiblioAngi.BiblioAngiFX1.theStage;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 *
 * @author ANGI
 */

// konwencja nazewnictwa -- |kontrolka|GdzieUmieszczona|GdzieProwadzi|
public class BiblioAngiFX1 extends Application{


    Button btnWprowadz, btnPrzeglad;
    //Label lblBiblio, lblWprowadz, lblPrzeglad;
    
    
    protected static Stage theStage;
    static Scene scBiblio;
    
 

    @Override
    public void start(Stage primaryStage) {
        theStage = primaryStage;
        btnWprowadz = new Button("Wprowadź");
        btnPrzeglad = new Button("Przeglądaj");
        
        btnWprowadz.setOnAction(e-> ButtonClicked(e));
        btnPrzeglad.setOnAction(e-> ButtonClicked(e));
    
        /*
        GridPane gridPrzeglad = new GridPanePattern();
        gridPrzeglad.add(btnBiblioPrzegl,4,4);
        
        GridPane gridWprowBiblio = new GridPanePattern();
        
        //obiekt DodajBiblio (gridPane, scena, kontrolki)
        DodajBiblio gridDodajBiblio = new DodajBiblio();
        
        scPrzeglad = new Scene(gridPrzeglad, 400, 400);
        scWprowBiblio = new Scene(gridWprowBiblio,400,400);
     */
        GridPane gridBiblio = new GridPanePattern();
        gridBiblio.add(btnWprowadz,0,1);
        gridBiblio.add(btnPrzeglad,1,1);
        
        scBiblio = new Scene(gridBiblio, 400, 400);
        
        theStage.setScene(scBiblio);
        theStage.show();
        
        
    } //koniec startu
    
    public void ButtonClicked(ActionEvent e){
        if (e.getSource() == btnWprowadz){
            Wprowadz wprow = new Wprowadz();
            theStage.setScene(wprow.getScene());}
       
    }
    

    
}
