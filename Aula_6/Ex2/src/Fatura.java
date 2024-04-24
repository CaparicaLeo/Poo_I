public class Fatura {
    private String numero;
    private String descricao;
    private int qntComprada;
    private double preco;
    public Fatura(String numero, String descricao, int qntComprada, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.qntComprada = qntComprada;
        this.preco = preco;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQntComprada() {
        return qntComprada;
    }
    public void setQntComprada(int qntComprada) {
        this.qntComprada = qntComprada;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double getQtdeFatura(){
        double total = this.getPreco() * (double)(this.getQntComprada());

        return total;
    }
    public void imprimeStatus(){
        System.out.println("Fatura " + this.getClass());
        System.out.println("Numero: "+ this.getNumero());
        System.out.println("Descricao: "+ this.getDescricao());
        System.out.println("Quantidades vendidas: "+ this.qntComprada);
        System.out.println("Preço: R$"+ this.getPreco());
        System.out.println("Valor total da fatura: " + this.getQtdeFatura());
    }

    

}
