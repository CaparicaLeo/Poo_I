public class Index {
    public static void main(String[] args){
        Luz luz;

        luz = Luz.VERDE;

        switch (luz) {
            case VERMELHO:
                System.out.println("Palestra Indisponivel");
                break;
            case AMBAR:
                System.out.println("Palestra sendo Liberada");
                break;
            case VERDE:
                System.out.println("Palestra liberada");
                break;
        }


    }
}
