import java.util.*;
public class DNAsort{
	    
	    public static void quicksortMedianaDeTres(int[] A){        
	        quicksortMedianaDeTres(A, 0, A.length - 1);
	    }

	    private static void quicksortMedianaDeTres(int[] A, int inicio, int fim){        
	        if(inicio < fim){
	            int q = partition(A, inicio, fim);       
	        }
	    }
	    private static int partition(int[] A, int inicio, int fim){
	        //procura a mediana entre inicio, meio e fim
	        int meio = (inicio + fim)/2;
	        int a = A[inicio];
	        int b = A[meio];
	        int c = A[fim];
	        int medianaIndice; 
	        
	        if(a < b){
	            if(b < c){
	               
	                medianaIndice = meio;
	            }else{                
	                if(a < c){
	                    medianaIndice = fim;
	                }else{
	                   
	                    medianaIndice = inicio;
	                }
	            }
	        }else{
	            if(c < b){
	                
	                medianaIndice = meio;
	            }else{
	                if(c < a){
	                   
	                    medianaIndice = fim;
	                }else{
	                   
	                    medianaIndice = inicio;
	                }
	            }
	        }
	       
	        swap(A, medianaIndice, fim);
	        int pivo = A[fim];
	        int i = inicio - 1;
	        
	        for(int j = inicio; j <= fim - 1; j++){
	            if(A[j] <= pivo){
	                i = i + 1;
	                swap(A, i, j);
	            }
	        }
	        
	        swap(A, i + 1, fim);
	        return i + 1; 
	    }
	    
	    
	    private static void swap(int[] A, int i, int j){
	        int temp = A[i];
	        A[i] = A[j];
	        A[j] = temp; 
	    }    
	    public static void main(String []args){
	    	//int vetor[] = new int[10];
	    	int vetor [] = {33 ,44 ,55 ,77 ,95 ,99 ,22 ,25 ,41 ,66 ,88 ,89};
	    	Scanner lendo = new Scanner(System.in);
	       
	    	
	    	quicksortMedianaDeTres(vetor);
	    	System.out.print(partition(vetor,0,11));
	    	for(int i =0; i< vetor.length;i++){
	    	   System.out.print(vetor[i]);
	    	   if(i != vetor[i]-1){
	   			System.out.print(" ");
	   			}
	   			 			 
	    	}
	    	
				
			
	    	
	    	
	    }
	}
