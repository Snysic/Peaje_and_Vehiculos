package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CamionTest {
    @Test
    public void testValorPeajeCamion() {
        Camion camion = new Camion("AGU856", 6);
        int valorPeaje = camion.getValorPeaje();
        assertEquals(300, valorPeaje); 
    }
}
