package barco;

/**
 * Clase principal para probar la funcionalidad de la clase Barco.
 * Se crean instancias de Barco y se realizan operaciones de venta, compra, 
 * aplicación de descuento y personalización del modelo y color.
 *
 */
public class MainBarco {

    public static void main(String[] args) {
        Barco barco1;
        int stockActual;

        barco1 = new Barco("Titanic", 500000, 20, "Modelo Clásico", "Blanco");

        operativa_barcos(barco1, 300);

        stockActual = barco1.obtenerStock();
        System.out.println("El stock actual es: " + stockActual);

        double valorStock = barco1.calcularValorStock();
        System.out.println("El valor total del stock es: " + valorStock);

        try {
            barco1.aplicarDescuento(10);
            System.out.println("Se aplicó un descuento del 10%.");
        } catch (Exception e) {
            System.out.println("Error al aplicar descuento: " + e.getMessage());
        }

        barco1.personalizarBarco("Modelo Deportivo", "Rojo");
        System.out.println("El modelo actual es: " + barco1.obtenerModelo());
        System.out.println("El color actual es: " + barco1.obtenerColor());
    }

	private static void operativa_barcos(Barco barco1, int cantidad) {
		try {
            System.out.println("Venta de Barcos");
            barco1.vender(5);
        } catch (Exception e) {
            System.out.println("Fallo al vender: " + e.getMessage());
        }

        try {
            System.out.println("Compra de Barcos");
            barco1.comprar(10);
        } catch (Exception e) {
            System.out.println("Fallo al comprar: " + e.getMessage());
        }
	}
}
