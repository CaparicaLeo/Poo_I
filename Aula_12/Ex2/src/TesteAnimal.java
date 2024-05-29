public class TesteAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        Preguica p = new Preguica();

        a.emitirSom();
        c.emitirSom();
        g.emitirSom();
        p.emitirSom();
    }
}
