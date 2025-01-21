package dev.maria;

public class Coche extends Vehiculo {
    
    private int valorPeaje = 100;

    Coche(String placa){
        super(placa);

    }

    public int getValorPeaje(){
        return valorPeaje;
    }
}
