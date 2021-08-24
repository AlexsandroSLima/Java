import java.util.Scanner;

public class QuadradoDeAsteriscos {
	public static void main(String args[]){
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um valor entre 1 e 20: ");

	int valor = entrada.nextInt();
	if (valor < 1){
		valor = 1;
		System.out.println("Valor invalido.");
	}//fim do if
	if (valor > 20){
		valor = 20;
		System.out.println("Valor invalido.");
	}//fim do if
	else if (valor > 20){
		valor = 20;
		System.out.println("Valor invalido;");
	}
	int linha = 1;
	int coluna = 1;
	
	while(linha <= valor){
		coluna = 1;
		while(coluna <= valor){ 
			//quadrado preenchido => System.out.print("* ");
			if (linha == 1)System.out.print("* ");
			else if (coluna == 1) System.out.print("* ");
			else if (linha == valor) System.out.print("* ");
			else if (coluna == valor) System.out.print("* ");
			else System.out.print("  ");
			
			coluna++;
		}//Fim do while interno
		System.out.println();
		linha++;
	}//Fim do while externo
	
	
	}//Fim do main
}//Fim da classe
