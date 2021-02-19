/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import com.sun.jndi.ldap.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FERNANDEZ
 */
public class conexion {
       //cade na de conexion
    private String cadena= "jdbc:mysql://localhost/ProyTienda";
    private String usuario= "root";
    private String clave ="Root2018";
    
    //connexion a la base de datos
    private java.sql.Connection xcon;
    
    public java.sql.Connection Conectar(){
    String driver = "com.mysql.jdbc.Driver";
//    asignar donde se encotro el driver
    try{
        Class.forName(driver);
        System.out.println("Se cargo el driver de forma correcta");
        //Realizaom la conexiona  la base de datos
        xcon = DriverManager.getConnection(cadena,usuario,clave);
        System.out.println("Se conecto a la base de datos Tienda");
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println(ex.toString());
    }
    //devolvermos la conexion
    return xcon;
    }

    public java.sql.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
