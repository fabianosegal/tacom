package questao11;

import java.time.LocalDate;
import java.time.Period;



public class Questao11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate nascimento = LocalDate.parse("1975-08-29");
		System.out.println("Sua idade é " + idade(nascimento) + " anos");
		
	}
	public static int idade(final LocalDate aniversario) {
	    final LocalDate dataAtual = LocalDate.now();
	    final Period periodo = Period.between(aniversario, dataAtual);
	    return periodo.getYears();
	}	

}
