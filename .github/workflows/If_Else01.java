package Repositorio;
import java.util.Scanner;

public class If_Else01 {

	public static void main(String[] args) {
		
		double nota = 0;
		int menu = 0;
		
		Scanner input = new Scanner(System.in);
		
		do{
		System.out.println("Informe a nota do aluno  para sabermos se ele est� aprovado, recupera��o ou reprovado.\n");
		nota = input.nextDouble();
		if(nota >= 7 && nota <= 10) {
			System.out.println("Parab�ns voc� est� aprovado!");
			System.out.println("\nDigite 1 para continuar ou 2 para encerrar");
			menu = input.nextInt();
		}else if(nota < 7 && nota >= 5) {
			System.out.println("Voc� est� em recupera��o!");
			System.out.println("\nDigite 1 para continuar ou 2 para encerrar");
			menu = input.nextInt();
		}else {
			if(nota < 5) {
				System.out.println("Voc� est� reprovado!!!");
				System.out.println("\nDigite 1 para continuar ou 2 para encerrar");
				menu = input.nextInt();
			}
		}		
	}while(menu == 1) ;
		System.out.println("programa encerrado");	
	}		
}
