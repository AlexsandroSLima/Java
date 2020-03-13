package aula3;

public class Date {
	private int dia, mes, ano;
	
	public Date() {
		
	}//Fim do construtor vazio
    public Date(int mes) {
		
	}//Fim do construtor vazio
	
	
	public Date(int dia, int mes, int ano){
		if(dia > 0 && dia <=31){
		   setDia(dia);
		}//Fim do if
		if(mes >=1 && mes <=12){
		   setMes(mes);
		}//Fim do if
		if(ano >= 0){
		   setAno(ano);
		}//Fim do if
		
	}//Fim do construtor
	
	public void setDia(int dia){
		this.dia = dia;
	}
	public void setMes(int mes){
		this.mes =  mes;
	
	}    
	public void setAno(int ano){
		this.ano =  ano;
	
	} 
	public void setData(int dia, int mes, int ano){
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	
	public void displayDate(){
    	System.out.printf("Data: %02d/%02d/%02d.\n", getDia(), getMes(), getAno());
    }

}//Fim da classe
