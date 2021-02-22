package questao14;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float dolar;
		float reais;
		
		dolar = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe a cotação do dolar: "));
		reais = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a quantidade de reais a converter: "));
		if ((dolar>0) && (reais>0)){
			float resultado = reais/dolar;
			NumberFormat numberFormat= new java.text.DecimalFormat("#,##0.00"); 
			String formatado = numberFormat.format(resultado);
			System.out.println("O valor da conversão é: " + formatado);
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possivel converter");
		}
	}

}
