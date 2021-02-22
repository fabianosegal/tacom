package questao6;

import javax.swing.JOptionPane;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
		 String fraseInvertida = new StringBuilder(frase).reverse().toString();
		    System.out.println(fraseInvertida);
	}

}
