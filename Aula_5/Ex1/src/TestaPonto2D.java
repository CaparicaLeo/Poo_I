public class TestaPonto2D {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D();
        System.out.println("Coordenadas p1: ("+ p1.getX() + " , " + p1.getY() + ")" );
        System.out.println("Contador: " + Ponto2D.getCont());
        Ponto2D p2 = new Ponto2D(4.65, 5.78);
        System.out.println("Coordenadas p2: ("+ p2.getX() + " , " + p2.getY() + ")" );
        System.out.println("Contador: " + Ponto2D.getCont());
    }
}
