public class Producto {
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodos
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ",precio=" + precio +
                '}';
    }

    private double calcular(int cantidadDeProductos){
        double result=cantidadDeProductos*precio;
        return result;
    }
}
