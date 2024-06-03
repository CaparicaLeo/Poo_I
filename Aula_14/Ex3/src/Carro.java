public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Bancos bancos;

    public String getBancos() {
        return bancos.getFabricante();
    }
    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }
    public Carro(String marca, String modelo, String fabricante, Motor motor, Bancos bancos) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.motor = motor;
        this.bancos = bancos;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public String getTipoMotor() {
        return motor.getTipo();
    }
    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", fabricante=" + fabricante + ", " + motor.toString()
                + "," + bancos.toString() + "]";
    }
    
}