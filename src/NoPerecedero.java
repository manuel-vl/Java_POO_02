public class NoPerecedero extends  Producto{
    private String tipo;

    public NoPerecedero(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    // Getters and setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Metodos

    @Override
    public String toString() {
        return super.toString() +
                "NoPerecedero{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
