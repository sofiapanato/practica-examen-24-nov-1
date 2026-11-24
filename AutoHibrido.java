public class AutoHibrido extends Vehiculo {
    private double capacidadTanqueLitros;

    public AutoHibrido(String placa, String marca, boolean encendido, double capacidadTanqueLitros) {
        super(placa, marca, encendido);
        if (capacidadTanqueLitros <= 0) {
            System.out.println("Capacidad de tanque invalida. Capacidad minima: 5.0.");
            this.capacidadTanqueLitros = 5.0;
        } else {
            this.capacidadTanqueLitros = capacidadTanqueLitros;
        }
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("Cambio de aceite sintetico y sincronizacion del motor de combustion/electrico.");
    }
    @Override
    public double calcularAutonomiaKm() {
        return capacidadTanqueLitros * 18.0;
    }
}
