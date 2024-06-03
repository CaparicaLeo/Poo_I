public class Index {
    public static void main(String[] args) {
        Microondas m1 = new Microondas();
        Geladeira g1 = new Geladeira();
        Liquidificador l1 = new Liquidificador();

        Cozinha cozinha = new Cozinha(m1, l1, g1);

        cozinha.ligar();
        m1.observar();
        g1.observar();
        l1.observar();
        System.out.println(" ");

        m1.desligar();

        m1.observar();
        g1.observar();
        l1.observar();
        System.out.println(" ");

        cozinha.desligar();
        m1.observar();
        g1.observar();
        l1.observar();
    }
}
