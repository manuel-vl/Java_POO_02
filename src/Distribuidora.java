import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        List<Producto> listaProductos=new ArrayList<Producto>();
        double precioTotalPerecederos=0;
        double precioTotalNoPerecederos=0;

        listaProductos.add(new Perecedero("P1", 1000, 2));
        listaProductos.add(new NoPerecedero("P2", 2500, "tipo1"));
        listaProductos.add(new Perecedero("P3", 1500, 4));
        listaProductos.add(new NoPerecedero("P4", 2000, "tipo2"));
        listaProductos.add(new Perecedero("P5", 2000, 3));
        listaProductos.add(new NoPerecedero("P6", 3000, "tipo3"));
        listaProductos.add(new Perecedero("P7", 1000, 1));
        listaProductos.add(new NoPerecedero("P8", 3000, "tipo4"));

        for (Producto p: listaProductos){
            // instanceOf permite validar si el producto es una instancia de X clase
            if(p instanceof  Perecedero){
                precioTotalPerecederos+=p.calcular(1);
            }else if(p instanceof  NoPerecedero){
                precioTotalNoPerecederos+=p.calcular(1);
            }
        }

        System.out.println("Total vendidos perecederos: "+precioTotalPerecederos);
        System.out.println("Total vendidos no perecederos: "+precioTotalNoPerecederos);
    }
}
