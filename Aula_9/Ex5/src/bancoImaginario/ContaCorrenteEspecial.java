package Ex5.src.bancoImaginario;

public class ContaCorrenteEspecial extends ContaCorrente{
    public ContaCorrenteEspecial(double saldo){
        super(saldo);
    }

    @Override
    public void depositar(double qnt) {
        this.setSaldo(qnt+this.getSaldo());
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void sacar(double qnt) {
       super.sacar(qnt);
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public double taxa(double qnt) {
        return qnt*0.01;
    }
    
    
}
