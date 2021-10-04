package DAOS_JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB_sqlite {

    static Connection conectar;
    
    
    public static final String URL = "jdbc:sqlite:";
    static String DATABASE="bd_estudiantes.db";
      
    
     public static Connection DB() {
        //Connection conectar = null;
        try {
            //Class.forName("com.sqlite.JDBC");
            conectar = (Connection) DriverManager.getConnection(URL+DATABASE);
            //System.out.println("Conexion correcta");
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return conectar;
    }
    
    

}
