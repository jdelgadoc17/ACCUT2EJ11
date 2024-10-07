import java.util.Calendar;

public class Deportista {

    private String DNI;
    private String nombre;
    private Calendar fechaNacimiento;
    private Enum<TipoDeportista> tipo;


    public Deportista(String DNI, String nombre, Calendar fechaNacimiento, Enum<TipoDeportista> tipo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.tipo = tipo;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Enum<TipoDeportista> getTipo() {
        return tipo;
    }

    public void setTipo(Enum<TipoDeportista> tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Deportista{" +
                "DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", tipo=" + tipo +
                '}';
    }
}
