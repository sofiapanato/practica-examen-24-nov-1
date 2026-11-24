public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected boolean encendido;

    public Vehiculo(String placa, String marca, boolean encendido) {
        this.placa = placa;
        this.marca = marca;
        this.encendido = true;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public String mostrarFicha() {
        return "Placa: " + placa + ", Marca: " + marca + ", Estado: " + encendido;
    }
    public abstract void realizarMantenimiento();
    public abstract double calcularAutonomiaKm();

}