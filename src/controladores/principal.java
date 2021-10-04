package controladores;

import DAOS_JDBC.CrudAlumnoDAO;
import vistas.Vista_consola;


public class principal {

    
    public static void main(String[] args) {
        /*
        //vista de consola
        Vista_consola objVistaConsola = new Vista_consola();
        objVistaConsola.Estudiantes_metodo();
        */
  
        //vista de varias ventanas
        controlador_menu_principal.mostrar();
        
    }
}
