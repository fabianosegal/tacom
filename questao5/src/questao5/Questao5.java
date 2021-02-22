package questao5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File arquivo = new File( "C:\\Users\\fabiano.almeida\\Downloads\\Prova Estagiário.txt" );
		String linha;
		Map<String,Integer> arrPalavras;
		arrPalavras = new HashMap<String,Integer>();
		
		try {
			if (!arquivo.exists()) {
				System.out.println("Arquivo informado não existe");
				}

			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			linha = br.readLine();
			while (br.ready()) {
				
				while (linha != null) {
					String linhaMinusculo = linha.toLowerCase();
					Pattern p = Pattern.compile("java");
					Matcher m = p.matcher(linhaMinusculo);
					while(m.find())
		        	{
		        	  String token = m.group();  
		        	  Integer frequencia = arrPalavras.get(token);  

						if (frequencia != null) {  
							arrPalavras.put(token, frequencia+1);
						}
						else {  
							arrPalavras.put(token,1);
						}
		        	}
					linha = br.readLine();	
						
				}
				
			}
			
			br.close();
			fr.close();
			for (Map.Entry<String, Integer> entry : arrPalavras.entrySet()) {
				System.out.println(entry.getKey() + "\tAparições = " + entry.getValue());
			 }
			
		} catch (IOException ex) {
				ex.printStackTrace();
			}
	}

}
