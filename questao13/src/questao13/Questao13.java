package questao13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate novaData = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY"); 
		System.out.println("A nova data informada é : " + formatter.format(novaData.plusDays(Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de dias")))));
	}

}
