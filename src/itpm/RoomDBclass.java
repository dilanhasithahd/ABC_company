/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itpm;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class RoomDBclass {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public DefaultComboBoxModel retieveRooms(){
        DefaultComboBoxModel dm = new DefaultComboBoxModel();
        
        String sql = "SELECT sessionrooms from Session_Rooms";
        
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
}
