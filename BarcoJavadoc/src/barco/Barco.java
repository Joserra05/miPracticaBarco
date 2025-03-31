package barco;

/**
 * Clase que representa un barco con sus propiedades básicas y operaciones comerciales.
 * Permite gestionar el nombre, precio, stock, modelo y color del barco, así como realizar
 * operaciones de compra, venta, aplicación de descuentos y personalización.
 * 
 * @author José Ramón
 * @version 1.0
 */
public class Barco {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;
    private String modelo;
    private String color;
    
    /**
     * Constructor sin argumentos. Crea una instancia de Barco con valores por defecto.
     */
    public Barco() {
    }
    
    /**
     * Constructor con parámetros para inicializar todas las propiedades del barco.
     *
     * @param nom    Nombre del barco.
     * @param precio Precio unitario del barco.
     * @param stock  Cantidad disponible en stock.
     * @param modelo Modelo del barco.
     * @param color  Color del barco.
     */
    public Barco(String nom, double precio, int stock, String modelo, String color) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
        this.modelo = modelo;
        this.color = color;
    }
  
    /**
     * Asigna un nuevo nombre al barco.
     *
     * @param nom Nuevo nombre del barco.
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }
    
    /**
     * Obtiene el nombre actual del barco.
     *
     * @return Nombre del barco.
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Obtiene la cantidad actual de barcos en stock.
     *
     * @return Stock disponible.
     */
    public int obtenerStock() {
        return getStock();
    }

    /**
     * Aumenta el stock comprando una cantidad de barcos.
     *
     * @param cantidad Número de barcos a comprar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void comprar(int cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede comprar un nº negativo de barcos");
        setStock(getStock() + cantidad);
    }

    /**
     * Reduce el stock vendiendo una cantidad de barcos.
     *
     * @param cantidad Número de barcos a vender.
     * @throws Exception Si la cantidad es negativa o superior al stock disponible.
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede vender una cantidad negativa de barcos");
        if (obtenerStock() < cantidad)
            throw new Exception("No hay suficientes barcos para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * Calcula el valor total del stock disponible (precio unitario * stock).
     *
     * @return Valor total del stock.
     */
    public double calcularValorStock() {
        return getStock() * getPrecio();
    }

    /**
     * Aplica un descuento al precio unitario del barco.
     *
     * @param porcentaje Porcentaje de descuento (0-100).
     * @throws Exception Si el porcentaje es inválido.
     */
    public void aplicarDescuento(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100)
            throw new Exception("Porcentaje de descuento inválido");
        setPrecio(getPrecio() - getPrecio() * (porcentaje / 100));
    }

    /**
     * Personaliza el modelo y color del barco.
     *
     * @param modelo Nuevo modelo del barco.
     * @param color  Nuevo color del barco.
     */
    public void personalizarBarco(String modelo, String color) {
        this.setModelo(modelo);
        this.setColor(color);
    }

    // Métodos getters y setters privados/protegidos por la encapsulación
    
    private int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }

    private double getPrecioIVA() {
        return precioIVA;
    }

    private void setPrecioIVA(double precioIVA) {
        this.precioIVA = precioIVA;
    }

    private double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    private String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el modelo actual del barco.
     *
     * @return Modelo del barco.
     */
    public String obtenerModelo() {
        return modelo;
    }

    /**
     * Establece un nuevo modelo para el barco.
     *
     * @param modelo Nuevo modelo del barco.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el color actual del barco.
     *
     * @return Color del barco.
     */
    public String obtenerColor() {
        return color;
    }

    /**
     * Establece un nuevo color para el barco.
     *
     * @param color Nuevo color del barco.
     */
    public void setColor(String color) {
        this.color = color;
    }
}