/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author alanvega
 */
public class Data {
    Connection con;
    
    public Data(){
        System.out.println("Bienvenido a Data");
 
    }
    
    public boolean Connect(){
        try{  
                Class.forName("com.mysql.cj.jdbc.Driver");  
                con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/base_Diana?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Infinity1973");  
        }catch(Exception e){ 
            System.out.println("no me pude conectar");
            System.out.println(e);
            return false;
        }
     return true; 
    }
    
    public boolean CheckUser(String user, String password){
        try{
            Statement stmt=con.createStatement();  
            String query = "SELECT user from Login where user LIKE \'" + user + "\' AND password LIKE \'" + password + "\'";
            System.out.println(""+query);
            ResultSet rs=stmt.executeQuery(query);  
            if(rs.next())	
	return true;
        }catch(Exception e){
            System.out.println("Error: " + e);
        }      
        return false;
    }
    
    public boolean newMember (String nombre, String celular, String matricula, String workteam, String pago){
        try{
            Statement stmt = con.createStatement();
            String query = "INSERT into DatosMiembros (nombre, celular, matricula, workteam, pago) VALUES (\'" + nombre + "\', \'" + celular + "\', \'" + matricula + "\', \'" + workteam + "\', \'" + pago + "\')";
            System.out.println("" + query);
            PreparedStatement ps = con.prepareStatement(query);
            ps.execute();
            return true;
        }catch(Exception e){
            System.out.println("Error" + e);
        }
            return false;
    }
    
    public void showMember (JTable table){
        String query = "SELECT * from DatosMiembros";
        try{
            Statement stmt = con.createStatement();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            DefaultTableModel tableModel =(DefaultTableModel)table.getModel();
            tableModel.setRowCount(0);
            while(rs.next()){
                tableModel.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        }catch(Exception e){
            System.out.println("Error" + e);
    }
    }
   
    public void searchMember(JTable table, String nombre){
        try {
            String query = "SELECT * FROM DatosMiembros WHERE `nombre` ='"+ nombre +"'";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            tableModel.setRowCount(0);
            while (rs.next()){
                tableModel.addRow(new String[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        }catch(Exception e){
            System.out.println("Error" + e);
        }
    }
    public boolean Close(){
        try{
            con.close();
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        return true;
    }
}
