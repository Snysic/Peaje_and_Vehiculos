package dev.maria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MotoTest {
        @Test
    public void testValorPeajeCoche(){
        Moto moto = new Moto("ANT666");
        int valorPeaje = moto.getValorPeaje();
    assertEquals(50, valorPeaje);   
}
}
