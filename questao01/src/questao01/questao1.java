package questao01;

import java.io.File;

public class questao1 {

	public void lista( String path ) {

        File caminho = new File( path );
        File[] list = caminho.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                lista( f.getAbsolutePath() );
                System.out.println( "Pasta : " + f.getAbsoluteFile() );
            }
            else {
                System.out.println( "Arquivo : " + f.getName() );
            }
        }
    }

    public static void main(String[] args) {
        questao1 busca = new questao1();
        busca.lista("c:\\Tacom" );
    }

	
		
	}
	



