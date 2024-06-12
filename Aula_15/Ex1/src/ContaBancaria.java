public abstract class ContaBancaria {
    private String nome;
    private double saldo;
    public String getNome(){
        return this.nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public ContaBancaria(String nome) {
        this.nome = nome;
        this.saldo = 0;
    }
    public void deposita(double valor){
        this.setSaldo(this.getSaldo()+valor);
    }
    public void retira(double valor){
        if(valor > this.getSaldo()){
            System.out.println("Saldo Insuficiente");
        }
        else{
            this.setSaldo(this.getSaldo()-valor);
        }
    }
    @Override
    public String toString() {
        return "ContaBancaria [nome=" + nome + ", saldo=" + saldo + "]";
    }
    
}