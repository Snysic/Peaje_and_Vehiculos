package dev.maria;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));  
    }

    @Test
    public void testMainFlow() {
        EstacionPeaje estacion = new EstacionPeaje("Estación 1", "Ciudad A");

        Coche coche = new Coche("ABC123");
        Moto moto = new Moto("XYZ789");
        Camion camion = new Camion("LMN456", 4);

        estacion.cobrarPeaje(coche);
        estacion.cobrarPeaje(moto);
        estacion.cobrarPeaje(camion);

        estacion.imprimirReporte();

        String output = outContent.toString();
        
        assertTrue(output.contains("Estación de Peaje: Estación 1"));
        assertTrue(output.contains("Ciudad: Ciudad A"));
        assertTrue(output.contains("Valor Total Recaudado: $350"));
        assertTrue(output.contains("Placa: ABC123"));
        assertTrue(output.contains("Placa: XYZ789"));
        assertTrue(output.contains("Placa: LMN456"));
    }
}
