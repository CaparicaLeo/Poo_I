public class ContaEspecial extends ContaBancaria {
    private double adicional;
    public ContaEspecial(String nome, double adicional){
        super(nome);
        this.adicional = adicional;
    }
    @Override
    public void retira(double valor){
        if(this.getSaldo() + this.adicional < valor){
            System.out.println("Saldo insuficiente e limite abaixo, consulte seu gerente!!!");
        }
        else{
            this.setSaldo(this.getSaldo()-valor);
        }
    }
    @Override
    public String toString() {
        return "ContaEspecial [ " + super.toString() + "adicional=" + adicional + "]";
    }
    
    
    
}
