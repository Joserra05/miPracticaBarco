package barco;

/**
 * Clase principal para probar la funcionalidad de la clase Barco.
 * Se crean instancias de Barco y se realizan operaciones de venta, compra, 
 * aplicación de descuento y personalización del modelo y color.
 *
 */
public class MainBarco {

    public static void main(String[] args) {
        Barco miBarco;
        int stockActual;

        miBarco = new Barco("Titanic", 500000, 20, "Modelo Clásico", "Blanco");

        try {
            System.out.println("Venta de Barcos");
            miBarco.vender(5);
        } catch (Exception e) {
            System.out.println("Fallo al vender: " + e.getMessage());
        }

        try {
            System.out.println("Compra de Barcos");
            miBarco.comprar(10);
        } catch (Exception e) {
            System.out.println("Fallo al comprar: " + e.getMessage());
        }

        stockActual = miBarco.obtenerStock();
        System.out.println("El stock actual es: " + stockActual);

        double valorStock = miBarco.calcularValorStock();
        System.out.println("El valor total del stock es: " + valorStock);

        try {
            miBarco.aplicarDescuento(10);
            System.out.println("Se aplicó un descuento del 10%.");
        } catch (Exception e) {
            System.out.println("Error al aplicar descuento: " + e.getMessage());
        }

        miBarco.personalizarBarco("Modelo Deportivo", "Rojo");
        System.out.println("El modelo actual es: " + miBarco.obtenerModelo());
        System.out.println("El color actual es: " + miBarco.obtenerColor());
    }
}
