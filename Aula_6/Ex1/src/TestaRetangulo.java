public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(13.4, 14.5);

        r1.imprimePeri();
        r1.imprimeArea();
        System.out.println("");
        r2.imprimePeri();
        r2.imprimeArea();
    }
}