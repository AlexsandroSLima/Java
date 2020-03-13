package aula4;
/** 
 * Classe GradeBookTeste testa as funcionalidades de GradeBook
 * @author Alexsandro S. Lima
 */
public class GradeBookTeste {

	public static void main(String[] args) {
		GradeBook objeto1 = null;
		GradeBook objeto2 = null;
		GradeBook objeto3 = null;
		//inicializando objetos
		objeto1 = new GradeBook();
		objeto2 = new GradeBook("Laboratorio 2");
		objeto3 = new GradeBook();
		
		System.out.printf("Nome da turma do objeto 1: %s.\n", objeto1.getNomeTurma());
		System.out.printf("Nome da turma do objeto 2: %s.\n", objeto2.getNomeTurma());
        
		objeto1 = new GradeBook("Compiladores");
		
		System.out.printf("Nome da turma do objeto 1: %s.\n", objeto1.getNomeTurma());
		
		System.out.printf("Objeto 1: %s.\n", objeto1);
		System.out.printf("Objeto 2: %s.\n", objeto2);
		System.out.printf("Objeto 3: %s.\n", objeto3);
		
	}//Fim do metodo main

}//Fim da classe GradeBookTeste
