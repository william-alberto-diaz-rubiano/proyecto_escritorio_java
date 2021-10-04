package DAOS_JDBC;

import java.util.List;
import modelos.Alumno;
import DAOS_JDBC.AlumnoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CrudAlumnoDAO implements AlumnoDAO {

    int id;
    String Correo_institucional;
    
    static final String CREATE = "CREATE TABLE estudiantes (Nombres TEXT NOT NULL,Apellidos TEXT NOT NULL,Fecha_nacimiento TEXT NOT NULL,Correo_institucional TEXT NOT NULL,Correo_personal TEXT NOT NULL,Numero_celular INTEGER NOT NULL,Numero_fijo INTEGER NOT NULL,Programa_academico TEXT NOT NULL)";
    final String INSERT = "INSERT INTO estudiantes (Nombres,Apellidos,Fecha_nacimiento,Correo_institucional,Correo_personal,Numero_celular,Numero_fijo,Programa_academico) VALUES(?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE estudiantes SET Nombres=?,Apellidos=?,Fecha_nacimiento=?,Correo_institucional=?,Correo_personal=?,Numero_celular=?,Numero_fijo=?,Programa_academico=? WHERE Correo_institucional=?";
    final String DELETE = "DELETE FROM estudiantes WHERE Correo_institucional=?";
    final String GETALL = "SELECT * FROM estudiantes";
    final String GETONE = "SELECT * FROM estudiantes WHERE Correo_institucional=?";

    final String UPDATE_CORREOINSTITUCIONAL = "UPDATE estudiantes SET Correo_personal=?,Numero_celular=?,Numero_fijo=?,Programa_academico=? WHERE Correo_institucional=?";
    final String GETONE_CORREOINSTITUCIONAL = "SELECT * FROM estudiantes WHERE Correo_institucional=?";
    final String GET_APELLIDOS = "SELECT * FROM estudiantes WHERE Apellidos=?";
    final String GET_PROGRAMAACADEMICO = "SELECT * FROM estudiantes WHERE Programa_academico=?";
    final String GET_PROGRAMAACADEMICO_ESTUDIANTES = "SELECT * FROM estudiantes WHERE Programa_academico=?";
    final String GET_FECHANACIMIENTO = "SELECT * FROM estudiantes WHERE Fecha_nacimiento=?";
    final String GET_NUMEROCELULAR = "SELECT * FROM estudiantes WHERE Numero_celular=?";

    static Connection conectar;
    PreparedStatement statement;
    static Statement s;
    ResultSet res;
    Alumno alumno;

    public CrudAlumnoDAO(Connection conectar) {
        this.conectar = conectar;
    }

    public static boolean crearTabla(String tabla){
        
        try {
            
           s=conectar.createStatement();
            s.executeUpdate(tabla);
            s.close();
            return true;
            
        } catch (Exception e) {
        }
        return false;
    }
    
    
    @Override
    public void crear(Alumno a) {
        try {
            //crearTabla(CREATE);
            
            statement = conectar.prepareStatement(INSERT);

            statement.setString(1, a.getNombres());
            statement.setString(2, a.getApellidos());
            statement.setString(3, a.getFecha_nacimiento());
            statement.setString(4, a.getCorreo_institucional());
            statement.setString(5, a.getCorreo_personal());
            statement.setDouble(6, a.getNumero_celular());
            statement.setDouble(7, a.getNumero_fijo());
            statement.setString(8, a.getPrograma_academico());

            statement.executeUpdate();
            //System.out.println("Se ha creado el usuario con exito.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
    }

    @Override
    public void modificar(Alumno a) {
        try {
            statement = conectar.prepareStatement(UPDATE);

            statement.setString(2, a.getNombres());
            statement.setString(3, a.getApellidos());
            statement.setString(4, a.getFecha_nacimiento());
            statement.setString(5, a.getCorreo_personal());
            statement.setLong(6, a.getNumero_celular());
            statement.setLong(7, a.getNumero_fijo());
            statement.setString(8, a.getPrograma_academico());
            statement.setString(9, a.getCorreo_institucional());

            statement.executeUpdate();
            //System.out.println("Se ha actualizado el usuario con exito.");
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }

    }

    @Override
    public void eliminar(String Correo_institucional) {
        try {

            statement = conectar.prepareStatement(DELETE);
            statement.setString(1, Correo_institucional);
            statement.executeUpdate();
            //System.out.println("Se ha eliminado el usuario con exito.");

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }

    }

    @Override
    public Alumno obtener(String Correo_institucional) {
        Alumno alumno = null;
        try {
            statement = conectar.prepareStatement(GETONE);
            statement.setString(1, Correo_institucional);
            res = statement.executeQuery();

            if (res.next()) {
                alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );
            } else {

                System.out.println("No se ha encontrado ese registro");

            }

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return alumno;

    }

    @Override
    public ArrayList<Alumno> obtenerTodos() {
        ArrayList<Alumno> listRes = new ArrayList();
        try {
            s = conectar.createStatement();
            res = s.executeQuery(GETALL);
            while (res.next()) {
                Alumno alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );
                listRes.add(alumno);

            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return listRes;

    }

    @Override
    public Alumno obtener_correo_institucional(String Correo_institucional) {
        Alumno alumno = null;
        try {
            statement = conectar.prepareStatement(GETONE_CORREOINSTITUCIONAL);
            statement.setString(1, Correo_institucional);
            res = statement.executeQuery();

            if (res.next()) {
                alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );
            } else {

                System.out.println("No se ha encontrado ese registro");

            }

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return alumno;
    }

    @Override
    public List<Alumno> obtener_apellidos(String Apellidos) {
        ArrayList<Alumno> listRes = new ArrayList();
        try {
            statement = conectar.prepareStatement(GET_APELLIDOS);
            statement.setString(1, Apellidos);
            res = statement.executeQuery();

            while (res.next()) {
                Alumno alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );
                listRes.add(alumno);

            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return listRes;
    }

    @Override
    public List<Alumno> obtener_programa_academico(String Programa_academico) {
        ArrayList<Alumno> listRes = new ArrayList();
        try {
            statement = conectar.prepareStatement(GET_PROGRAMAACADEMICO);
            statement.setString(1, Programa_academico);
            res = statement.executeQuery();

            while (res.next()) {
                Alumno alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );

                listRes.add(alumno);

            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return listRes;
    }

    @Override
    public int obtener_programa_estudiantes(String Programa_academico) {
        ArrayList<Alumno> listRes = new ArrayList();
        int count = 0;
        try {
            statement = conectar.prepareStatement(GET_PROGRAMAACADEMICO_ESTUDIANTES);
            statement.setString(1, Programa_academico);
            res = statement.executeQuery();

            while (res.next()) {
                count = count + 1;
                Alumno alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );

                listRes.add(alumno);

            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return count;
    }

    @Override
    public List<Alumno> obtener_fechaNacimiento(String Fecha_nacimieto) {
        ArrayList<Alumno> listRes = new ArrayList();
        try {
            statement = conectar.prepareStatement(GET_FECHANACIMIENTO);
            statement.setString(1, Fecha_nacimieto);
            res = statement.executeQuery();

            while (res.next()) {
                Alumno alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );
                listRes.add(alumno);

            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return listRes;

    }

    @Override
    public List<Alumno> obtener_numeroCelular(long Numero_celular) {
        ArrayList<Alumno> listRes = new ArrayList();
        try {
            statement = conectar.prepareStatement(GET_NUMEROCELULAR);
            statement.setLong(1, Numero_celular);
            res = statement.executeQuery();

            while (res.next()) {
                Alumno alumno = new Alumno(
                        res.getString("Nombres"),
                        res.getString("Apellidos"),
                        res.getString("Fecha_nacimiento"),
                        res.getString("Correo_institucional"),
                        res.getString("Correo_personal"),
                        res.getLong("Numero_celular"),
                        res.getLong("Numero_fijo"),
                        res.getString("Programa_academico")
                );

                listRes.add(alumno);

            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
        return listRes;
    }

    @Override
    public void modificar_correo_institucional(String Correo_institucional, String Correo_personal, long Numero_celular, long Numero_fijo, String Programa_academico) {
        try {
            statement = conectar.prepareStatement(UPDATE_CORREOINSTITUCIONAL);
            
            statement.setString(1, Correo_personal);
            statement.setLong(2, Numero_celular);
            statement.setLong(3, Numero_fijo);
            statement.setString(4, Programa_academico);
            statement.setString(5, Correo_institucional);

            statement.executeUpdate();
            System.out.println("Alumno modificado");

        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

        }
    }
}
