package questao2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File arquivo = new File( "C:\\Users\\fabiano.almeida\\Downloads\\Prova Estagiário.txt" );
		try {
			if (!arquivo.exists()) {
				System.out.println("Arquivo informado não existe");
				}

			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			
			while (br.ready()) {
				String linha = br.readLine();
				System.out.println(linha);
			}
			
			br.close();
			fr.close();
			
		} catch (IOException ex) {
				ex.printStackTrace();
			}
		
	}
}
