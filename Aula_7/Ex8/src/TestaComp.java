public class TestaComp {
    public static void main(String[] args) {
        Compositor c1 = new Compositor("4875", "Leonardo");
        Compositor c[] = new Compositor[2];
        
        Compositor c2 = new Compositor("7847","Edu");
        Compositor c3 = new Compositor("1245", "Julia");

        c[0] = c2;
        c[1] = c3;

        c1.imprimirAtri();
        c[0].imprimirAtri();
        c[1].imprimirAtri();
    }
}
