package questao12;



import javax.swing.JOptionPane;

public class Questao12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float valorHora=0;
		float horasTrabalhadas=0;
		valorHora = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor da hora trabalhada : "));
		horasTrabalhadas = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a quantidade de horas trabalhadas : "));
		System.out.println("O valor a ser recebido é : " + (valorHora*horasTrabalhadas));
	}
	
}
