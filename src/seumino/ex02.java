package seumino;

import java.util.Scanner;

import static javax.swing.JOptionPane.*;



public class ex02 {
	static String[] lista = new String[5];
	static Scanner in = new Scanner(System.in);	

	public static void main(String[] args) {
		int opcao;
		int c=0;
			while(true) {
			opcao = Integer.parseInt(showInputDialog(menu()));
		
			if (opcao==1) {
				Cadastrar(c);

			}
			else if (opcao==2) {
				Pesquisar();

			}
			else if (opcao==3) {
				Imprimir();

			}
			else if (opcao==4) {
				break;

			}
			if(opcao < 1 || opcao > 4) {
				showMessageDialog(null, "Opção invalida");
			}
		}
	}

	static String menu() {
		String aux = "";
		aux+="1. Cadastrar\n";
		aux+="2. Pesquisar\n";
		aux+="3. Imprimir\n";
		aux+="4. Finalizar\n";
		return aux;
	}
	
	static void Cadastrar(int c) {			
		c++;
		lista[c] = showInputDialog("Digite o nome do convidado");
	}
	
	static void Pesquisar() {
		
	}

	static void Imprimir() {
	
	}
	
}
