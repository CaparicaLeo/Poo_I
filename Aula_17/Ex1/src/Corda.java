public class Corda implements Instrumento {
    @Override
    public void afinar() {
        System.out.println("Afinando as cordas");
        
    }

    @Override
    public void nome() {
        System.out.println("Cordas");
    }

    @Override
    public void tocar() {
       System.out.println("Tocando as Cordas"); 
    }
    
}
