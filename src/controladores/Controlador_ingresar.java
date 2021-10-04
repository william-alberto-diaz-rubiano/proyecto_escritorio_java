package controladores;

import modelos.Alumno;
import vistas.Ingresar_estudiante;
import DAOS_JDBC.SQLDaoManager;

public class Controlador_ingresar {

    public static Ingresar_estudiante objingresar = new Ingresar_estudiante();
    public static Alumno objalumno = new Alumno();
    public static SQLDaoManager objmanager = new SQLDaoManager();

    public static void mostrar() {
        objingresar.setLocationRelativeTo(null);
        objingresar.setVisible(true);
    }

    public static void ocultar() {
        objingresar.setVisible(false);
    }

    public static void regresar() {
        limpiar();
        ocultar();
        controlador_menu_principal.mostrar();

    }

    public static void crear() {
        objalumno.setNombres(objingresar.getCampo_nombres().getText());
        objalumno.setApellidos(objingresar.getCampo_apellidos().getText());
        objalumno.setFecha_nacimiento(objingresar.getCampo_fechanacimiento().getText());
        objalumno.setCorreo_institucional(objingresar.getCampo_correoinst().getText());
        objalumno.setCorreo_personal(objingresar.getCampo_correoperso().getText());
        objalumno.setNumero_celular(Long.parseLong(objingresar.getCampo_numcelular().getText()));
        objalumno.setNumero_fijo(Long.parseLong(objingresar.getCampo_numfijo().getText()));
        objalumno.setPrograma_academico(objingresar.getCampo_programa().getText());

        objmanager.getAlumnoDAO().crear(objalumno);
        objingresar.getCampo_respuesta().setText("Alumno creado");
    }

    public static void limpiar() {
        objingresar.getCampo_apellidos().setText("");
        objingresar.getCampo_correoinst().setText("");
        objingresar.getCampo_correoperso().setText("");
        objingresar.getCampo_fechanacimiento().setText("");
        objingresar.getCampo_nombres().setText("");
        objingresar.getCampo_numcelular().setText("");
        objingresar.getCampo_numfijo().setText("");
        objingresar.getCampo_programa().setText("");
        objingresar.getCampo_respuesta().setText("");
    }
}
