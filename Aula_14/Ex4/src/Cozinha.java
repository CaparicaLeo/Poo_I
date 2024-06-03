public class Cozinha {
    private Microondas microondas;
    private Liquidificador liquidificador;
    private Geladeira geladeira;

    public void ligar(){
        this.microondas.ligar();
        this.geladeira.ligar();
        this.liquidificador.ligar();
    }
    public void desligar(){
        this.microondas.desligar();
        this.geladeira.desligar();
        this.liquidificador.desligar();
    }
    public Cozinha(Microondas microondas, Liquidificador liquidificador, Geladeira geladeira) {
        this.microondas = microondas;
        this.liquidificador = liquidificador;
        this.geladeira = geladeira;
    }
    
}
