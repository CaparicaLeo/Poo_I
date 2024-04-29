public class Compositor {
    private String codigo, nome;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Compositor(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public void imprimirAtri(){
        System.out.println("Compositor intitulado " + this.getNome() + ", tem o Codigo: " + this.getCodigo());
    }
}
