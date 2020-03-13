package aula3;
import java.util.Scanner;
public class DateTeste {
	public static void main(String[]args){
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite um valor para dia: \n");
		int dia = entrada.nextInt();
		System.out.printf("Digite um valor para mes: \n");
		int mes = entrada.nextInt();
		System.out.printf("Digite um valor para ano: \n");
		int ano = entrada.nextInt();
		
		Date data_1 = new Date();
		Date data_2 = new Date(dia, mes, ano);
		Date data_3 = new Date(mes);
		
		data_1.displayDate();
		data_2.displayDate();
		
		data_1.setDia(15);
		data_1.setMes(9);
		data_1.setAno(2020);
		
		data_1.displayDate();
		
		data_2.setDia(Integer.parseInt(args[0]));
		data_2.setMes(Integer.parseInt(args[1]));
		data_2.setAno(Integer.parseInt(args[2]));
		
		data_2.displayDate();
		//System.out.printf("Dia (objeto data_1): %d.\n", data_1.getDia());
		entrada.close();
	}

}
