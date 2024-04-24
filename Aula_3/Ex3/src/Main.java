public class Main {
    public static void main(String[] args) {
       Universidade u1 = new Universidade();
       Aluno a1 = new Aluno();

       u1.nome = "UFPR";
       u1.cidade = "Curitiba";
       u1.estado = "Parana";
       u1.exibeDados();

       a1.nome = "Alex";
       a1.curso = "Ciencia da Computacao";
       a1.exibeDados();
    }
}