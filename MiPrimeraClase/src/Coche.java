import java.util.Objects;

public class Coche {
    //Atributos
    private String matricula;
    private String color;
    private String modelo;
    private Integer precio;

    //Constructores
    public Coche (String matricula, String color, String modelo, Integer precio){
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Coche (String matricula, String modelo){
        this.matricula = matricula;
        this.color = null;
        this.modelo = modelo;
        this.precio = null;
    }
    public Coche (String matricula){
        this.matricula = matricula;
        this.color = null;
        this.modelo = null;
        this.precio = null;
    }

    //Metodos getters y setters
    public void setColor(String color){
        this.color = color;
    }

    //Metodos
    public String toString(){
        String mostrar = "Matricula= " + matricula;
        if(color != null){
            mostrar = mostrar + ", color= " + color;
        }
        if(modelo != null){
            mostrar = mostrar + ", modelo= " + modelo;
        }
        if(precio != null){
            mostrar = mostrar + ", precio= " + precio;
        }
        return mostrar;
    }

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return Objects.equals(matricula, coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    public void actualizarPrecio (int variacion){
        this.precio+=variacion;
    }
}