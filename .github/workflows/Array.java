package Repositorio;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		   int contador = 0, cont = 0;	
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe a quantidade de notas � cadastrar.");
			int qtde = entrada.nextInt();
			
			float[] nota = new float[(int) qtde];			
			float total = 0;			
			for(int i = 0; i<nota.length; i++) {					
				System.out.println("Informe a sua " + (cont + 1) +"� nota.");
				nota[i] = entrada.nextFloat();
				total += nota[i];								
				cont++;			
			}
			System.out.println("\n      -------------------      NOTAS CADASTRADAS      -------------------\n");
			for(int i = 0; i<nota.length; i++ ) {			
				System.out.println((contador + 1) +"� nota:  "+ nota[i]);				
				contador++;			
			}
			float media = (float) (total/qtde);
			System.out.printf("\nM�dia das notas � de: %.2f  ", media);
			
			entrada.close();
	}
	
}
