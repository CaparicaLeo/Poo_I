public class TestaFalantes {
    public static void main(String[] args) {
        Falante f1,f2;
        f1 = new Estudante("Manoel",22,"Portugues");
        f2 = new Robo("Ingles");
        Entrevistador e = new Entrevistador("Portugues");
        e.entrevista(f1);
        System.out.println("-------------");
        e.entrevista(f2);
    }
}
   