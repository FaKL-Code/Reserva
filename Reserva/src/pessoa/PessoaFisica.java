package pessoa;

public class PessoaFisica extends Cliente {
	
	private String cpf;

	public PessoaFisica(String nome,String cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		String aux = super.toString();
		
		aux += "CPF------> "+cpf+ "\n";
		
		return aux;
	}
	
	

}

