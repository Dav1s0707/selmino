package seumino;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Who is your name");
		String nome = JOptionPane.showInputDialog("Qual a boa chefe");
		JOptionPane.showMessageDialog(null, "seja bem vindo " +nome);

		int x = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Segunda valor"));
		int resultado = x+y;
		JOptionPane.showInternalMessageDialog(null, "Soma = " +resultado);
		
	}

}
