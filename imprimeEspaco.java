package lab2;
import java.util.Scanner;

public class codeTwoThreeZero {
	public static void main(String[]args){
		//recebendo valor da variavel pelo usuario
		Scanner recebe = new Scanner(System.in);
		//mensagem para o usuario
		System.out.println("Digite um numero: ");
		//declarando variavel
		int numero = recebe.nextInt();
		//imprimindo variavel
		System.out.printf("%d ",numero/10000);
		System.out.printf("%d ",(numero%10000)/1000);
		System.out.printf("%d ",((numero%1000)/100));
		System.out.printf("%d ",((numero%100)/10));
		System.out.printf("%d ",(numero%10));
	}

}
