package dev.maria;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String ciudad;
    private int valorTotal;
    private List<Vehiculo> vehiculos;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.valorTotal = 0;
        this.vehiculos = new ArrayList<>();
    }

    public void cobrarPeaje(Vehiculo vehiculo) {
        int valorPeaje = 0;
        if (vehiculo instanceof Coche) {
            valorPeaje = ((Coche) vehiculo).getValorPeaje();
        } else if (vehiculo instanceof Moto) {
            valorPeaje = ((Moto) vehiculo).getValorPeaje();
        } else if (vehiculo instanceof Camion) {
            valorPeaje = ((Camion) vehiculo).getValorPeaje();
        }
        valorTotal += valorPeaje;
        vehiculos.add(vehiculo);
    }

    public void imprimirReporte() {
        System.out.println("Estación de Peaje: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Valor Total Recaudado: $" + valorTotal);
        System.out.println("Vehículos Procesados:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Placa: " + vehiculo.getPlaca() + " - Valor de Peaje: $" + 
                (vehiculo instanceof Coche ? ((Coche) vehiculo).getValorPeaje() : 
                (vehiculo instanceof Moto ? ((Moto) vehiculo).getValorPeaje() :
                (vehiculo instanceof Camion ? ((Camion) vehiculo).getValorPeaje() : "Desconocido"))));
        }
    }

    public Integer getValorTotal() {
        return valorTotal;
    }
}
