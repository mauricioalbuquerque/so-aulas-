import java.io.*;
import java.util.*;

public class Exemplo1 {
	
	static Scanner teclado;
	static PrintWriter saida;
	public static void main(String [] args){
		teclado = new Scanner(new FileInputStream(FileDescriptor.in));
		saida = new PrintWriter(new FileOutputStream(FileDescriptor.out));
		
		saida.println("digite seu nome: ");
		saida.flush();
		String nome= teclado.nextLine();
		saida.println("prazer em conhecelo-lo, "+nome+"!");
		saida.flush();
		
		teclado.close();
		saida.close();
		
		
		
	}


}
