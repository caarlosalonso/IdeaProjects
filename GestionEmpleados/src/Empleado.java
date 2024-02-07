import java.util.Objects;

public class Empleado {
    //Atributos
    private String dni;
    private String nombre;
    private String apellido;
    private String departamento;
    private Integer sueldo;

    //Constructores
    public Empleado (String dni, String nombre, String apellido, String departamento, Integer sueldo){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }
    public Empleado (String dni){
        this.dni = dni;
        this.nombre = null;
        this.apellido = null;
        this.departamento = null;
        this.sueldo = null;
    }

    //Getters y Setters
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getDepartamento(){
        return departamento;
    }
    public Integer getSueldo(){
        return sueldo;
    }

    //Metodos
    public String toString(){
        String mostrar = "DNI= " +dni;
        mostrar=mostrar + ", nombre= " +nombre;
        mostrar=mostrar + ", apellido= " + apellido;
        mostrar=mostrar + ", departamento= " + departamento;
        mostrar=mostrar + ", sueldo= " + sueldo;
        return mostrar;
    }

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(dni, empleado.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    public void subirSalario (Integer variacion){
        this.sueldo = (int) (sueldo * (1 + (float) variacion / 100));
    }
    public String mostrarReducido(){
        String mostrarR = "DNI= " +dni;
        mostrarR=mostrarR + ", nombre= " +nombre;
        mostrarR=mostrarR + ", sueldo= " +sueldo;
        return mostrarR;
    }
    public String mostrarDepto(){
        String mostrarD = "DNI= " +dni;
        mostrarD=mostrarD + ", nombre " +nombre;
        mostrarD=mostrarD + ", departamento= " +departamento;
        return mostrarD;
    }
}


