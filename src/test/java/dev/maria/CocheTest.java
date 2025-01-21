package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CocheTest {

    @Test
    public void testValorPeajeCoche(){
        Coche coche = new Coche("ABC349");
        int valorPeaje = coche.getValorPeaje();
    assertEquals(100, valorPeaje);   
}
    
}
