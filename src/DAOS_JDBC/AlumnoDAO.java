
package DAOS_JDBC;

import java.util.List;
import modelos.Alumno;

public interface AlumnoDAO extends DAO<Alumno, String>{   
    void modificar_correo_institucional(String Correo_institucional,String Correo_personal,long Numero_celular,long Numero_fijo,String Programa_academico);
    Alumno obtener_correo_institucional(String Correo_institucional);
    List<Alumno> obtener_apellidos(String Apellidos);
    List<Alumno> obtener_programa_academico(String Programa_academico);
    int obtener_programa_estudiantes(String Programa_academico);
    List<Alumno> obtener_fechaNacimiento(String Fecha_nacimieto);
    List<Alumno> obtener_numeroCelular(long Numero_celular);
    
}
