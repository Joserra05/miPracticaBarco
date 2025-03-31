package barco;

/**
 *
 * @author José Ramón
 */
public class Barco {

    private String nombre;
    private double precio;
    private double precioIVA;
    private int stock;
	private String modelo;
	private String color;
    
    /* Constructor sin argumentos */
    public Barco ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // barco
    
    public Barco(String nom, double precio, int stock, String modelo, String color) {
        this.nombre = nom;
        this.precio = precio;
        this.stock = stock;
        this.modelo = modelo;
        this.color = color;
    }
  
   // Método para asignar el nombre del barco
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    // Método que me devuelve el nombre del barco
    public String obtenerNombre()
    {
        return getNombre();
    }

    // Método que me devuelve el stock de barcos disponible en cada momento
     public int obtenerStock ()
    {
        return getStock();
    }

    /* Método para comprar barcos. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception("No se puede comprar un nº negativo de barcos");
        setStock(getStock() + cantidad);
    }

    public void vender (int cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de barcos");
        if (obtenerStock() < cantidad)
            throw new Exception ("No hay suficientes barcos para vender");
        setStock(getStock() - cantidad);
    }

    // Método adicional para calcular el precio total del stock disponible
    public double calcularValorStock() {
        return getStock() * getPrecio();
    }

    // Método adicional para aplicar un descuento al precio
    public void aplicarDescuento(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100)
            throw new Exception("Porcentaje de descuento inválido");
        setPrecio(getPrecio() - getPrecio() * (porcentaje / 100));
    }

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

	public String obtenerModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String obtenerColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void personalizarBarco(String string, String string2) {

		this.setModelo(string);
		this.setColor(string2);
	}
}
