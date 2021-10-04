
package controladores;

import modelos.Alumno;
import DAOS_JDBC.SQLDaoManager;
import vistas.Modificar;

public class Controlador_modificar {
    
    public static Alumno objalumno=new Alumno();
    public static Modificar objmodificar=new Modificar();
    public static SQLDaoManager objmanager=new SQLDaoManager();
    
    public static void mostrar(){
        objmodificar.setLocationRelativeTo(null);
        objmodificar.setVisible(true);
    }
    public static void ocultar(){
        objmodificar.setVisible(false);
    }
    public static void modificar_alumno(){
       
       String correo_institucional=objmodificar.getCampo_correoInatitucional().getText();
       String correo_personal=objmodificar.getCampo_correoPersonal().getText();
       long numero_celular=Long.parseLong(objmodificar.getCampo_celular().getText());
       long numero_fijo=Long.parseLong(objmodificar.getCampo_fijo().getText());
       String programa=objmodificar.getCampo_programa().getText();
        
        objmanager.getAlumnoDAO().modificar_correo_institucional(correo_institucional, correo_personal, numero_celular, numero_fijo, programa);
        objmodificar.getCampo_respuesta().setText("Se modifico el estudiante");
        
    }
    public static void limpiar(){
        objmodificar.getCampo_correoInatitucional().setText("");
        objmodificar.getCampo_correoPersonal().setText("");
        objmodificar.getCampo_celular().setText("");
        objmodificar.getCampo_fijo().setText("");
        objmodificar.getCampo_programa().setText("");
        objmodificar.getCampo_respuesta().setText("");
    }
    public static void regresar(){
        limpiar();
        ocultar();
        controlador_menu_principal.mostrar();
    }
}
