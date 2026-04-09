package builder;

import modelo.Vehiculo;

public class ContratoBuilder {
    private Contrato contrato;

    public ContratoBuilder() {
        contrato = new Contrato();
    }

    public ContratoBuilder setCliente(String cliente) {
        contrato.setCliente(cliente);
        return this;
    }

    public ContratoBuilder setVehiculo(Vehiculo vehiculo) {
        contrato.setVehiculo(vehiculo);
        return this;
    }

    public ContratoBuilder setPlan(String plan) {
        contrato.setPlan(plan);
        return this;
    }

    public ContratoBuilder agregarGPS() {
        contrato.setGps(true);
        return this;
    }

    public ContratoBuilder agregarSeguro() {
        contrato.setSeguro(true);
        return this;
    }

    public Contrato build() {
        return contrato;
    }
}