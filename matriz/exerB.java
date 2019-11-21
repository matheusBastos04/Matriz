package matriz;
import java.util.*;
public class exerB {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		 Random g = new Random();
		 
		 int maior = 0, menor = 0, i,j,n=3,coluna=0,linha = 0,mcoluna=0,mlinha=0;
		int m[][] = new int [n][n];
		
		
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				m[i][j] = g.nextInt(10000);
				menor = m[i][j];
			}	
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				
				if(m[i][j] > maior) {
					maior = m[i][j];
					linha = i;
					coluna = j;
				}
			}		
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(m[i][j] < menor) {
					menor = m[i][j];
					mlinha = i;
					mcoluna = j;
				}
			}		
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(m[i][j]+" ");	
			}
			System.out.println("\n");
		}
		System.out.println("Maiores \n Numero: "+maior+"\n Linha: "+linha+"\n Coluna: "+coluna);
		System.out.println("Menores \n Numero: "+menor+"\n Linha: "+mlinha+"\n Coluna: "+mcoluna);
	
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
