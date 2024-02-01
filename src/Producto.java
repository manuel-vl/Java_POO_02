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
                "Nombre=" + nombre + '\'' +
                "Precio=" + precio +
                '}';
    }

    protected double calcular(int cantidad){
        double result=cantidad*precio;
        return result;
    }
}
