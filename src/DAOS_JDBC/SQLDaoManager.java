
package DAOS_JDBC;

public class SQLDaoManager implements DAOManager {
    AlumnoDAO alumnos=null;

    @Override
    public AlumnoDAO getAlumnoDAO() {
         if (alumnos ==null){
             alumnos=new CrudAlumnoDAO(DB_mysql.DB()); // DB_sqlite.DB()
         }
         return alumnos;
    }
}
