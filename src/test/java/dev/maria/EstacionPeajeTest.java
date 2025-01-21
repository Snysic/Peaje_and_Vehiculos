package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EstacionPeajeTest {

    private EstacionPeaje estacion;

    @BeforeEach
    public void setup() {
        estacion = new EstacionPeaje("Estación 1", "Ciudad A");
    }

    @Test
    public void testCobrarPeajeCoche() {
        Coche coche = new Coche("RMS333");
        estacion.cobrarPeaje(coche);
        assertEquals(100, estacion.getValorTotal());
    }

    @Test
    public void testCobrarPeajeMoto() {
        Moto moto = new Moto("TIZ060");
        estacion.cobrarPeaje(moto);
        assertEquals(50, estacion.getValorTotal());
    }

    @Test
    public void testCobrarPeajeCamion() {
        Camion camion = new Camion("ANT598", 2);
        estacion.cobrarPeaje(camion);
        assertEquals(100, estacion.getValorTotal());
    }

    @Test
    public void testCobrarMultiplesVehiculos() {
        Coche coche = new Coche("ABC123");
        Moto moto = new Moto("XYZ789");
        Camion camion = new Camion("LMN456", 8);

        estacion.cobrarPeaje(coche);
        estacion.cobrarPeaje(moto);
        estacion.cobrarPeaje(camion);

        assertEquals(550, estacion.getValorTotal()); 
    }
}
