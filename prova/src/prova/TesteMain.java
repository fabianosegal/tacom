package prova;

import java.io.File;

public class TesteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.out.println("Hello World");
		
		String diretorioSource = "C:\\teste\\";
		File raiz = new File(diretorioSource);

        File files[] = raiz.listFiles();
        
        System.out.println("Total de Imagens: " + files.length);
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(diretorioSource + f.getName());
            }
        }
	}

}
