package util;

import javax.swing.JOptionPane;
import java.util.ArrayList;

import reserva.Reserva;

public class Util {

	private static int numero = 1;
	private static int num = 1;
	private static int N = 20;

	static ArrayList<String> reserva = new ArrayList<String>(N);
	static ArrayList<String> espera = new ArrayList<String>();
	static String[] cliente = new String[4];

	public static void cadastrarFisica() {
		String nome = JOptionPane.showInputDialog("Insira o nome do cliente: ");
		cliente[1] = "Nome do cliente: " + nome;
		String cpf = JOptionPane.showInputDialog("Insira o CPF do cliente: ");
		cliente[2] = "CPF do cliente: " + cpf;
		int pagamento = JOptionPane.showConfirmDialog(null, formaPagamento());

		if (pagamento == 0) {
			cliente[3] = "Pagamento A vista";
			Reserva.pagamentoAVista = true;
			Reserva.calcularPagamento();
			JOptionPane.showMessageDialog(null, "valor a pagar: R$ " + Reserva.calcularPagamento());
		} else if (pagamento == 1) {
			cliente[3] = "Pagamento Parcelado";
			Reserva.pagamentoAVista = false;
			Reserva.calcularPagamento();
			JOptionPane.showMessageDialog(null, "valor a pagar: R$ 3200");

		} else {
			JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
		}

		if (reserva.size() == N) {
			cliente[0] = Integer.toString(num++) + "a Espera: ";
			espera.add(cliente[0]);
			espera.add(cliente[1]);
			espera.add(cliente[2]);
			espera.add(cliente[3]);
		} else {

			cliente[0] = Integer.toString(numero++) + "a Reserva: ";
			reserva.add(cliente[0]);
			reserva.add(cliente[1]);
			reserva.add(cliente[2]);
			reserva.add(cliente[3]);

		}

		return;
	}

	public static void cadastrarJuridica() {

		String nome = JOptionPane.showInputDialog("Insira o nome do cliente: ");
		cliente[1] = "Nome do cliente: " + nome;
		String cnpj = JOptionPane.showInputDialog("Insira o CNPJ do cliente: ");
		cliente[2] = "CNPJ do cliente: " + cnpj;
		int pagamento = JOptionPane.showConfirmDialog(null, formaPagamento());

		if (pagamento == 0) {
			cliente[3] = "Pagamento A vista";
			Reserva.pagamentoAVista = true;
			Reserva.calcularPagamento();
			JOptionPane.showMessageDialog(null, "valor a pagar: R$ " + Reserva.calcularPagamento());
		} else if (pagamento == 1) {
			cliente[3] = "Pagamento Parcelado";
			Reserva.pagamentoAVista = false;
			Reserva.calcularPagamento();
			JOptionPane.showMessageDialog(null, "valor a pagar: R$ 3200");

		} else {
			JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
		}

		if (reserva.size() == N) {
			cliente[0] = Integer.toString(num++) + "a Espera: ";
			espera.add(cliente[0]);
			espera.add(cliente[1]);
			espera.add(cliente[2]);
			espera.add(cliente[3]);
		} else {

			cliente[0] = Integer.toString(numero++) + "a Reserva: ";
			reserva.add(cliente[0]);
			reserva.add(cliente[1]);
			reserva.add(cliente[2]);
			reserva.add(cliente[3]);

		}
		return;
	}

	public static String formaPagamento() {
		String aux = "";

		aux = "Seu pagamento será a vista? ";
		aux += "\n";
		aux += "\n  Pagamento a vista recebe 10% de desconto ";

		return aux;
	}

	public static String menuReserva() {
		String aux = "";

		aux = "Qual tipo de pessoa você é? ";
		aux += "\n";
		aux += "\n1. Pessoa Física ";
		aux += "\n2. Pessoa Jurídica";

		return aux;
	}

	public static String menu() {
		String aux = "";

		aux = "Escolha uma opção";
		aux += "\n1. Reservar mesa";
		aux += "\n2. Pesquisar reserva";
		aux += "\n3. Imprimir reservas";
		aux += "\n4. Imprimir lista de espera";
		aux += "\n5. Cancelar reserva";
		aux += "\n6. Finalizar";

		return aux;
	}

	public static String imprimirReserva() {

		String aux = "";

		for (int i = 0; i < reserva.size(); i++) {

			aux += reserva.get(i) + "\n";

		}

		return aux;

	}

	public static String imprimirEspera() {

		String aux = "";

		for (int i = 0; i < espera.size(); i++) {

			aux += espera.get(i) + "\n";

		}

		return aux;

	}
	
	public static void pesquisarReserva() {
		
		int posicao_cpf = pesquisarCpf(); 
		
		if(posicao_cpf == -1) {
			JOptionPane.showMessageDialog(null,"CPF não foi encontrado");
		}else {		
			JOptionPane.showMessageDialog(null,reserva.toString());
		}
		
		
	}
	
	private static int pesquisarCpf() {
		
		int posicao_cpf = -1; //-1 indica um valor de posição inválida
		String cpf = JOptionPane.showInputDialog("Informe o CPF da conta a ser acessada");
		
		//Serve para encontrar o cpf e ver se ele esta cadastrado.
		for(int i =0;i<reserva.size();i++) {
			if(cliente[i].equals(cpf)) {
				posicao_cpf = i;
			}
		}
		
		return posicao_cpf;
	}
	

	public static void cancelarReserva() {

		int posicao_cpf = pesquisarCpf(); 
		
		if(posicao_cpf == -1) {
			JOptionPane.showMessageDialog(null,"CPF não foi encontrado");
		}else {		
			JOptionPane.showMessageDialog(null,reserva.toString());
		}
	}
}