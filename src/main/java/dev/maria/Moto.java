package dev.maria;

public class Moto extends Vehiculo {
    
    private int valorPeaje = 50;

    Moto(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }
}
