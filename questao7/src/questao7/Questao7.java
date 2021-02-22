package questao7;

import javax.swing.JOptionPane;

public class Questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Primeiro Número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Segundo Número: "));
		 
		for (int i=numero1+1 ; i<numero2; i++) {
			System.out.println("Intervalo : " + i);
		}
		 
	}

}
