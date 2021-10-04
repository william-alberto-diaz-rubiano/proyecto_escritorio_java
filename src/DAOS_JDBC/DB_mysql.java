
package DAOS_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_mysql {
   
    static Connection conectar;
    
    public static final String URL = "jdbc:mysql://localhost:3306/Universidad";
    public static final String USER = "root";
    public static final String CLAVE = "94092902700WILLIAM.";

    
    public static Connection DB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
            //System.out.println("Conexion correcta");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conectar;
    }

}
