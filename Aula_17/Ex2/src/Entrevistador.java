public class Entrevistador{
    private String idioma;
	public void entrevista(Falante f) {
		if (f instanceof Estudante) {
			System.out.println("Ola, Estudante!");
		} else if (f instanceof Robo) {
			System.out.println("Ola, Robo");
			Robo r = (Robo) f;
			r.reboot();
		}
		idioma = f.seuIdioma();
		f.falar();
		System.out.println("Vou entrevistar voce em " + idioma);
	}
    public Entrevistador(String idioma){
        this.idioma = idioma;
    }
}