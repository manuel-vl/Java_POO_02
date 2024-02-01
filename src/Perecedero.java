public class Perecedero extends Producto{
    private int diasPorCaducar;

    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    // Getters and setters
    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    // Metodos

    @Override
    public String toString() {
        return "Perecedero{" +
                "nombre="+getNombre()+'\''+
                "precio="+getPrecio()+'\''+
                ",diasPorCaducar=" + diasPorCaducar +
                '}';
    }
}
