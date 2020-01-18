package Repositorio;
import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {

		   int contador = 0, cont = 0;	
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe a quantidade de nomes à cadastrar.");
			int qtde = Integer.parseInt(entrada.nextLine());
			
			String[] nome = new String[qtde];	
				
			for(int i = 0; i < nome.length; i++) {			
				System.out.println("Informe o " + (cont + 1) +"º nome.");
				nome[i]= entrada.nextLine();				
				cont++;			
			}
			System.out.println("\n      -------------------      NOMES CADASTRADAS      -------------------");
			for(int i = 0; i<nome.length; i++ ) {				
				System.out.println((contador + 1) +"º nome: "+ nome[i]);				
				contador++;				
			}
			entrada.close();
	}

}
