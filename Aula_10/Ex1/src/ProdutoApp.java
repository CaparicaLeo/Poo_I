public class ProdutoApp {
    public static void main(String[] args) {
        Produto p1 = new Produto("faca", 15);
        Produto p2 = new Produto("Mouse", 51);

        Livro l1 = new Livro("It a Coisa", 239.9, "Stephen King", 470);
        Livro l2 = new Livro("Pequeno Principe", 50, "Caparica", 67);

        System.out.println("PRODUTOS -----------------------");
        p1.escreva();
        p2.escreva();
        System.out.println("\nLIVROS-----------------------");
        l1.escreva();
        l2.escreva();
    }
}
