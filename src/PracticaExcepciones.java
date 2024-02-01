public class PracticaExcepciones {
    private int a=0;
    private int b=300;

    protected void calcularCociente(){
        int resultado=0;

        try {
            if(a==0){
                throw new IllegalArgumentException("No se puede dividir por cero");
            }

            resultado=b/a;
        }catch (IllegalArgumentException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("Programa finalizado");
        }
    };
}
