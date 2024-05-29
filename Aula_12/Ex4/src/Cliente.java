public class Cliente {
    private String nome;
    private double saldo;
    private double limite;
    
    @Override
    public String toString() {
        return "Cliente [nome=" + this.nome + ", saldo=" + this.saldo + ", limite=" + this.limite + "]";
    }
    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}
