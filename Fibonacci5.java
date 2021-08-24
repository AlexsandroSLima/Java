import java.util.stream.IntStream;

public class Fibonacci5 {
	
	private int anterior = 1;
	private int proximo = 1;
	
	public IntStream stream(){
		return IntStream.generate(() -> {
			int aux = anterior;
			anterior = proximo;
			proximo = aux + proximo;
			
			return aux;
		});
		
	}//Fim do método stream
	public static void main(String args[]){
		Fibonacci5 objeto = new Fibonacci5();
		objeto.stream().limit(40).forEachOrdered(System.out::println);
	}//fim do main
}//Fim da classe
