public class InstrumentoApp {
    public static void main(String[] args) {
        Instrumento[] orquestra = new Instrumento[5];
        Sopro saxofone = new Sopro();
        Percussao bateria = new Percussao();
        Corda violino = new Corda();
        SoproMetal clarinete = new SoproMetal();
        SoproMadeira flautaDoce = new SoproMadeira();

        orquestra[0] = saxofone;
        orquestra[1] = bateria;
        orquestra[2] = violino;
        orquestra[3] = clarinete;
        orquestra[4] = flautaDoce;

        sinfonia(orquestra);
    }
    public static void sinfonia(Instrumento[] orquestra){
        for(Instrumento musico : orquestra){
            musico.tocar();
        }
    }
}
