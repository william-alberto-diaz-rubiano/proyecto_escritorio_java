
package controladores;

import DAOS_JDBC.SQLDaoManager;
import vistas.Directorio;


public class Controlador_directorio {
    
    public static Directorio objdirectorio=new Directorio();
    public static SQLDaoManager objmanager=new SQLDaoManager();
    
    public static void mostrar(){
        objdirectorio.setLocationRelativeTo(null);
        objdirectorio.setVisible(true);
    }
    public static void ocultar(){
        objdirectorio.setVisible(false);
    }
    public static void limpiar(){
        objdirectorio.getCampo_respuesta().setText("");
    }
    public static void directorio(){
        objdirectorio.getCampo_respuesta().setText(objmanager.getAlumnoDAO().obtenerTodos().toString());
    }
    public static void regresar(){
        limpiar();
        ocultar();
        controlador_menu_principal.mostrar();
    }
}
