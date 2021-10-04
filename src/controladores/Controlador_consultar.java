
package controladores;

import DAOS_JDBC.SQLDaoManager;
import vistas.Consultas;

public class Controlador_consultar {
    
    public static Consultas objconsultas=new Consultas();
    public static SQLDaoManager objmanager=new SQLDaoManager();
    
    public static void mostrar(){
        objconsultas.setLocationRelativeTo(null);
        objconsultas.setVisible(true);
    }
    public static void ocultar(){
        objconsultas.setVisible(false);
    }
    public static void regresar(){
        otra_busqueda();
        ocultar();
        controlador_menu_principal.mostrar();
    }
    
    public static void buscar_correo_electronico(){
        objconsultas.getRespuestas().setText(objmanager.getAlumnoDAO().obtener_correo_institucional(objconsultas.getCampo_correo().getText()).toString());
    }
    public static void buscar_apellidos(){
        objconsultas.getRespuestas().setText(objmanager.getAlumnoDAO().obtener_apellidos(objconsultas.getCampo_apellidos().getText()).toString());
    }
    public static void buscar_programa(){
        objconsultas.getRespuestas().setText(objmanager.getAlumnoDAO().obtener_programa_academico(objconsultas.getCampo_programa().getText()).toString());
    }
    public static void buscar_programa_cantidad(){
        objconsultas.getRespuestas().setText(Integer.toString(objmanager.getAlumnoDAO().obtener_programa_estudiantes(objconsultas.getCampo_programa_cantidad().getText())));
    }
    public static void buscar_fecha_nacimiento(){
        objconsultas.getRespuestas().setText(objmanager.getAlumnoDAO().obtener_fechaNacimiento(objconsultas.getCampo_fecha().getText()).toString());
    }
    public static void buscar_celular(){
        objconsultas.getRespuestas().setText(objmanager.getAlumnoDAO().obtener_numeroCelular(Long.parseLong(objconsultas.getCampo_celular().getText())).toString());
    }
    public static void otra_busqueda(){
        objconsultas.getRespuestas().setText("");
        objconsultas.getCampo_apellidos().setText("");
        objconsultas.getCampo_celular().setText("");
        objconsultas.getCampo_correo().setText("");
        objconsultas.getCampo_fecha().setText("");
        objconsultas.getCampo_programa().setText("");
        objconsultas.getCampo_programa_cantidad().setText("");
        
    }
}
