package main;

import javax.swing.JOptionPane;

import util.Util;

public class Main {

	public static void main(String[] args) {

		int opcao, resposta, tipo;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(Util.menu()));

			if (opcao < 1 || opcao > 6) {
				JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
			} else {

				switch (opcao) {
				
				case 1:
					tipo = Integer.parseInt(JOptionPane.showInputDialog(Util.menuReserva()));
					
					if(tipo<1 || tipo>2) {
						JOptionPane.showMessageDialog(null, "Insira uma opção válida por favor. ");
					}else {
						if(tipo == 1) {
							Util.cadastrarFisica();
						}else if(tipo == 2) {
							Util.cadastrarJuridica();
						}
					}
					break;

				case 2:
					
					 Util.pesquisarReserva();
					
					break;

				case 3:
					
					JOptionPane.showMessageDialog(null, Util.imprimirReserva());
					
					break;

				case 4:
					
					JOptionPane.showMessageDialog(null, Util.imprimirEspera());
					
					break;

				case 5:
					
					Util.cancelarReserva();
					
					break;

				case 6:
					resposta = JOptionPane.showConfirmDialog(null, "Deseja finalizar a aplicação?");
					if (resposta == 0) {
						JOptionPane.showMessageDialog(null, "Até breve!");
					} else {
						opcao = resposta;
					}

					break;
				}
			}

		} while (opcao != 6);

	}

}
