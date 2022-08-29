package reserva;

import pessoa.Cliente;

public class Reserva {
	
	private Cliente cliente;
	public static boolean pagamentoAVista;
	
	public Reserva(Cliente cliente, boolean pagamentoAVista) {
		this.cliente = cliente;
		this.pagamentoAVista = pagamentoAVista;
	}

	public static double calcularPagamento() {
		
		double resultado = 0;
		
		if(pagamentoAVista == true) {
			resultado = (3200 - 3200 / 10);
			return resultado;
		}else {
			return resultado;
		}
		
	}
	
	public String toString() {
		String aux = "";
		
		aux += "Cliente Tipo pessoa ---->"+cliente+"\n";
		aux += "Nome ----->"+cliente.getNome()+"\n" ;
		if(pagamentoAVista==true) {
			aux += "Forma de pagamento -----> À vista \n";	
		}else {
			aux += "Forma de pagamento -----> Parcelado \n";	
		}
		
		return aux;
	}

}
