package controladores;

import vistas.Menu_principal;

public class controlador_menu_principal {

    public static Menu_principal objmenu_principal = new Menu_principal();

    public static void mostrar() {
        objmenu_principal.setLocationRelativeTo(null);
        objmenu_principal.setVisible(true);
    }

    public static void ocultar() {
        objmenu_principal.setVisible(false);
    }

    public static void ingresar_estudiante() {
        ocultar();
        Controlador_ingresar.mostrar();
    }

    public static void consultas() {
        ocultar();
        Controlador_consultar.mostrar();
    }

    public static void modificar() {
        ocultar();
        Controlador_modificar.mostrar();
    }

    public static void eliminar() {
        ocultar();
        Controlador_eliminar.mostrar();
    }

    public static void directorio() {
        ocultar();
        Controlador_directorio.mostrar();
    }
}
