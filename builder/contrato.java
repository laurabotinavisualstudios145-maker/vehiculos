package builder;

import modelo.Vehiculo;

public class Contrato {
    private String cliente;
    private Vehiculo vehiculo;
    private String plan;
    private boolean gps;
    private boolean seguro;

    public void mostrar() {
        System.out.println("Cliente: " + cliente);
        System.out.println("Vehículo: " + vehiculo.getPlaca());
        System.out.println("Plan: " + plan);
        System.out.println("GPS: " + gps);
        System.out.println("Seguro: " + seguro);
    }

    public void setCliente(String cliente) { this.cliente = cliente; }
    public void setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; }
    public void setPlan(String plan) { this.plan = plan; }
    public void setGps(boolean gps) { this.gps = gps; }
    public void setSeguro(boolean seguro) { this.seguro = seguro; }
}