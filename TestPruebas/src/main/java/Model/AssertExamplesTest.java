package Model;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssertExamplesTest {

    @Test
    public void testAssertEquals() {
        Persona P=new Persona("Ana",20);
        assertEquals("Ana", P.getNombre()); // Verifica igualdad
    }

    @Test
    public void testAssertNotEquals() {
        Persona p = new Persona("Luis", 25);
        assertNotEquals("Ana", p.getNombre()); // Verifica desigualdad
    }

    @Test
    public void testAssertTrue() {
        Persona p = new Persona("Carlos", 30);
        assertTrue(p.esMayorDeEdad()); // Verifica condición verdadera
    }

    @Test
    public void testAssertFalse() {
        Persona p = new Persona("Peque", 10);
        assertFalse(p.esMayorDeEdad()); // Verifica condición falsa
    }
    @Test
    public void testAssertNull() {
        Persona p = null;
        assertNull(p); // Verifica que el objeto es nulo
    }
    @Test
    public void testAssertNotNull() {
        Persona p = new Persona("Laura", 22);
        assertNotNull(p); // Verifica que el objeto no es nulo
    }
    @Test
    public void testAssertSame() {
        Persona p1 = new Persona("Ana", 20);
        Persona p2 = p1;
        assertSame(p1, p2); // Verifica que son el mismo objeto
    }

    @Test
    public void testAssertNotSame() {
        Persona p1 = new Persona("Ana", 20);
        Persona p2 = new Persona("LUIS", 22);
        assertNotSame(p1, p2); // Verifica que son objetos distintos
    }

    @Test
    public void testAssertThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Persona("", -5); // Datos inválidos
        });
    }

    @Test
    public void testAssertAll() {
        Persona p = new Persona("Luis", 25);
        assertEquals("Luis", p.getNombre());
        assertTrue(p.esMayorDeEdad());
        assertNotNull(p);
    }
}
