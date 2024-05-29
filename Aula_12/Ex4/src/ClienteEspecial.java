public class ClienteEspecial extends Cliente{
    
    public ClienteEspecial(String nome, double saldo, double limite){
        super(nome,saldo,limite);
    }
    
    
    @Override
    public double getLimite() {
        // TODO Auto-generated method stub
        return super.getLimite();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public double getSaldo() {
        // TODO Auto-generated method stub
        return super.getSaldo();
    }

    @Override
    public void setLimite(double limite) {
        // TODO Auto-generated method stub
        super.setLimite(limite);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setSaldo(double saldo) {
        // TODO Auto-generated method stub
        super.setSaldo(saldo);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    
}
