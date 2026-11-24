public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];

        vehiculos[0] = new AutoElectrico("EV-2024", "Tesla", false, 60.0);
        vehiculos[1] = new AutoHibrido("HB-5050", "Toyota", false, 45.0);

    for (int i = 0; i < vehiculos.length; i++ ){
        vehiculos[i].mostrarFicha();
        vehiculos[i].realizarMantenimiento();
        System.out.println("Autonomia: " + vehiculos[i].calcularAutonomiaKm() + " Km.");
    }

    double autonomiaTotal = 0.0;
    for (int i = 0; i < vehiculos.length; i++){
        autonomiaTotal += vehiculos[i].calcularAutonomiaKm();
    }
    System.out.println("Autonomia total de la flota: " + autonomiaTotal + " Km.");
  }
}
