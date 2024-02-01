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
        return super.toString() +
                "Perecedero{"+
                "Dias por Caducar="+diasPorCaducar+
                '}';
    }

    @Override
    protected double calcular(int cantidad){
        // Accediendo al metodo de la clase padre para hallar el resultadp
        double resultado=super.calcular(cantidad);
        return switch (diasPorCaducar){
            case 1 -> resultado/4;
            case 2 -> resultado/3;
            case 3 -> resultado/2;
            default -> resultado;
        };
    }
}
