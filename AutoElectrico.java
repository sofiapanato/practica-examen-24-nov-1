public class AutoElectrico extends Vehiculo {
    private double capacidadBateriaKWh;

    public AutoElectrico(String placa, String marca, boolean encendido, double capacidadBateriaKWh) {
        super(placa, marca, encendido);
        if (capacidadBateriaKWh <= 0){
            System.out.println("Advertencia: Capacidad de bateria invalida. Valor minimo: 10.0.");
            this.capacidadBateriaKWh = 10.0;
        } else {
            this.capacidadBateriaKWh = capacidadBateriaKWh;
        }
    }
    @Override
    public void realizarMantenimiento() {
        System.out.println("Revision de sistema de alta tension y celdas de litio");
    }

    @Override
    public double calcularAutonomiaKm() {
        return  capacidadBateriaKWh * 6.5;
    }
}
