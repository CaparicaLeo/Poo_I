public class Percussao implements Instrumento{
    @Override
    public void afinar() {
        System.out.println("Afinando Percussao");
    }

    @Override
    public void nome() {
        System.out.println("Percussao");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a percussao");
    }
    
}
