/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Amin Kaiser
 */
public class DBConnectioncode {
    public static Connection DBConnectioncode() throws ClassNotFoundException, SQLException {
        Connection con = null;
        
        Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sims_project", "root", "");
        

        if (con != null) 
        {
            System.err.println("Connected!");
        }
        
        return con;

    }
    
}
