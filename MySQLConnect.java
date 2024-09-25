/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IADentalClinic;
import java.sql.*;
import javax.swing.*;
public class MySQLConnect { 
    Connection conn=null;
    public static Connection ConnectDB(){ //allows the local software to connect to the database server 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:8889/DentalClinicDB","root","root");
            return conn;
        }
    catch(ClassNotFoundException | SQLException e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    }
}
