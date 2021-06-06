/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class DBclass {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    //Insert Year and sem data to the database
    public boolean addYearSem(String name){
        String sql = "INSERT INTO yearsem (name) VALUES ('"+name+"')";
           
        try{
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
           
           pst = (PreparedStatement) con.prepareStatement(sql);             
           pst.executeUpdate();
           return true;
           
       }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Retrieve data from yearsem database
    public DefaultComboBoxModel retieveYearSem(){
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        
        String sql = "SELECT name from yearsem";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);     
            rs = pst.executeQuery();
            
            while(rs.next()){
                String name = rs.getString(1);
                dm.addElement(name);
            }
            
            return dm;
            
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
       }
    }
    
    //Update yearsem
    public boolean updateYearSem(String id, String value){
        String sql = "UPDATE yearsem SET name = '"+value+"' WHERE name  = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Delete yearsem
    public boolean deleteYearSem(String id){
        String sql = "DELETE FROM yearsem WHERE name = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    
    
    //Insert Programme data to the database
    public boolean addProgramme(String name){
        String sql = "INSERT INTO programme (name) VALUES ('"+name+"')";
           
        try{
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
           
           pst = (PreparedStatement) con.prepareStatement(sql);             
           pst.executeUpdate();
           return true;
           
       }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Retrieve data from Programme database
    public DefaultComboBoxModel retieveProgramme(){
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        
        String sql = "SELECT name from programme";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);     
            rs = pst.executeQuery();
            
            while(rs.next()){
                String name = rs.getString(1);
                dm.addElement(name);
            }
            
            return dm;
            
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
       }
    }
    
    //Update Programme
    public boolean updateProgramme(String id, String value){
        String sql = "UPDATE programme SET name = '"+value+"' WHERE name  = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Delete Programme
    public boolean deleteProgramme(String id){
        String sql = "DELETE FROM programme WHERE name = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    
    //Add groupid
    public boolean addGId(String name){
        String sql = "INSERT INTO groupid (name) VALUES ('"+name+"')";
           
        try{
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
           
           pst = (PreparedStatement) con.prepareStatement(sql);             
           pst.executeUpdate();
           return true;
           
       }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Retrieve data from groupid database
    public DefaultComboBoxModel retieveGId(){
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        
        String sql = "SELECT name from groupid";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);     
            rs = pst.executeQuery();
            
            while(rs.next()){
                String name = rs.getString(1);
                dm.addElement(name);
            }
            
            return dm;
            
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
       }
    }
    
    //Update groupid
    public boolean updateGId(String id, String value){
        String sql = "UPDATE groupid SET name = '"+value+"' WHERE name  = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Delete groupid
    public boolean deleteGId(String id){
        String sql = "DELETE FROM groupid WHERE name = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    
    //Add subgroupid
    public boolean addSubGId(String name){
        String sql = "INSERT INTO subgroupid (name) VALUES ('"+name+"')";
           
        try{
           con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
           
           pst = (PreparedStatement) con.prepareStatement(sql);             
           pst.executeUpdate();
           return true;
           
       }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Retrieve data from subgroupid database
    public DefaultComboBoxModel retieveSubGId(){
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        
        String sql = "SELECT name from subgroupid";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);     
            rs = pst.executeQuery();
            
            while(rs.next()){
                String name = rs.getString(1);
                dm.addElement(name);
            }
            
            return dm;
            
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
       }
    }
    
    //Update subgroupid
    public boolean updateSubGId(String id, String value){
        String sql = "UPDATE subgroupid SET name = '"+value+"' WHERE name  = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    //Delete subgroupid
    public boolean deleteSubGId(String id){
        String sql = "DELETE FROM subgroupid WHERE name = '"+id+"'";
        
        try{
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/abc_db", "root", "");
            pst = (PreparedStatement) con.prepareStatement(sql);    
            pst.execute();
            
            return true;
        }catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
       }
    }
    
    
}
