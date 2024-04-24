public class Main{
    public static void main(String[] args){
        Aviao a1 = new Aviao();

        a1.fabricante = "Boieng";
        a1.modelo = "567";
        a1.qtdeAssentos = 102;

        a1.ligar();
        a1.decolar();
    }
}