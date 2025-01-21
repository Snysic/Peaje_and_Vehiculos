package dev.maria;

public class Main {
    public static void main(String[] args) {
        EstacionPeaje estacion = new EstacionPeaje("Estación 1", "Ciudad A");

        Coche coche = new Coche("ABC123");
        Moto moto = new Moto("XYZ789");
        Camion camion = new Camion("LMN456", 4);

        estacion.cobrarPeaje(coche);
        estacion.cobrarPeaje(moto);
        estacion.cobrarPeaje(camion);

        estacion.imprimirReporte();
    }
}
