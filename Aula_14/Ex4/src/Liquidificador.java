public class Liquidificador {
    private boolean ligado;

    public boolean isLigado() {
        return ligado;
    }

    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }

    public void observar(){
        System.out.println(isLigado() ? "Liquidificador ligado" : "Liquidificador desligado");
    }
}
