package vistas;

import java.util.ArrayList;
import java.util.Scanner;
import modelos.Alumno;
import DAOS_JDBC.SQLDaoManager;

public class Vista_consola {

    public void Estudiantes_metodo() {
        Scanner input = new Scanner(System.in);
        Alumno objalumno = new Alumno();
        SQLDaoManager objmysqldaomanager = new SQLDaoManager();

        String Nombres;
        String apellidos;
        String Fecha_nacimiento;
        String Correo_institucional;
        String Correo_personal;
        String correo;
        String nuevo_correo;
        String nuevo_programa_academico;

        String Programa_academico;
        long Numero_celular;
        long Numero_fijo;
        long nuevo_numero_celular;
        long nuevo_numero_fijo;

        int Opcion = 1;
        int opcion_menu2;
        ArrayList<Alumno> listRes = new ArrayList();

        while (Opcion >= 1 && Opcion <= 5) {
            System.out.println("INSTITUTO LA FLORESTA");
            System.out.println("Seleccione tarea a realizar: ");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Consultas");
            System.out.println("3. Modificar estudiante");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Ver directorio de estudiantes");
            System.out.println("6. Salir");
            System.out.println("Opción: ");
            Opcion = input.nextInt();
            input.nextLine();

            switch (Opcion) {
                case (1):

                    System.out.println("\nIngresar estudiante");
                    System.out.println("Ingresar nombres: ");
                    Nombres = input.nextLine();
                    objalumno.setNombres(Nombres);

                    System.out.println("\nIngresar apellidos: ");
                    apellidos = input.nextLine();
                    objalumno.setApellidos(apellidos);

                    System.out.println("\nIngresar fecha de nacimiento (YYYY-MM-DD): ");
                    Fecha_nacimiento = input.nextLine();
                    objalumno.setFecha_nacimiento(Fecha_nacimiento);

                    System.out.println("\nIngresar correo institucional: ");
                    Correo_institucional = input.nextLine();
                    objalumno.setCorreo_institucional(Correo_institucional);

                    System.out.println("\nIngresar correo personal: ");
                    Correo_personal = input.nextLine();
                    objalumno.setCorreo_personal(Correo_personal);

                    System.out.println("\nIngresar número de celular: ");
                    Numero_celular = input.nextLong();
                    objalumno.setNumero_celular(Numero_celular);

                    System.out.println("\nIngresar número fijo: ");
                    Numero_fijo = input.nextLong();
                    objalumno.setNumero_fijo(Numero_fijo);

                    input.nextLine();

                    System.out.println("\nIngresar programa: ");
                    Programa_academico = input.nextLine();
                    objalumno.setPrograma_academico(Programa_academico);

                    objmysqldaomanager.getAlumnoDAO().crear(objalumno);
                    System.out.println("\nSe agregó el estudiante\n");

                    break;
                case (2):

                    System.out.println("Consultas");
                    System.out.println("Seleccione la consulta a realizar: ");
                    System.out.println("1. Buscar estudiante por correo electronico");
                    System.out.println("2. Buscar estudiante por apellidos");
                    System.out.println("3. Buscar por programa");
                    System.out.println("4. Buscar cantidad de estudiantes por programa");
                    System.out.println("5. Buscar por fecha de nacimiento");
                    System.out.println("6. Buscar por número de celular");
                    System.out.println("Opción: ");
                    opcion_menu2 = input.nextInt();
                    input.nextLine();

                    switch (opcion_menu2) {
                        case (1):
                            System.out.println("\n1.Buscar estudiante por correo electronico");
                            System.out.println("Ingresar correo institucional: ");
                            correo = input.nextLine();
                            System.out.println(objmysqldaomanager.getAlumnoDAO().obtener_correo_institucional(correo));

                            break;

                        case (2):

                            System.out.println("\n2.Buscar estudiante por apellidos");
                            System.out.println("Ingresar apellidos: ");
                            apellidos = input.nextLine();
                            objmysqldaomanager.getAlumnoDAO().obtener_apellidos(apellidos).forEach(System.out::println);
                            
                            break;

                        case (3):

                            System.out.println("\n3.Buscar por programa");
                            System.out.println("Ingresar programa: ");
                            Programa_academico = input.nextLine();
                            objmysqldaomanager.getAlumnoDAO().obtener_programa_academico(Programa_academico).forEach(System.out::println);

                            break;

                        case (4):

                            System.out.println("\n3.Buscar cantidad de estudiantes por programa");
                            System.out.println("Ingresar programa: ");
                            Programa_academico = input.nextLine();
                            System.out.println("\nCantidad estudiantes " + Programa_academico + ": " + objmysqldaomanager.getAlumnoDAO().obtener_programa_estudiantes(Programa_academico));
                            break;

                        case (5):
                            System.out.println("\n5.Buscar por fecha de nacimiento");
                            System.out.println("Ingresar fecha de nacimiento: ");
                            Fecha_nacimiento = input.nextLine();
                            objmysqldaomanager.getAlumnoDAO().obtener_fechaNacimiento(Fecha_nacimiento).forEach(System.out::println);

                            break;

                        case (6):
                            System.out.println("\n6.Buscar por número de celular");
                            System.out.println("Ingresar número de celular: ");
                            Numero_celular = input.nextLong();
                            objmysqldaomanager.getAlumnoDAO().obtener_numeroCelular(Numero_celular).forEach(System.out::println);

                            break;

                    }
                    break;
                case (3):
                    System.out.println("\nModificar estudiante");

                    System.out.println("Ingresar correo institucional: ");
                    correo = input.nextLine();

                    System.out.println("\nIngresar correo personal: ");
                    nuevo_correo = input.nextLine();

                    System.out.println("\nIngresar número de celular: ");
                    nuevo_numero_celular = input.nextLong();
                    input.nextLine();

                    System.out.println("\nIngresar número fijo: ");
                    nuevo_numero_fijo = input.nextLong();
                    input.nextLine();

                    System.out.println("Ingresar programa: ");
                    nuevo_programa_academico = input.nextLine();

                    objmysqldaomanager.getAlumnoDAO().modificar_correo_institucional(correo, nuevo_correo, nuevo_numero_celular, nuevo_numero_fijo, nuevo_programa_academico);

                    System.out.println("Se modificó el estudiante\n");

                    break;

                case (4):
                    System.out.println("\nEliminar estudiante");
                    System.out.println("Ingresar correo institucional: ");
                    correo = input.nextLine();

                    objmysqldaomanager.getAlumnoDAO().eliminar(correo);

                    System.out.println("\nSe eliminó el estudiante\n");
                    break;

                case (5):
                    System.out.println("El directorio de los estudiantes");
                    objmysqldaomanager.getAlumnoDAO().obtenerTodos().forEach(System.out::println);

                    break;
                default:
                    System.out.println("\nHasta pronto");
            }

        }

    }

}
