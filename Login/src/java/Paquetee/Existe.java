package Paquetee;

import java.sql.*;

/**
 * @author 5IM6 Hernández Marín Miguel Angel, Sánchez López Luis Ignacio
 * @version 1.2 05/09/2017
 */
public class Existe {

    /**
     * Se conecta a la base de datos y regresa un valor de acuerdo a 
     * si existe o no el usuario respectivo a su contraseña
     * 
     * @param user de Login.java
     * @param pass de Login.java
     * @return rs.next()
     */
    public static boolean doExist(String user, String pass) {
        boolean st = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "n0m3l0");
            PreparedStatement ps = con.prepareStatement("select * from tabla where usere=? and pass=?");
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            st = rs.next();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return st;
    }
}
