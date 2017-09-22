/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Sharayu
 */
import java.sql.*;

public class database 
{
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    database()
    {
        try
        {

        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("https://NAMEHIDDEN.soi.city.ac.uk:5454/~kdhy546","root","");

                    stmt=con.prepareStatement("select * from staff where username=? and password=?");
        }

    catch (Exception e) 
    {
        System.out.println(e);
    }
    }
}
