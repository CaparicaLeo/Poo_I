public class Robo implements Falante {
    private String idioma;
    @Override
    public void falar() {
        System.out.println("Olá, eu sou um Robo");  
    }

    @Override
    public String seuIdioma() {
        
        return this.idioma;
    }
    public Robo(String idioma){
        this.idioma = idioma;
    }
    public void reboot(){
        System.out.println("Estou sendo reiniciado...");
    }
    
}
