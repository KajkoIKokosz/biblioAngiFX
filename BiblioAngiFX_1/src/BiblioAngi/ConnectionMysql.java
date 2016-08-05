/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiblioAngi;

import java.sql.*;

/**
 *
 * @author Angi
 */
public class ConnectionMysql {
    private Connection connect;
    private Statement state;
    private ResultSet RSet;
    private String portNo = "3306/";
    private String nazwaBazy = "biblioangi";
    private String url_ = "jdbc:mysql://localhost:"+portNo+nazwaBazy;
    private String insert = "INSERT INTO `autorzy` (`Nr_autora`, `Imie`, `Nazwisko`, `urodzony`) VALUES ('1', 'Jan', 'Kochanowski', '15461010')";
    private String select = "select * from `autorzy`";
    
    public ConnectionMysql(){
        
        try{Class.forName("com.mysql.jdbc.Driver");
             
            connect = DriverManager.getConnection(url_, "root", "");
        
            state = connect.createStatement();
            System.out.println("ustanowiono połączneie");    
        }
        catch(Exception Ex){System.err.println("Error: " + Ex.getMessage());}
    } // koniec ConnectionMysql
    
    
    public void getData(){
        try{
            
            RSet = state.executeQuery(select);
            System.out.println("Wyniki kwerendy: ");
            while(RSet.next()){
                int ID = RSet.getInt(1);
                String imie = RSet.getString(2);
                System.out.println(imie + ID);
            }
        }catch(Exception Ex){System.err.println(Ex.getMessage());}
    }
    
    public void insertData(){
        try{
            state.executeUpdate(insert);
        }catch(Exception Ex){System.err.println(Ex.getMessage());}
        
    } // koniec insertData
    
} // koniec klasy
