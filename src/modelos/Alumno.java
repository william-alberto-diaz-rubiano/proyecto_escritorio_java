package modelos;

import java.util.Objects;
import java.util.logging.Logger;

public class Alumno {

    private String Nombres;
    private String Apellidos;
    private String Fecha_nacimiento;
    private String Correo_institucional;
    private String Correo_personal;
    private long Numero_celular;
    private long Numero_fijo;
    private String Programa_academico;

    public Alumno(String Nombres, String Apellidos, String Fecha_nacimiento, String Correo_institucional, String Correo_personal, long Numero_celular, long Numero_fijo, String Programa_academico) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Correo_institucional = Correo_institucional;
        this.Correo_personal = Correo_personal;
        this.Numero_celular = Numero_celular;
        this.Numero_fijo = Numero_fijo;
        this.Programa_academico = Programa_academico;
    }


    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getCorreo_institucional() {
        return Correo_institucional;
    }

    public void setCorreo_institucional(String Correo_institucional) {
        this.Correo_institucional = Correo_institucional;
    }

    public String getCorreo_personal() {
        return Correo_personal;
    }

    public void setCorreo_personal(String Correo_personal) {
        this.Correo_personal = Correo_personal;
    }

    public long getNumero_celular() {
        return Numero_celular;
    }

    public void setNumero_celular(long Numero_celular) {
        this.Numero_celular = Numero_celular;
    }

    public long getNumero_fijo() {
        return Numero_fijo;
    }

    public void setNumero_fijo(long Numero_fijo) {
        this.Numero_fijo = Numero_fijo;
    }

    public String getPrograma_academico() {
        return Programa_academico;
    }

    public void setPrograma_academico(String Programa_academico) {
        this.Programa_academico = Programa_academico;
    }

    @Override
    public String toString() {
        return "\nNombres: " + Nombres + "\nApellidos: " + Apellidos + "\nFecha nacimiento: " + Fecha_nacimiento + "\nCorreo institucional: " + Correo_institucional + "\nCorreo personal: " + Correo_personal + "\nNúmero de teléfono celular: " + Numero_celular + "\nNúmero de teléfono fijo: " + Numero_fijo + "\nProgram académico: " + Programa_academico + "\n";
    }

    public Alumno() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Nombres);
        hash = 37 * hash + Objects.hashCode(this.Apellidos);
        hash = 37 * hash + Objects.hashCode(this.Fecha_nacimiento);
        hash = 37 * hash + Objects.hashCode(this.Correo_institucional);
        hash = 37 * hash + Objects.hashCode(this.Correo_personal);
        hash = 37 * hash + (int) (this.Numero_celular ^ (this.Numero_celular >>> 32));
        hash = 37 * hash + (int) (this.Numero_fijo ^ (this.Numero_fijo >>> 32));
        hash = 37 * hash + Objects.hashCode(this.Programa_academico);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.Numero_celular != other.Numero_celular) {
            return false;
        }
        if (this.Numero_fijo != other.Numero_fijo) {
            return false;
        }
        if (!Objects.equals(this.Nombres, other.Nombres)) {
            return false;
        }
        if (!Objects.equals(this.Apellidos, other.Apellidos)) {
            return false;
        }
        if (!Objects.equals(this.Fecha_nacimiento, other.Fecha_nacimiento)) {
            return false;
        }
        if (!Objects.equals(this.Correo_institucional, other.Correo_institucional)) {
            return false;
        }
        if (!Objects.equals(this.Correo_personal, other.Correo_personal)) {
            return false;
        }
        if (!Objects.equals(this.Programa_academico, other.Programa_academico)) {
            return false;
        }
        return true;
    }
    
    
  
}
