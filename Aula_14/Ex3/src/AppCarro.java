public class AppCarro
{
    public static void main(String listaDeArgumentos[]){
        Motor m1 = new Motor("3.8L V6");
        Bancos b1 = new Bancos("Couro");
        Carro c1 = new Carro("Mustang", "Conversivel", "Ford", m1, b1);

        Motor m2 = new Motor("COOPER");
        Bancos b2 = new Bancos("Lã");
        Carro c2 = new Carro("MINI", "COOPER SE", "BMW", m2, b2);

        Motor m3 = new Motor("Mercedes-Benz");
        Bancos b3 = new Bancos("Tecido");
        Carro c3 = new Carro("Mercedes-EQ", "EQA 250", "Mercedes-Benz", m3, b3);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
