public class Dispositivo {
	private int codigo;
	private String nome;

	Dispositivo(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public void usar() {
		System.out.println("Usando o dispositivo " + nome);
	}
    public String getNome() {
        return nome;
    }
}