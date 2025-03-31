package barco;

import junit.framework.TestCase;

/**
 * Test de Pruebas JUnit para la Clase Barco
 */
public class BarcoTest extends TestCase {

    public BarcoTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test para el método Comprar. Si el método comprar es correcto la prueba debe ser exitosa
     */
    public void testComprar1() throws Exception {
        System.out.println("Test de prueba para Comprar");
        int cantidad = 100;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        barco1.comprar(cantidad);
        assertTrue(barco1.obtenerStock() == 400);
    }

    /**
     * Test para el método Comprar. Esta prueba debe ser fallida porque intento comprar una
     * cantidad negativa de barcos
     */
    public void testComprar2() throws Exception {
        System.out.println("Test de prueba para Comprar");
        int cantidad = -100;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        try {
            barco1.comprar(cantidad);
            fail("Se esperaba una excepcion por cantidad negativa");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    /**
     * Test para el método Vender. Si el método vender es correcto la prueba debe ser exitosa
     */
    public void testVender1() throws Exception {
        System.out.println("Test de prueba para Vender");
        int cantidad = 200;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        barco1.vender(cantidad);
        assertTrue(barco1.obtenerStock() == 100);
    }

    /**
     * Test para el método Vender. Esta prueba debe ser fallida porque intento vender más barcos
     * de los que hay en stock
     */
    public void testVender2() throws Exception {
        System.out.println("Test de prueba para Vender");
        int cantidad = 400;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        try {
            barco1.vender(cantidad);
            fail("Se esperaba una excepcion por cantidad mayor al stock");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    /**
     * Test para el método Vender. Esta prueba debe ser fallida porque intento vender una
     * cantidad negativa de barcos
     */
    public void testVender3() throws Exception {
        System.out.println("Test de prueba para Vender");
        int cantidad = -200;
        Barco barco1 = new Barco("Titanic", 500000, 300, "Modelo Clásico", "Blanco");
        try {
            barco1.vender(cantidad);
            fail("Se esperaba una excepcion por cantidad negativa");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
