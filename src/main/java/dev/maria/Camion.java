package dev.maria;

public class Camion extends Vehiculo {
    
    private int numeroEjes;
    private int valorPeajePorEje = 50;

    Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int getValorPeaje() {
        return numeroEjes * valorPeajePorEje;
    }
}
