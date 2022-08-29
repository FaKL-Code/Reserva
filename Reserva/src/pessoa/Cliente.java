package pessoa;

public abstract class Cliente {
	
	private String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		String aux = "";
		
		aux += "Nome ---->"+nome+ "\n";
		
		return aux;
	}

}