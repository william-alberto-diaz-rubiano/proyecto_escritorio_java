
package controladores;

import DAOS_JDBC.SQLDaoManager;
import vistas.Eliminar;

public class Controlador_eliminar {
    
    public static Eliminar objeliminar=new Eliminar();
    public static SQLDaoManager objmanager=new SQLDaoManager(); 
            
     public static void mostrar(){
         objeliminar.setLocationRelativeTo(null);
        objeliminar.setVisible(true);
    }
    public static void ocultar(){
        objeliminar.setVisible(false);
    }
    public static void limpiar(){
        objeliminar.getCampo_correoInstitucional().setText("");
        objeliminar.getCampo_respuesta().setText("");
    }
    public static void regresar(){
        limpiar();
        ocultar();
        controlador_menu_principal.mostrar();
    }
    public static void eliminar(){
        String correo=objeliminar.getCampo_correoInstitucional().getText();
        objmanager.getAlumnoDAO().eliminar(correo);
        objeliminar.getCampo_respuesta().setText("Se elimino el estudiante con exito.");
    }
}
