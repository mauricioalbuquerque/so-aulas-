import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class Exemplo2 {
	static Scanner teclado;
	static PrintWriter saida;
	private static PrintWriter arquivo;

	
	public static void main(String[] args){

			teclado = new Scanner(new FileInputStream(FileDescriptor.in));
			saida = new PrintWriter(new FileOutputStream(FileDescriptor.out));
			try {
				arquivo = new PrintWriter("src\\filmes.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			saida.println("queremos saber seus 4 filmes favoritos!");
			saida.flush();
			
			for (int i=0;i<4;i++){
			saida.println("nome do filme: ");
			saida.flush();
			String nome = teclado.nextLine();
			arquivo.println(nome);
			}
			
			saida.println("obrigado por participar da pesquisa");
			saida.println("ta salvo em src\\filmes.txt");
			teclado.close();
			saida.close();
			arquivo.close();
			
	}

}
