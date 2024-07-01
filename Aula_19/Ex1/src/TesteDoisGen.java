public class TesteDoisGen {
    public static void main(String[] args){
        // Cria referencias Gen para Integer e para String.
        DoisGen<Integer,String> iOb;
        // Cria um objeto Gen<Integer> e atribui sua
        // referencia para iOb. Note o uso de autoboxing
        // para encapsular o valor 88 em um objeto Integer.
        iOb = new DoisGen<Integer, String>(79,"teste");
        // Mostra o tipo de dado usado por iOb.
        iOb.showType();

        // Obt�m o valor em iOb. Note que
        // nenhuma coer��o (cast) � necess�rio.
        int v = iOb.getOb1();
        System.out.println("valor: " + v);

        System.out.println();
    }
}
