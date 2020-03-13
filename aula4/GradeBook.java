package aula4;
/**Classe GradeBook --> Implementa um diario de notas
 * 
 * @author Alexsandro S. Lima
 *
 */
public class GradeBook {
	//variaveis
	private String nomeEstudante;
	private String nomeTurma;
	private double nota;
	
	public GradeBook(){}//Fim do construtor 
	public GradeBook(String nomeTurma){
		setNomeTurma(nomeTurma);
	}//Fim do construtor
	public GradeBook(int nota){
		setNota(nota);
	}//Construtor coma nota do estudante
	
	public void setNota(double nota){
		this.nota = nota;
	}//Fim do setNota(double)
	public void setNomeTurma(String nome){
		this.nomeTurma = nome;
	}//fim do setNomeTurma(String)
	public void setNomeEstudante(String nomeEstudante){
		this.nomeEstudante = nomeEstudante;
	}//Fim do setNomeEstudante(String)
	public double getNota(){
		return this.nota;
	}//Fim do metodo getNota()
	public String getNomeTurma(){
		return this.nomeTurma;
	}//Fim do metodo getNomeTurma
	public String getNomeEstudante(){
		return this.nomeEstudante;
	}

}//Fim da classe GradeBook
