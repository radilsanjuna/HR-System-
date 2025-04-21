/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import Admin.DatabaseConnection;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import Admin.Admin_Dashboard;
import Admin.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HRManager extends User{

    public HRManager(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login() {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM hr_manager WHERE username=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}


