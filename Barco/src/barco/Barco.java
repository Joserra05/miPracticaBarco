package barco;

/**
 *
 * @author Fran
 */
public class Barco {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;

    /* Constructor sin argumentos */
    public Barco ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // barco
    
    public Barco (String nom, double precio, int stock)
    {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
    }
   // Método para asignar el nombre del barco
    public void asignarNombre(String nom)
    {
        nombre = nom;
    }
    // Método que me devuelve el nombre del barco
    public String obtenerNombre()
    {
        return nombre;
    }

    // Método que me devuelve el stock de barcos disponible en cada momento
     public int obtenerStock ()
    {
        return stock;
    }

    /* Método para comprar barcos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception("No se puede comprar un nº negativo de barcos");
        stock = stock + cantidad;
    }

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de barcos");
        if (obtenerStock() < cantidad)
            throw new Exception ("No hay suficientes barcos para vender");
        stock = stock - cantidad;
    }

    // Método adicional para calcular el precio total del stock disponible
    public double calcularValorStock() {
        return stock * precio;
    }

    // Método adicional para aplicar un descuento al precio
    public void aplicarDescuento(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100)
            throw new Exception("Porcentaje de descuento inválido");
        precio -= precio * (porcentaje / 100);
    }
}
