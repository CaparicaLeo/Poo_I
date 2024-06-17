public class Estudante extends Pessoa implements Falante {
    private String idioma;
    @Override
    public void falar() {
        System.out.println("Olá, eu sou estudante de Ciência da Computação!");
    }

    @Override
    public String seuIdioma() {
        return this.idioma;
    }
    public Estudante(String nome, int idade, String idioma){
        super(nome, idade);
        this.idioma = idioma;
    }

    
}
