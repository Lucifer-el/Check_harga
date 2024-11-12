/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pricevista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ammar
 */
public class koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/pricevista", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
    
    public class config {
        private static Connection mysqlconfig;
        public static Connection configDB()throws SQLException{
            try {
                String url="jdbc:mysql://localhost:3306/pricevista"; //url database
                String user="root"; //user database
                String pass=""; //password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                mysqlconfig=DriverManager.getConnection(url, user, pass);            
            } catch (Exception e) {
                System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
            }
            return mysqlconfig;
        }       
        }
}
