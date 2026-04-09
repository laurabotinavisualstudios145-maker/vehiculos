package factory;

import modelo.*;

public class VehiculoFactory {

    public static Vehiculo crearVehiculo(String tipo, String placa, int autonomia) {

        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto(placa, autonomia);
            case "van":
                return new Van(placa, autonomia);
            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido");
        }
    }
}