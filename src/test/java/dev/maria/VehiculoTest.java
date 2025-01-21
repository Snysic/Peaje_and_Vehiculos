package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    public void testGetPlaca() {
        Vehiculo vehiculo = new Vehiculo("ABC123");
        assertEquals("ABC123", vehiculo.getPlaca());
    }

    @Test
    public void testSetPlaca() {
        Vehiculo vehiculo = new Vehiculo("ABC123");
        vehiculo.setPlaca("XYZ789");
        assertEquals("XYZ789", vehiculo.getPlaca());
    }
}
